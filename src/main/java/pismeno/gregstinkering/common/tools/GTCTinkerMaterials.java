package pismeno.gregstinkering.common.tools;

import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.traits.ITrait;
import slimeknights.tconstruct.tools.TinkerTraits;

import java.util.ArrayList;
import java.util.List;

public final class GTCTinkerMaterials {

    public static final List<Material> MATERIALS = new ArrayList<>();

    public static final Material NAQUADAH_ALLOY = registerMaterial("naquadah_alloy", TextFormatting.BLACK, TinkerTraits.magnetic2, TinkerTraits.magnetic);
    public static final Material STAINLESS_STEEL = registerMaterial("stainless_steel", TextFormatting.AQUA, TinkerTraits.sharp, TinkerTraits.stiff);
    public static final Material DAMASCUS_STEEL = registerMaterial("damascus_steel", TextFormatting.AQUA, GTCTinkerTraits.plunderous2, GTCTinkerTraits.plunderous);

    public static void init() {
        MATERIALS.forEach(GTCTinkerMaterials::setProperties);
        MATERIALS.forEach(TinkerRegistry::addMaterial);

        NAQUADAH_ALLOY.addCommonItems("NaquadahAlloy");
        TinkerRegistry.addMaterialStats(
                NAQUADAH_ALLOY,
                new HeadMaterialStats(3092, 42.0f, 17.0f, HarvestLevels.DURANIUM),
                new HandleMaterialStats(1.1f, 520),
                new ExtraMaterialStats(550),
                new BowMaterialStats(0.2f, 1.6f, 18.0f)
        );

        STAINLESS_STEEL.addCommonItems("StainlessSteel");
        TinkerRegistry.addMaterialStats(
                STAINLESS_STEEL,
                new HeadMaterialStats(980, 11.0f, 10.0f, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );

        DAMASCUS_STEEL.addCommonItems("DamascusSteel");
        TinkerRegistry.addMaterialStats(
                DAMASCUS_STEEL,
                new HeadMaterialStats(980, 11.0f, 10.0f, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );
    }

    private static Material registerMaterial(String name, TextFormatting color, ITrait traitHead, ITrait traitOther) {
        Material material = new Material(name, color);
        if (traitHead != null) material.addTrait(traitHead, "head");
        if (traitOther != null) material.addTrait(traitOther);
        MATERIALS.add(material);
        return material;
    }

    private static void addRegistries() {
        TinkerRegistry.addMaterial(NAQUADAH_ALLOY);
    }

    private static void setProperties(Material material) {
        setNotCraftable(material);
        material.setFluid(null);
    }

    private static void setNotCraftable(Material material) {
        material.setCraftable(false);
        material.setCastable(false);
    }
}
