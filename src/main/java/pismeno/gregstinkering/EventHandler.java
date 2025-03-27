package pismeno.gregstinkering;

import gregtech.api.unification.material.event.MaterialEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pismeno.gregstinkering.common.tools.GTCGregtechMaterials;

@Mod.EventBusSubscriber(modid = Tags.MODID)
public final class EventHandler {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onMaterialRegistration(MaterialEvent event) {
        GTCGregtechMaterials.init();
    }
}
