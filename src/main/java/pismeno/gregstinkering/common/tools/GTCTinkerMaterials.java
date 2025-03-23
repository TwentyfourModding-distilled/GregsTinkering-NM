package pismeno.gregstinkering.common.tools;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
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
    public static final Material DAMASCUS_STEEL = registerMaterial("damascus_steel", TextFormatting.DARK_GRAY, VA[LV],GTCTinkerTraits.plunderous2, GTCTinkerTraits.plunderous);
    public static final Material WROUGHT_IRON = registerMaterial("wrought_iron", TextFormatting.GRAY, VA[ULV],TinkerTraits.magnetic2, TinkerTraits.magnetic);
    public static final Material COBALT_BRASS = registerMaterial("cobalt_brass", TextFormatting.GRAY, VA[MV],GTCTinkerTraits.resonance, TinkerTraits.lightweight);
    public static final Material DURANIUM = registerMaterial("duranium", TextFormatting.DARK_AQUA, VA[UV],null, TinkerTraits.dense);
    public static final Material ROSE_GOLD = registerMaterial("rose_gold", TextFormatting.GOLD, VA[MV],null, TinkerTraits.established);
    public static final Material PLASTIC = registerMaterial("plastic", TextFormatting.GRAY, VA[MV],null, TinkerTraits.unnatural);
    public static final Material TUNGSTEN_STEEL = registerMaterial("tungsten_steel", TextFormatting.DARK_PURPLE, VA[EV], null, GTCTinkerTraits.piercer);
    public static final Material ALUMINIUM = registerMaterial("aluminium", TextFormatting.BLUE, VA[MV],TinkerTraits.sharp, TinkerTraits.lightweight);

    private static void setStats() {
        DURANIUM.addTrait(TinkerTraits.magnetic2);
        ROSE_GOLD.addTrait(TinkerTraits.stonebound);
        PLASTIC.addTrait(TinkerTraits.lightweight);
        TUNGSTEN_STEEL.addTrait(TinkerTraits.dense);

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

        TinkerRegistry.addMaterialStats(
                WROUGHT_IRON,
                new HeadMaterialStats(292, 6.0F, 4.0F, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 80),
                new ExtraMaterialStats(60),
                new BowMaterialStats(0.5f, 2.3f, 4.0f)
        );

        TinkerRegistry.addMaterialStats(
                COBALT_BRASS,
                new HeadMaterialStats(990, 12.5F, 3.8F, HarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 250),
                new ExtraMaterialStats(380),
                new BowMaterialStats(1.8f, 1.3f, 3.5f)
        );

        TinkerRegistry.addMaterialStats(
                DURANIUM,
                new HeadMaterialStats(7890, 17.5F, 17.0F, HarvestLevels.DURANIUM),
                new HandleMaterialStats(1.3f, 3000),
                new ExtraMaterialStats(2880),
                new BowMaterialStats(3.2f, 5.3f, 19.0f)
        );

        TinkerRegistry.addMaterialStats(
                ROSE_GOLD,
                new HeadMaterialStats(710, 15.5F, 7.0F, HarvestLevels.DIAMOND),
                new HandleMaterialStats(0.6f, 200),
                new ExtraMaterialStats(170),
                new BowMaterialStats(0.6f, 1.8f, 5.4f)
        );
        TinkerRegistry.addMaterialStats(
                PLASTIC,
                new HeadMaterialStats(150, 2.8F, 2.2F, HarvestLevels.STONE),
                new HandleMaterialStats(0.6f, 30),
                new ExtraMaterialStats(80),
                new BowMaterialStats(0.6f, 1.8f, 5.4f)
        );

        TinkerRegistry.addMaterialStats(
                TUNGSTEN_STEEL,
                new HeadMaterialStats(1920, 13.0F, 12.0F, HarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 700),
                new ExtraMaterialStats(600),
                new BowMaterialStats(0.8f, 2.8f, 15.8f)
        );

        TinkerRegistry.addMaterialStats(
                ALUMINIUM,
                new HeadMaterialStats(700, 2.8F, 2.2F, HarvestLevels.DIAMOND),
                new HandleMaterialStats(1.1f, 510),
                new ExtraMaterialStats(220),
                new BowMaterialStats(1.3f, 1.6f, 3.2f)
        );
    }

    private static void setRepresentatives() {
        NAQUADAH_ALLOY.addCommonItems("NaquadahAlloy");
        NAQUADAH_ALLOY.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.NaquadahAlloy));

        STAINLESS_STEEL.addCommonItems("StainlessSteel");
        STAINLESS_STEEL.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.StainlessSteel));

        DAMASCUS_STEEL.addCommonItems("DamascusSteel");
        DAMASCUS_STEEL.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.DamascusSteel));

        WROUGHT_IRON.addCommonItems("WroughtIron");
        WROUGHT_IRON.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.WroughtIron));

        COBALT_BRASS.addCommonItems("CobaltBrass");
        COBALT_BRASS.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.CobaltBrass));

        DURANIUM.addCommonItems("Duranium");
        DURANIUM.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.Duranium));

        ROSE_GOLD.addCommonItems("RoseGold");
        ROSE_GOLD.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.RoseGold));

        PLASTIC.addCommonItems("Plastic");
        PLASTIC.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.Polyethylene));

        TUNGSTEN_STEEL.addCommonItems("TungstenSteel");
        TUNGSTEN_STEEL.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.TungstenSteel));

        ALUMINIUM.addCommonItems("Aluminium");
        ALUMINIUM.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, Materials.Aluminium));
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
