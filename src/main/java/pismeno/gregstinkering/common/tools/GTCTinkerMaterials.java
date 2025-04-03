package pismeno.gregstinkering.common.tools;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import pismeno.gregstinkering.unification.GTCHarvestLevels;
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

    private GTCTinkerMaterials() {}

    public static final List<Material> MATERIALS = new ArrayList<>();
    public static final List<Material> BOWSTRING_MATERIALS = new ArrayList<>();
    public static final List<Material> FLETCHING_MATERIALS = new ArrayList<>();
    public static final Map<Material, Integer> TIER = new HashMap<>();
    public static final Map<Material, gregtech.api.unification.material.Material> ASSOCIATED = new HashMap<>();

    public static final Material NAQUADAH_ALLOY = registerMaterial("naquadah_alloy", Materials.NaquadahAlloy,TextFormatting.BLACK, VA[IV], TinkerTraits.magnetic2, TinkerTraits.magnetic);
    public static final Material STAINLESS_STEEL = registerMaterial("stainless_steel", Materials.StainlessSteel, TextFormatting.AQUA, VA[HV],TinkerTraits.sharp, TinkerTraits.stiff);
    public static final Material VANADIUM_STEEL = registerMaterial("vanadium_steel", Materials.VanadiumSteel, TextFormatting.GRAY, VA[MV],TinkerTraits.sharp, TinkerTraits.enderference);
    public static final Material DAMASCUS_STEEL = registerMaterial("damascus_steel", Materials.DamascusSteel, TextFormatting.DARK_GRAY, VA[LV],GTCTinkerTraits.plunderous2, GTCTinkerTraits.plunderous);
    public static final Material TUNGSTEN_STEEL = registerMaterial("tungsten_steel", Materials.TungstenSteel, TextFormatting.DARK_BLUE, VA[EV], null, GTCTinkerTraits.piercer);
    public static final Material RED_STEEL = registerMaterial("red_steel", Materials.RedSteel, TextFormatting.DARK_RED, VA[MV], GTCTinkerTraits.hungerbound2, GTCTinkerTraits.hungerbound);
    public static final Material BLUE_STEEL = registerMaterial("blue_steel", Materials.BlueSteel, TextFormatting.BLUE, VA[MV], TinkerTraits.freezing, TinkerTraits.aquadynamic);
    public static final Material WROUGHT_IRON = registerMaterial("wrought_iron", Materials.WroughtIron, TextFormatting.GRAY, VA[ULV],TinkerTraits.magnetic2, TinkerTraits.magnetic);
    public static final Material COBALT_BRASS = registerMaterial("cobalt_brass", Materials.CobaltBrass, TextFormatting.GRAY, VA[MV],GTCTinkerTraits.resonance, TinkerTraits.lightweight);
    public static final Material DURANIUM = registerMaterial("duranium", Materials.Duranium, TextFormatting.DARK_AQUA, VA[UV],null, TinkerTraits.dense);
    public static final Material ROSE_GOLD = registerMaterial("rose_gold", Materials.RoseGold, TextFormatting.GOLD, VA[MV],null, TinkerTraits.established);
    public static final Material POLYVINYL_CHLORIDE = registerMaterial("polyvinyl_chloride", Materials.PolyvinylChloride, TextFormatting.GRAY, VA[MV],null, TinkerTraits.unnatural);
    public static final Material ALUMINIUM = registerMaterial("aluminium", Materials.Aluminium, TextFormatting.DARK_AQUA, VA[MV],TinkerTraits.sharp, TinkerTraits.lightweight);
    public static final Material HSSE = registerMaterial("hss_e", Materials.HSSE, TextFormatting.DARK_GREEN, VA[EV],TinkerTraits.sharp, TinkerTraits.aridiculous);
    public static final Material INVAR = registerMaterial("invar", Materials.Invar, TextFormatting.DARK_GREEN, VA[ULV],TinkerTraits.stonebound, TinkerTraits.established);
    public static final Material ULTIMET = registerMaterial("ultimet", Materials.Ultimet, TextFormatting.LIGHT_PURPLE, VA[HV],GTCTinkerTraits.airy, TinkerTraits.dense);
    public static final Material STERLING_SILVER = registerMaterial("sterling_silver", Materials.SterlingSilver, TextFormatting.WHITE, VA[MV],GTCTinkerTraits.moonlit, TinkerTraits.holy);
    public static final Material TUNGSTENCARBIDE = registerMaterial("tungstencarbide", Materials.TungstenCarbide, TextFormatting.DARK_PURPLE, VA[EV],TinkerTraits.momentum, TinkerTraits.jagged);
    public static final Material NEUTRONIUM = registerMaterial("neutronium", Materials.Neutronium, TextFormatting.WHITE, VA[ZPM],GTCTinkerTraits.unbreakable, TinkerTraits.alien);
    public static final Material TITANIUM = registerMaterial("titanium", Materials.Titanium, TextFormatting.LIGHT_PURPLE, VA[HV],GTCTinkerTraits.boneshatter, GTCTinkerTraits.piercer);

    public static final Material POLYETHYLENE = registerBowstringMaterial("polyethylene", Materials.Polyethylene, TextFormatting.GRAY, VA[MV]);
    public static final Material RUBBER = registerBowstringMaterial("rubber", Materials.Rubber, TextFormatting.BLACK, VA[ULV]);
    public static final Material SYNTHETIC_RUBBER = registerBowstringMaterial("synthetic_rubber", Materials.StyreneButadieneRubber, TextFormatting.DARK_GRAY, VA[HV]);

    private static void setStats() {
        DURANIUM.addTrait(TinkerTraits.magnetic2);
        ROSE_GOLD.addTrait(TinkerTraits.stonebound);
        POLYVINYL_CHLORIDE.addTrait(TinkerTraits.lightweight);
        TUNGSTEN_STEEL.addTrait(TinkerTraits.dense);
        HSSE.addTrait(TinkerTraits.aridiculous, "head");
        ULTIMET.addTrait(TinkerTraits.dense, "head");
        NEUTRONIUM.addTrait(TinkerTraits.alien, "head");
        NEUTRONIUM.addTrait(TinkerTraits.magnetic2, "head");
        NEUTRONIUM.addTrait(TinkerTraits.magnetic2);

        FLETCHING_MATERIALS.add(POLYETHYLENE);
        FLETCHING_MATERIALS.add(RUBBER);
        FLETCHING_MATERIALS.add(SYNTHETIC_RUBBER);

        TinkerRegistry.addMaterialStats(
                NAQUADAH_ALLOY,
                new HeadMaterialStats(3092, 42.0f, 14.0f, GTCHarvestLevels.DURANIUM),
                new HandleMaterialStats(1.1f, 520),
                new ExtraMaterialStats(550),
                new BowMaterialStats(0.2f, 1.6f, 18.0f)
        );

        TinkerRegistry.addMaterialStats(
                STAINLESS_STEEL,
                new HeadMaterialStats(980, 11.0f, 8.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.8f, 2.3f, 12.0f)
        );

        TinkerRegistry.addMaterialStats(
                VANADIUM_STEEL,
                new HeadMaterialStats(1470, 6.0f, 6.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.7f, 330),
                new ExtraMaterialStats(350),
                new BowMaterialStats(0.3f, 1.1f, 3.0f)
        );

        TinkerRegistry.addMaterialStats(
                DAMASCUS_STEEL,
                new HeadMaterialStats(980, 11.0f, 8.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );

        TinkerRegistry.addMaterialStats(
                TUNGSTEN_STEEL,
                new HeadMaterialStats(1920, 13.0F, 10.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 700),
                new ExtraMaterialStats(600),
                new BowMaterialStats(0.8f, 2.8f, 15.8f)
        );

        TinkerRegistry.addMaterialStats(
                RED_STEEL,
                new HeadMaterialStats(2300, 10.0F, 9.0F, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(1.1f, 900),
                new ExtraMaterialStats(660),
                new BowMaterialStats(1.0f, 0.95f, 7.0f)
        );

        TinkerRegistry.addMaterialStats(
                BLUE_STEEL,
                new HeadMaterialStats(1064, 17.0F, 9.0F, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(1.3f, 590),
                new ExtraMaterialStats(440),
                new BowMaterialStats(2.0f, 1.1f, 9.0f)
        );

        TinkerRegistry.addMaterialStats(
                WROUGHT_IRON,
                new HeadMaterialStats(292, 6.0F, 4.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 80),
                new ExtraMaterialStats(60),
                new BowMaterialStats(0.5f, 2.3f, 4.0f)
        );

        TinkerRegistry.addMaterialStats(
                COBALT_BRASS,
                new HeadMaterialStats(990, 12.5F, 3.8F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 250),
                new ExtraMaterialStats(380),
                new BowMaterialStats(1.8f, 1.3f, 3.5f)
        );

        TinkerRegistry.addMaterialStats(
                DURANIUM,
                new HeadMaterialStats(7890, 17.5F, 17.0F, GTCHarvestLevels.DURANIUM),
                new HandleMaterialStats(1.3f, 3000),
                new ExtraMaterialStats(2880),
                new BowMaterialStats(3.2f, 5.3f, 19.0f)
        );

        TinkerRegistry.addMaterialStats(
                ROSE_GOLD,
                new HeadMaterialStats(710, 15.5F, 6.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.6f, 200),
                new ExtraMaterialStats(170),
                new BowMaterialStats(0.6f, 1.8f, 5.4f)
        );
        TinkerRegistry.addMaterialStats(
                POLYVINYL_CHLORIDE,
                new HeadMaterialStats(190, 2.8F, 2.2F, GTCHarvestLevels.STONE),
                new HandleMaterialStats(0.6f, 60),
                new ExtraMaterialStats(120),
                new BowMaterialStats(0.7f, 0.7f, 3.4f)
        );

        TinkerRegistry.addMaterialStats(
                ALUMINIUM,
                new HeadMaterialStats(700, 2.8F, 10.2F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(1.1f, 510),
                new ExtraMaterialStats(220),
                new BowMaterialStats(1.3f, 1.6f, 3.2f)
        );

        TinkerRegistry.addMaterialStats(
                HSSE,
                new HeadMaterialStats(2890, 8.8F, 12.2F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(1.1f, 1210),
                new ExtraMaterialStats(1100),
                new BowMaterialStats(1.1f, 1.2f, 18.1f)
        );

        TinkerRegistry.addMaterialStats(
                INVAR,
                new HeadMaterialStats(364, 8.1F, 5.9F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.6f, 110),
                new ExtraMaterialStats(100),
                new BowMaterialStats(1.2f, 0.9f, 5.7f)
        );

        TinkerRegistry.addMaterialStats(
                ULTIMET,
                new HeadMaterialStats(1800, 14.0F, 11.1F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 900),
                new ExtraMaterialStats(700),
                new BowMaterialStats(1.0f, 1.7f, 11.1f)
        );

        TinkerRegistry.addMaterialStats(
                STERLING_SILVER,
                new HeadMaterialStats(730, 5.0F, 7.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.95f, 110),
                new ExtraMaterialStats(220),
                new BowMaterialStats(1.25f, 2.7f, 12.0f)
        );

        TinkerRegistry.addMaterialStats(
                TUNGSTENCARBIDE,
                new HeadMaterialStats(820, 60.0F, 5.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.95f, 110),
                new ExtraMaterialStats(220),
                new BowMaterialStats(5.25f, 8.7f, 4.0f)
        );

        TinkerRegistry.addMaterialStats(
                NEUTRONIUM,
                new HeadMaterialStats(10000, 180.0F, 100.0F, GTCHarvestLevels.NEUTRONIUM),
                new HandleMaterialStats(10.0f, 10000),
                new ExtraMaterialStats(10000),
                new BowMaterialStats(15.0f, 20.5f, 125.0f)
        );

        TinkerRegistry.addMaterialStats(
                TITANIUM,
                new HeadMaterialStats(1476, 10.0F, 9.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(1.1f, 577),
                new ExtraMaterialStats(530),
                new BowMaterialStats(1.8f, 3.3f, 14.0f)
        );

        TinkerRegistry.addMaterialStats(
                POLYETHYLENE,
                new BowStringMaterialStats(1.4F),
                new FletchingMaterialStats(1.2F, 1.7F)
        );

        TinkerRegistry.addMaterialStats(
                RUBBER,
                new BowStringMaterialStats(1.0F),
                new FletchingMaterialStats(1.0F, 1.8F)
        );

        TinkerRegistry.addMaterialStats(
                SYNTHETIC_RUBBER,
                new BowStringMaterialStats(1.3F),
                new FletchingMaterialStats(1.2F, 1.8F)
        );
    }

    private static void setRepresentativesAll() {
        setRepresentatives("NaquadahAlloy", NAQUADAH_ALLOY, false);
        setRepresentatives("StainlessSteel", STAINLESS_STEEL, false);
        setRepresentatives("VanadiumSteel", VANADIUM_STEEL, false);
        setRepresentatives("DamascusSteel", DAMASCUS_STEEL, false);
        setRepresentatives("TungstenSteel", TUNGSTEN_STEEL, false);
        setRepresentatives("RedSteel", RED_STEEL, false);
        setRepresentatives("BlueSteel", BLUE_STEEL, false);
        setRepresentatives("WroughtIron", WROUGHT_IRON, false);
        setRepresentatives("CobaltBrass", COBALT_BRASS, false);
        setRepresentatives("Duranium", DURANIUM, false);
        setRepresentatives("RoseGold", ROSE_GOLD, false);
        setRepresentatives("PolyvinylChloride", POLYVINYL_CHLORIDE, false);
        setRepresentatives("Aluminium", ALUMINIUM, false);
        setRepresentatives("Hsse", HSSE, false);
        setRepresentatives("Invar", INVAR, false);
        setRepresentatives("Ultimet", ULTIMET, false);
        setRepresentatives("SterlingSilver", STERLING_SILVER, false);
        setRepresentatives("TungstenCarbide", TUNGSTENCARBIDE, false);
        setRepresentatives("Neutronium", NEUTRONIUM, false);
        setRepresentatives("Titanium", TITANIUM, false);
        setRepresentatives("Plastic", POLYETHYLENE, true);
        setRepresentatives("Rubber", RUBBER, true);
        setRepresentatives("StyreneButadieneRubber", SYNTHETIC_RUBBER, true);
    }

    public static void preInit() {
        MATERIALS.forEach(TinkerRegistry::addMaterial);
        BOWSTRING_MATERIALS.forEach(TinkerRegistry::addMaterial);
        setStats();
    }

    public static void init() {
        setRepresentativesAll();
        MATERIALS.forEach(GTCTinkerMaterials::setProperties);
        BOWSTRING_MATERIALS.forEach(GTCTinkerMaterials::setProperties);
    }

    private static void setProperties(Material material) {
        setNotCraftable(material);
    }

    private static void setNotCraftable(Material material) {
        material.setCraftable(false);
        material.setCastable(false);
    }

    private static Material registerMaterial(String name, gregtech.api.unification.material.Material gtMaterial, TextFormatting color, int tier, ITrait traitHead, ITrait traitOther) {
        Material tcMaterial = new Material(name, color);

        if (traitHead != null) tcMaterial.addTrait(traitHead, "head");
        if (traitOther != null) tcMaterial.addTrait(traitOther);
        MATERIALS.add(tcMaterial);
        TIER.put(tcMaterial, tier);
        ASSOCIATED.put(tcMaterial, gtMaterial);

        return tcMaterial;
    }

    private static Material registerBowstringMaterial(String name, gregtech.api.unification.material.Material gtMaterial, TextFormatting color, int tier) {
        Material tcMaterial = new Material(name, color);

        BOWSTRING_MATERIALS.add(tcMaterial);
        TIER.put(tcMaterial, tier);
        ASSOCIATED.put(tcMaterial, gtMaterial);

        return tcMaterial;
    }
 private static void setRepresentatives(String oreDictSuffix, Material tcMaterial, boolean isBowstring) {
     gregtech.api.unification.material.Material gtMaterial = ASSOCIATED.get(tcMaterial);

        tcMaterial.addCommonItems(oreDictSuffix);
        if (isBowstring) {
            tcMaterial.addItem("foil" + oreDictSuffix);
            tcMaterial.setRepresentativeItem(OreDictUnifier.get(OrePrefix.foil, gtMaterial));
        } else {
            tcMaterial.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, gtMaterial));
        }
        tcMaterial.setFluid(gtMaterial.getFluid());
    }
}
