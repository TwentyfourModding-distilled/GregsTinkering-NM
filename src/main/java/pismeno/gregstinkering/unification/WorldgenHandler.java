package pismeno.gregstinkering.unification;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

import net.minecraftforge.fml.common.Loader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;

import gregtech.api.GTValues;
import gregtech.api.worldgen.config.BedrockFluidDepositDefinition;
import gregtech.api.worldgen.config.OreDepositDefinition;
import gregtech.api.worldgen.config.WorldGenRegistry;
import pismeno.gregstinkering.GregsTinkering;
import pismeno.gregstinkering.Tags;

/////////////////////////////////////////////////////////
/// This code is made by TekCay
/// Thanks to Tech22
/////////////////////////////////////////////////////////
/// https://github.com/GregTechCEu/gregicality-multiblocks/blob/worldgen-example/src/main/java/gregicality/machines/api/worldgen/GCYMWorldGenRegistry.java
/////////////////////////////////////////////////////////
/// https://github.com/tekcay/tekcays_addon/blob/master/src/main/resources/assets/tkcya/.tkcyaassetsroot
/////////////////////////////////////////////////////////

public class WorldgenHandler {

    public static final WorldgenHandler INSTANCE = new WorldgenHandler();
    private static final String VEIN_PATH = "/assets/gregstinkering/worldgen/vein";
    private static final String FLUID_PATH = "/assets/gregstinkering/worldgen/fluid";

    private static final Path configPath = Loader.instance().getConfigDir().toPath().resolve(GTValues.MODID);
    private static final Path TKCYA_CONFIG_PATH = Loader.instance().getConfigDir().toPath().resolve(Tags.MODID);

    private static final List<String> DIMENSIONS = new ArrayList<String>() {

        {
            add("overworld");
            add("nether");
            add("end");
        }
    };

    private static final Path worldgenRootPath = configPath.resolve("worldgen");
    private static final Path tkcyaWorldgenRootPath = TKCYA_CONFIG_PATH.resolve("worldgen");
    private static final Path oreVeinRootPath = tkcyaWorldgenRootPath.resolve("vein");
    private static final Path bedrockFluidVeinRootPath = tkcyaWorldgenRootPath.resolve("fluid");
    private static Path oreVeinJarRootPath;
    private static Path bedrockFluidJarRootPath;

    private static final Map<Path, List<Path>> oreVeinsToAdd = new HashMap<>();
    private static final Map<Path, List<String>> fluidVeinsToAdd = new HashMap<>();
    private static final Path DUMMY_FILE_PATH = TKCYA_CONFIG_PATH.resolve("worldgen").resolve("deleteToReset");

    private WorldgenHandler() {}

