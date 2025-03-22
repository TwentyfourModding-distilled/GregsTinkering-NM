package pismeno.gregstinkering;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pismeno.gregstinkering.common.tools.GTCMetaItems;
import pismeno.gregstinkering.common.tools.GregtechMaterials;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class GregsTinkering {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc. (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        // register to the event bus so that we can listen to events
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("I am " + Tags.MODNAME + " + at version " + Tags.VERSION);
        GregtechMaterials.init(event);
        GTCMetaItems.init();
    }



    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
    }
}
