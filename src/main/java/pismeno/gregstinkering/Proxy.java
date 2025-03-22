package pismeno.gregstinkering;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public class Proxy {
    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {

    }
}