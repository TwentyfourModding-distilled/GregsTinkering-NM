package pismeno.gregstinkering.common.tools;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.Element;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.util.ResourceLocation;
import pismeno.gregstinkering.Tags;

import static gregtech.api.unification.Elements.add;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTCGregtechMaterials {

    public static final Element Ad = add(120, 180, 3600, null, "Ardite", "Ad", false);

    public static Material Ardite;
    public static Material Manyullyn;

    public static void init() {
        Ardite = new Material.Builder(24000, new ResourceLocation(Tags.MODID,"ardite"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(2284))
                .ore()
                .color(0xD34117).iconSet(METALLIC)
                .flags()
                .element(Ad)
                .toolStats(ToolProperty.Builder.of(3.5F, 3.6F, 890, 4).build())
                .blast(1780)
                .build();

        Manyullyn = new Material.Builder(24001, new ResourceLocation(Tags.MODID,"ardite"))
                .ingot(3)
                .liquid(new FluidBuilder().temperature(2026))
                .ore()
                .color(0xa242d4).iconSet(SHINY)
                .flags()
                .components(Materials.Cobalt, 1, Ardite, 1)
                .toolStats(ToolProperty.Builder.of(7.02F, 8.72F, 820, 4).build())
                .blast(1780)
                .build();
    }
}
