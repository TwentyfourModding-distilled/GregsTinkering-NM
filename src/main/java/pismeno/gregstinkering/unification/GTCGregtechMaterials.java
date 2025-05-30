package pismeno.gregstinkering.unification;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.Element;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.MaterialToolProperty;
import gregtech.api.unification.material.properties.ToolProperty;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.ResourceLocation;
import pismeno.gregstinkering.Tags;

import java.util.HashMap;
import java.util.Map;

import static gregtech.api.unification.Elements.add;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public final class GTCGregtechMaterials {

    private GTCGregtechMaterials() {}

    public static final Element Ad = add(6, 9, -1, null, "Ardite", "Ad", false);

    public static Material Ardite;
    public static Material Manyullyn;
    public static Material PigIron;

    private static final Map<Material, OrePrefix[]> ignoredItems = new HashMap<>();

    public static void init() {

        Ardite = new Material.Builder(24000, new ResourceLocation(Tags.MODID,"ardite"))
                .ingot(3)
                .liquid(new FluidBuilder())
                .ore()
                .color(0xD34117).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_BOLT_SCREW, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, EXCLUDE_PLATE_COMPRESSOR_RECIPE)
                .element(Ad)
                .toolStats(new MaterialToolProperty(0.5F, 0.6F, 1810, 4))
                .build();


        Manyullyn = new Material.Builder(24001, new ResourceLocation(Tags.MODID,"manyullyn"))
                .ingot(3)
                .liquid(new FluidBuilder())
                .color(0x8058B5).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_BOLT_SCREW,
                        EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, EXCLUDE_PLATE_COMPRESSOR_RECIPE)
                .components(Cobalt, 1, Ardite, 1)
                .toolStats(new MaterialToolProperty(4.02F, 5.72F, 700, 4))
                .build();

        PigIron = new Material.Builder(24002, new ResourceLocation(Tags.MODID,"pigiron"))
                .ingot()
                .liquid(new FluidBuilder().temperature(1666))
                .color(0xF0A8A4).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_BOLT_SCREW,
                        EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, EXCLUDE_PLATE_COMPRESSOR_RECIPE)
                .components(Hydrogen, 72, Oxygen, 63, Aluminium, 18, Silicon, 18, Iron, 5)
                .toolStats(new MaterialToolProperty(1.0F, 1.5F, 430, 2))
                .build();

        ignoredItems.put(Ardite, new OrePrefix[]{ingot, block, nugget});
        ignoredItems.put(Manyullyn, new OrePrefix[]{ingot, block, nugget});
        ignoredItems.put(PigIron, new OrePrefix[]{ingot, block, nugget});
        ignoredItems.put(Cobalt, new OrePrefix[]{ingot, block, nugget});

        for (Map.Entry<Material, OrePrefix[]> entry : ignoredItems.entrySet()) {
            Material material = entry.getKey();
            OrePrefix[] prefixes = entry.getValue();

            for (OrePrefix prefix : prefixes) {
                prefix.setIgnored(material);
            }
        }
    }
}