package pismeno.gregstinkering.common.tools;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import pismeno.gregstinkering.common.tools.traits.*;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class GTCTinkerTraits {
    public static final AbstractTrait plunderous = new TraitPlunderous(1);
    public static final AbstractTrait plunderous2 = new TraitPlunderous(2);
    public static final AbstractTrait resonance = new TraitResonance();
    public static final AbstractTrait piercer = new TraitPiercer();
    public static final AbstractTrait airy = new TraitAiry();
    public static final AbstractTrait moonlit = new TraitMoonlit();

    public static void init(RegistryEvent.Register<Potion> event) {
        IForgeRegistry<Potion> registry = event.getRegistry();
        registry.registerAll(new Potion[]{TraitResonance.Resonance, TraitResonance.ResonanceTime});
    }

    GTCTinkerTraits() {
    }
}