    public static void init() {
        boolean doesDummyFileExist = WorldgenHandler.INSTANCE.doesDummyFileExist();

        try {
            if (!doesDummyFileExist) {
                WorldgenHandler.INSTANCE.addRemoveVeins();
                WorldgenHandler.INSTANCE.createDummyFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean doesDummyFileExist() {
        return Files.exists(DUMMY_FILE_PATH);
    }

    public void createDummyFile() throws IOException {
        Files.createDirectories(DUMMY_FILE_PATH.getParent());
        Files.createFile(DUMMY_FILE_PATH);
    }

    public void addRemoveVeins() throws IOException {
        GregsTinkering.LOGGER.info("Vein Size Before Addition: " + WorldGenRegistry.getOreDeposits().size());
        GregsTinkering.LOGGER.info("Fluid Vein Size Before Addition: " + WorldGenRegistry.getBedrockVeinDeposits().size());

        this.removeAllVeins(worldgenRootPath);

        setPathAndExtractDefinitions();

        try {
            WorldGenRegistry.INSTANCE.reinitializeRegisteredVeins();
        } catch (IOException e) {
            e.printStackTrace();
        }

        GregsTinkering.LOGGER.info("Vein Size After Addition: " + WorldGenRegistry.getOreDeposits().size());
        GregsTinkering.LOGGER.info("Fluid Vein Size After Addition: " + WorldGenRegistry.getBedrockVeinDeposits().size());
    }

    public void addVeins() {
        oreVeinsToAdd.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(vein -> WorldGenRegistry.INSTANCE
                        .addVeinDefinitions(new OreDepositDefinition(vein.toString())));
    }

    public void addFluidVeins() {
        fluidVeinsToAdd.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(vein -> WorldGenRegistry.INSTANCE.addVeinDefinitions(new BedrockFluidDepositDefinition(vein)));
    }

    public void removeAllVeins(Path worldgenRootPath) {
        DIMENSIONS.forEach(dimension -> {
            try {
                FileUtils.forceDelete(new File(worldgenRootPath.resolve("vein").resolve(dimension).toUri()));
            } catch (IOException e) {
                GregsTinkering.LOGGER.info("Directory {} already removed", dimension);
            }
        });
    }

    private static void setPathAndExtractDefinitions() {
        FileSystem zipFileSystem = null;

        try {
            URI sampleUri = WorldgenHandler.class.getResource("/assets/gregstinkering/.gregstinkeringassetsroot").toURI();

            if (sampleUri.getScheme().equals("jar") || sampleUri.getScheme().equals("zip")) {
                zipFileSystem = FileSystems.newFileSystem(sampleUri, Collections.emptyMap());
                oreVeinJarRootPath = zipFileSystem.getPath(VEIN_PATH);
                bedrockFluidJarRootPath = zipFileSystem.getPath(FLUID_PATH);
            } else if (sampleUri.getScheme().equals("file")) {
                oreVeinJarRootPath = Paths.get(WorldgenHandler.class.getResource(VEIN_PATH).toURI());
                bedrockFluidJarRootPath = Paths.get(WorldgenHandler.class.getResource(FLUID_PATH).toURI());
            } else {
                throw new IllegalStateException(
                        "Unable to locate absolute path to Greg's Tinkering worldgen root directory: " + sampleUri);
            }

            extractVeinDefinitionsFromJar(oreVeinJarRootPath, oreVeinRootPath, "vein");
            extractVeinDefinitionsFromJar(bedrockFluidJarRootPath, bedrockFluidVeinRootPath, "fluid");

        } catch (URISyntaxException | IOException impossible) {
            // this is impossible, since getResource always returns valid URI
            throw new RuntimeException(impossible);
        } finally {
            if (zipFileSystem != null) {
                // close zip file system to avoid issues
                IOUtils.closeQuietly(zipFileSystem);
            }
        }
    }

    private static void extractVeinDefinitionsFromJar(Path jarRootPath, Path rootPath, String type) throws IOException {
        GregsTinkering.LOGGER.info("Attempting retrieval of standard Greg's Tinkering worldgen definitions from {} to {}",
                jarRootPath, rootPath);

        List<Path> jarFiles = getJarPathList(jarRootPath);
        extractAndCopy(jarFiles, type);

        GregsTinkering.LOGGER.info("Retrieved {} builtin Greg's Tinkering worldgen {} definitions", jarFiles.size(), type);
    }

    private static List<Path> getJarPathList(Path assetPath) throws IOException {
        return Files.walk(assetPath)
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());
    }

    private static void extractAndCopy(List<Path> paths, String type) throws RuntimeException {
        paths.forEach(jarFile -> {
            oreVeinsToAdd.computeIfAbsent(jarFile.getParent(), k -> new ArrayList<>());

            Path name = oreVeinJarRootPath.getParent().relativize(jarFile);
            name = getActualVeinName(name);
            oreVeinsToAdd.get(jarFile.getParent()).add(name);

            try {
                Files.createDirectories(worldgenRootPath.resolve(name.getParent()));
                Files.copy(jarFile, worldgenRootPath.resolve(name), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @NotNull
    private static Path getActualVeinName(@NotNull Path path) {
        // String separator = FileSystems.getDefault().getSeparator(); !!!! Works on Linux, on Windows it returns <\>
        // !!!!

        String separator = System.getProperty("os.name").contains("Windows") ? "/" :
                FileSystems.getDefault().getSeparator();
        String[] split = path.toString().split("/");

        StringBuilder stringBuilder = new StringBuilder();

        Arrays.asList(split).forEach(part -> stringBuilder.append(part).append(separator));

        return Paths.get(stringBuilder.toString());
    }
}