package pismeno.gregstinkering.common.tools;

import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import pismeno.gregstinkering.GregsTinkering;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.traits.ITrait;
import slimeknights.tconstruct.tools.TinkerTraits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gregtech.api.GTValues.*;

public final class GTCTinkerMaterials {

    public static final List<Material> MATERIALS = new ArrayList<>();
    public static final Map<Material, Integer> TIER = new HashMap<>();

    public static final Material NAQUADAH_ALLOY = registerMaterial("naquadah_alloy",TextFormatting.BLACK, VA[IV], TinkerTraits.magnetic2, TinkerTraits.magnetic);
    public static final Material STAINLESS_STEEL = registerMaterial("stainless_steel", TextFormatting.AQUA, VA[HV],TinkerTraits.sharp, TinkerTraits.stiff);
    public static final Material DAMASCUS_STEEL = registerMaterial("damascus_steel", TextFormatting.BLACK, VA[LV],GTCTinkerTraits.plunderous2, GTCTinkerTraits.plunderous);

    private static void setStats() {
        TinkerRegistry.addMaterialStats(
                NAQUADAH_ALLOY,
                new HeadMaterialStats(3092, 42.0f, 17.0f, HarvestLevels.DURANIUM),
                new HandleMaterialStats(1.1f, 520),
                new ExtraMaterialStats(550),
                new BowMaterialStats(0.2f, 1.6f, 18.0f)
        );

        TinkerRegistry.addMaterialStats(
                STAINLESS_STEEL,
                new HeadMaterialStats(980, 11.0f, 10.0f, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );

        TinkerRegistry.addMaterialStats(
                DAMASCUS_STEEL,
                new HeadMaterialStats(980, 11.0f, 10.0f, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );
    }

    private static void setRepresentatives() {
        NAQUADAH_ALLOY.addCommonItems("NaquadahAlloy");
        NAQUADAH_ALLOY.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.NaquadahAlloy));

        STAINLESS_STEEL.addCommonItems("StainlessSteel");
        STAINLESS_STEEL.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.StainlessSteel));

        DAMASCUS_STEEL.addCommonItems("DamascusSteel");
        DAMASCUS_STEEL.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.DamascusSteel));
    }

    public static void preInit() {
        MATERIALS.forEach(TinkerRegistry::addMaterial);
        setStats();
    }

    public static void init() {
        setRepresentatives();
        MATERIALS.forEach(GTCTinkerMaterials::setProperties);
    }

    private static void setProperties(Material material) {
        setNotCraftable(material);
        material.setFluid(null);
    }

    private static void setNotCraftable(Material material) {
        material.setCraftable(false);
        material.setCastable(false);
    }

    private static Material registerMaterial(String name, TextFormatting color, int tier, ITrait traitHead, ITrait traitOther) {
        Material material = new Material(name, color);

        if (traitHead != null) material.addTrait(traitHead, "head");
        if (traitOther != null) material.addTrait(traitOther);
        MATERIALS.add(material);
        TIER.put(material, tier);
        return material;
    }
}
