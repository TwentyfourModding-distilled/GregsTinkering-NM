package pismeno.gregstinkering.unification;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pismeno.gregstinkering.Tags;

import java.io.File;

public class Config {
    public static Configuration config;

    public static boolean doOverrideTconstructConfig = true;

    public static void update(File file) {

        String category;

        category = "general";
        config = new Configuration(file);
        config.addCustomCategoryComment(category, "General settings");
        doOverrideTconstructConfig = config.getBoolean("overrideTConstructConfig", category, doOverrideTconstructConfig, "If true, overrides Tinker's Construct config (Disables Cobald and Ardite TConstruct ore gen, sets ore melting duplication to 1.0");
        config.save();
    }

    public static void preInit(FMLPreInitializationEvent event) {
        File config;

        config = new File(event.getModConfigurationDirectory() + "/" + Tags.MODID);
        config.mkdirs();
        update(new File(config.getPath(), Tags.MODID + ".cfg"));
    }
}
