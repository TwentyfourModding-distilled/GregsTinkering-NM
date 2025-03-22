package pismeno.gregstinkering;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pismeno.gregstinkering.common.tools.GTCMetaItems;
import pismeno.gregstinkering.common.tools.GTCTinkerMaterials;
import pismeno.gregstinkering.common.tools.HarvestLevels;
import pismeno.gregstinkering.recipes.MachineRecipes;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class GregsTinkering {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Greg is trying to find a new hobby...");

        HarvestLevels.init();
        GTCTinkerMaterials.init();
        GTCMetaItems.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MachineRecipes.init();
        LOGGER.info("He found a new hobby: " + Tags.MODID + ":" + Tags.VERSION + "!");
    }
}
