package pismeno.gregstinkering;

import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pismeno.gregstinkering.common.recipes.MachineRecipes;
import pismeno.gregstinkering.common.tools.*;
import pismeno.gregstinkering.unification.GTCMetaItems;
import pismeno.gregstinkering.unification.GTCHarvestLevels;
import pismeno.gregstinkering.unification.WorldgenHandler;

import java.io.IOException;

@Mod(
        modid = Tags.MODID,
        version = Tags.VERSION,
        name = Tags.MODNAME,
        acceptedMinecraftVersions = "[1.12.2]",
        dependencies =  "required-after:gregtech;" +
                        "required-after:tconstruct"
)
public class GregsTinkering {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Greg is trying to find a new hobby...");

        GTCHarvestLevels.preInit();
        GTCTinkerMaterials.preInit();
        GTCMetaItems.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        boolean doesDummyFileExist = WorldgenHandler.INSTANCE.doesDummyFileExist();
        GTCTinkerMaterials.init();

        try {
            if (!doesDummyFileExist) {
                WorldgenHandler.INSTANCE.addRemoveVeins();
                WorldgenHandler.INSTANCE.createDummyFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MachineRecipes.init();

        LOGGER.info("He found a new hobby: " + Tags.MODID + ":" + Tags.VERSION + "!");
    }

    @SubscribeEvent
    public void registerPotions(RegistryEvent.Register<Potion> event) {
        GTCTinkerTraits.init(event);
    }
}
