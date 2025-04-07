package pismeno.gregstinkering.common.tools;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.blocks.wood.BlockGregPlanks;
import net.minecraft.util.text.TextFormatting;
import pismeno.gregstinkering.Utils;
import pismeno.gregstinkering.Config;
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
    public static final Map<Material, Boolean> IS_ENABLED = new HashMap<>();

    public static final Material TREATED_WOOD = new Material("treated_wood", 9332251);
    public static final Material NAQUADAH_ALLOY = addMaterial("naquadah_alloy", Materials.NaquadahAlloy,TextFormatting.BLACK, VA[IV], TinkerTraits.magnetic2, TinkerTraits.magnetic, Config.NAQUADAH_ALLOY);
    public static final Material STAINLESS_STEEL = addMaterial("stainless_steel", Materials.StainlessSteel, TextFormatting.AQUA, VA[HV],TinkerTraits.sharp, TinkerTraits.stiff, Config.STAINLESS_STEEL);
    public static final Material VANADIUM_STEEL = addMaterial("vanadium_steel", Materials.VanadiumSteel, TextFormatting.GRAY, VA[MV],TinkerTraits.sharp, TinkerTraits.enderference, Config.VANADIUM_STEEL);
    public static final Material DAMASCUS_STEEL = addMaterial("damascus_steel", Materials.DamascusSteel, TextFormatting.DARK_GRAY, VA[LV],GTCTinkerTraits.plunderous2, GTCTinkerTraits.plunderous, Config.DAMASCUS_STEEL);
    public static final Material TUNGSTEN_STEEL = addMaterial("tungsten_steel", Materials.TungstenSteel, TextFormatting.DARK_BLUE, VA[EV], null, GTCTinkerTraits.piercer, Config.TUNGSTEN_STEEL);
    public static final Material RED_STEEL = addMaterial("red_steel", Materials.RedSteel, TextFormatting.DARK_RED, VA[MV], GTCTinkerTraits.hungerbound2, GTCTinkerTraits.hungerbound, Config.RED_STEEL);
    public static final Material BLUE_STEEL = addMaterial("blue_steel", Materials.BlueSteel, TextFormatting.BLUE, VA[MV], TinkerTraits.freezing, TinkerTraits.aquadynamic, Config.BLUE_STEEL);
    public static final Material WROUGHT_IRON = addMaterial("wrought_iron", Materials.WroughtIron, TextFormatting.GRAY, VA[ULV],TinkerTraits.magnetic2, TinkerTraits.magnetic, Config.WROUGHT_IRON);
    public static final Material COBALT_BRASS = addMaterial("cobalt_brass", Materials.CobaltBrass, TextFormatting.GRAY, VA[MV],GTCTinkerTraits.resonance, TinkerTraits.lightweight, Config.COBALT_BRASS);
    public static final Material DURANIUM = addMaterial("duranium", Materials.Duranium, TextFormatting.DARK_AQUA, VA[UV],null, TinkerTraits.dense, Config.DURANIUM);
    public static final Material ROSE_GOLD = addMaterial("rose_gold", Materials.RoseGold, TextFormatting.GOLD, VA[MV],null, TinkerTraits.established, Config.ROSE_GOLD);
    public static final Material POLYVINYL_CHLORIDE = addMaterial("polyvinyl_chloride", Materials.PolyvinylChloride, TextFormatting.GRAY, VA[MV],null, TinkerTraits.unnatural, Config.POLYVINYL_CHLORIDE);
    public static final Material ALUMINIUM = addMaterial("aluminium", Materials.Aluminium, TextFormatting.DARK_AQUA, VA[MV],TinkerTraits.sharp, TinkerTraits.lightweight, Config.ALUMINIUM);
    public static final Material HSSE = addMaterial("hss_e", Materials.HSSE, TextFormatting.DARK_GREEN, VA[EV],TinkerTraits.sharp, TinkerTraits.aridiculous, Config.HSSE);
    public static final Material INVAR = addMaterial("invar", Materials.Invar, TextFormatting.DARK_GREEN, VA[ULV],TinkerTraits.stonebound, TinkerTraits.established, Config.INVAR);
    public static final Material ULTIMET = addMaterial("ultimet", Materials.Ultimet, TextFormatting.LIGHT_PURPLE, VA[HV],GTCTinkerTraits.airy, TinkerTraits.dense, Config.ULTIMET);
    public static final Material STERLING_SILVER = addMaterial("sterling_silver", Materials.SterlingSilver, TextFormatting.WHITE, VA[MV],GTCTinkerTraits.moonlit, TinkerTraits.holy, Config.STERLING_SILVER);
    public static final Material TUNGSTENCARBIDE = addMaterial("tungstencarbide", Materials.TungstenCarbide, TextFormatting.DARK_PURPLE, VA[EV],TinkerTraits.momentum, TinkerTraits.jagged, Config.TUNGSTENCARBIDE);
    public static final Material NEUTRONIUM = addMaterial("neutronium", Materials.Neutronium, TextFormatting.WHITE, VA[ZPM],GTCTinkerTraits.unbreakable, TinkerTraits.alien, Config.NEUTRONIUM);
    public static final Material TITANIUM = addMaterial("titanium", Materials.Titanium, TextFormatting.LIGHT_PURPLE, VA[HV],GTCTinkerTraits.boneshatter, GTCTinkerTraits.piercer, Config.TITANIUM);

    public static final Material POLYETHYLENE = addBowstringMaterial("polyethylene", Materials.Polyethylene, TextFormatting.GRAY, VA[MV], Config.POLYETHYLENE);
    public static final Material RUBBER = addBowstringMaterial("rubber", Materials.Rubber, TextFormatting.BLACK, VA[ULV], Config.RUBBER);
    public static final Material SYNTHETIC_RUBBER = addBowstringMaterial("synthetic_rubber", Materials.StyreneButadieneRubber, TextFormatting.DARK_GRAY, VA[HV], Config.SYNTHETIC_RUBBER);

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
        TREATED_WOOD.addTrait(TinkerTraits.ecological);

        if (Config.POLYETHYLENE) FLETCHING_MATERIALS.add(POLYETHYLENE);
        if (Config.RUBBER) FLETCHING_MATERIALS.add(RUBBER);
        if (Config.SYNTHETIC_RUBBER) FLETCHING_MATERIALS.add(SYNTHETIC_RUBBER);

        if (Config.TREATED_WOOD) TinkerRegistry.addMaterialStats(TREATED_WOOD,
                new HeadMaterialStats(40, 2.0f, 2.0f, GTCHarvestLevels.STONE),
                new HandleMaterialStats(1.0f, 35),
                new ExtraMaterialStats(20),
                new BowMaterialStats(1.0f, 1.0f, 0.0f)
        );

        if (Config.NAQUADAH_ALLOY) TinkerRegistry.addMaterialStats(NAQUADAH_ALLOY,
                new HeadMaterialStats(3092, 42.0f, 14.0f, GTCHarvestLevels.DURANIUM),
                new HandleMaterialStats(1.1f, 520),
                new ExtraMaterialStats(550),
                new BowMaterialStats(0.2f, 1.6f, 18.0f)
        );

        if (Config.STAINLESS_STEEL) TinkerRegistry.addMaterialStats(STAINLESS_STEEL,
                new HeadMaterialStats(980, 11.0f, 8.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.8f, 2.3f, 12.0f)
        );

        if (Config.VANADIUM_STEEL) TinkerRegistry.addMaterialStats(VANADIUM_STEEL,
                new HeadMaterialStats(1470, 6.0f, 6.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.7f, 330),
                new ExtraMaterialStats(350),
                new BowMaterialStats(0.3f, 1.1f, 3.0f)
        );

        if (Config.DAMASCUS_STEEL) TinkerRegistry.addMaterialStats(DAMASCUS_STEEL,
                new HeadMaterialStats(980, 11.0f, 8.0f, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(0.9f, 200),
                new ExtraMaterialStats(320),
                new BowMaterialStats(0.5f, 2.3f, 12.0f)
        );

        if (Config.TUNGSTEN_STEEL) TinkerRegistry.addMaterialStats(TUNGSTEN_STEEL,
                new HeadMaterialStats(1920, 13.0F, 10.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 700),
                new ExtraMaterialStats(600),
                new BowMaterialStats(0.8f, 2.8f, 15.8f)
        );

        if (Config.RED_STEEL) TinkerRegistry.addMaterialStats(RED_STEEL,
                new HeadMaterialStats(2300, 10.0F, 9.0F, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(1.1f, 900),
                new ExtraMaterialStats(660),
                new BowMaterialStats(1.0f, 0.95f, 7.0f)
        );

        if (Config.BLUE_STEEL) TinkerRegistry.addMaterialStats(BLUE_STEEL,
                new HeadMaterialStats(1064, 17.0F, 9.0F, GTCHarvestLevels.OBSIDIAN),
                new HandleMaterialStats(1.3f, 590),
                new ExtraMaterialStats(440),
                new BowMaterialStats(2.0f, 1.1f, 9.0f)
        );

        if (Config.WROUGHT_IRON) TinkerRegistry.addMaterialStats(WROUGHT_IRON,
                new HeadMaterialStats(292, 6.0F, 4.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.9f, 80),
                new ExtraMaterialStats(60),
                new BowMaterialStats(0.5f, 2.3f, 4.0f)
        );

        if (Config.COBALT_BRASS) TinkerRegistry.addMaterialStats(COBALT_BRASS,
                new HeadMaterialStats(990, 12.5F, 3.8F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 250),
                new ExtraMaterialStats(380),
                new BowMaterialStats(1.8f, 1.3f, 3.5f)
        );

        if (Config.DURANIUM) TinkerRegistry.addMaterialStats(DURANIUM,
                new HeadMaterialStats(7890, 17.5F, 17.0F, GTCHarvestLevels.DURANIUM),
                new HandleMaterialStats(1.3f, 3000),
                new ExtraMaterialStats(2880),
                new BowMaterialStats(3.2f, 5.3f, 19.0f)
        );

        if (Config.ROSE_GOLD) TinkerRegistry.addMaterialStats(ROSE_GOLD,
                new HeadMaterialStats(710, 15.5F, 6.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.6f, 200),
                new ExtraMaterialStats(170),
                new BowMaterialStats(0.6f, 1.8f, 5.4f)
        );
        if (Config.POLYVINYL_CHLORIDE) TinkerRegistry.addMaterialStats(POLYVINYL_CHLORIDE,
                new HeadMaterialStats(190, 2.8F, 2.2F, GTCHarvestLevels.STONE),
                new HandleMaterialStats(0.6f, 60),
                new ExtraMaterialStats(120),
                new BowMaterialStats(0.7f, 0.7f, 3.4f)
        );

        if (Config.ALUMINIUM) TinkerRegistry.addMaterialStats(ALUMINIUM,
                new HeadMaterialStats(700, 2.8F, 10.2F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(1.1f, 510),
                new ExtraMaterialStats(220),
                new BowMaterialStats(1.3f, 1.6f, 3.2f)
        );

        if (Config.HSSE) TinkerRegistry.addMaterialStats(HSSE,
                new HeadMaterialStats(2890, 8.8F, 12.2F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(1.1f, 1210),
                new ExtraMaterialStats(1100),
                new BowMaterialStats(1.1f, 1.2f, 18.1f)
        );

        if (Config.INVAR) TinkerRegistry.addMaterialStats(INVAR,
                new HeadMaterialStats(364, 8.1F, 5.9F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.6f, 110),
                new ExtraMaterialStats(100),
                new BowMaterialStats(1.2f, 0.9f, 5.7f)
        );

        if (Config.ULTIMET) TinkerRegistry.addMaterialStats(ULTIMET,
                new HeadMaterialStats(1800, 14.0F, 11.1F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.9f, 900),
                new ExtraMaterialStats(700),
                new BowMaterialStats(1.0f, 1.7f, 11.1f)
        );

        if (Config.STERLING_SILVER) TinkerRegistry.addMaterialStats(STERLING_SILVER,
                new HeadMaterialStats(730, 5.0F, 7.0F, GTCHarvestLevels.DIAMOND),
                new HandleMaterialStats(0.95f, 110),
                new ExtraMaterialStats(220),
                new BowMaterialStats(1.25f, 2.7f, 12.0f)
        );

        if (Config.TUNGSTENCARBIDE) TinkerRegistry.addMaterialStats(TUNGSTENCARBIDE,
                new HeadMaterialStats(820, 60.0F, 5.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(0.95f, 110),
                new ExtraMaterialStats(220),
                new BowMaterialStats(5.25f, 8.7f, 4.0f)
        );

        if (Config.NEUTRONIUM) TinkerRegistry.addMaterialStats(NEUTRONIUM,
                new HeadMaterialStats(10000, 180.0F, 100.0F, GTCHarvestLevels.NEUTRONIUM),
                new HandleMaterialStats(10.0f, 10000),
                new ExtraMaterialStats(10000),
                new BowMaterialStats(15.0f, 20.5f, 125.0f)
        );

        if (Config.TITANIUM) TinkerRegistry.addMaterialStats(TITANIUM,
                new HeadMaterialStats(1476, 10.0F, 9.0F, GTCHarvestLevels.COBALT),
                new HandleMaterialStats(1.1f, 577),
                new ExtraMaterialStats(530),
                new BowMaterialStats(1.8f, 3.3f, 14.0f)
        );

        if (Config.POLYETHYLENE) TinkerRegistry.addMaterialStats(POLYETHYLENE,
                new BowStringMaterialStats(1.4F),
                new FletchingMaterialStats(1.2F, 1.7F)
        );

        if (Config.RUBBER) TinkerRegistry.addMaterialStats(RUBBER,
                new BowStringMaterialStats(1.0F),
                new FletchingMaterialStats(1.0F, 1.8F)
        );

        if (Config.SYNTHETIC_RUBBER) TinkerRegistry.addMaterialStats(SYNTHETIC_RUBBER,
                new BowStringMaterialStats(1.3F),
                new FletchingMaterialStats(1.2F, 1.8F)
        );
    }

    private static void setRepresentatives() {
        if (Config.TREATED_WOOD) {
            TREATED_WOOD.setCraftable(true);
            TREATED_WOOD.addCommonItems("TreatedWood");
            TREATED_WOOD.addItem("plankTreatedWood", 1, Material.VALUE_Ingot);
            TREATED_WOOD.setRepresentativeItem(MetaBlocks.PLANKS.getItemVariant(BlockGregPlanks.BlockType.TREATED_PLANK));
        }

        for (Material material : MATERIALS) {
            material.addCommonItems(Utils.toPascalCase(ASSOCIATED.get(material).getName()));
            material.setRepresentativeItem(OreDictUnifier.get(OrePrefix.ingot, ASSOCIATED.get(material)));
            material.setFluid(ASSOCIATED.get(material).getFluid());
        }

        for (Material material : BOWSTRING_MATERIALS) {
            material.addCommonItems(Utils.toPascalCase(ASSOCIATED.get(material).getName()));
            material.addItem("foil" + Utils.toPascalCase(ASSOCIATED.get(material).getName()));
            material.setRepresentativeItem(OreDictUnifier.get(OrePrefix.foil, ASSOCIATED.get(material)));
            material.setFluid(ASSOCIATED.get(material).getFluid());
        }
    }

    public static void preInit() {
        if (Config.TREATED_WOOD) TinkerRegistry.addMaterial(TREATED_WOOD);

        List<Material> toRegister = new ArrayList<>();
        toRegister.addAll(MATERIALS);
        toRegister.addAll(BOWSTRING_MATERIALS);
        toRegister.forEach(GTCTinkerMaterials::register);
        setStats();
    }

    public static void init() {
        setRepresentatives();
        MATERIALS.forEach(GTCTinkerMaterials::setProperties);
        BOWSTRING_MATERIALS.forEach(GTCTinkerMaterials::setProperties);
    }

    private static void setProperties(Material material) {
        material.setCraftable(false);
        material.setCastable(false);
    }

    private static Material addMaterial(String name, gregtech.api.unification.material.Material gtMaterial, TextFormatting color, int tier, ITrait traitHead, ITrait traitOther, Boolean isEnabled) {
        Material tcMaterial = new Material(name, color);

        if (traitHead != null) tcMaterial.addTrait(traitHead, "head");
        if (traitOther != null) tcMaterial.addTrait(traitOther);
        MATERIALS.add(tcMaterial);
        TIER.put(tcMaterial, tier);
        ASSOCIATED.put(tcMaterial, gtMaterial);
        IS_ENABLED.put(tcMaterial, isEnabled);

        return tcMaterial;
    }

    private static Material addBowstringMaterial(String name, gregtech.api.unification.material.Material gtMaterial, TextFormatting color, int tier, Boolean isEnabled) {
        Material tcMaterial = new Material(name, color);

        BOWSTRING_MATERIALS.add(tcMaterial);
        TIER.put(tcMaterial, tier);
        ASSOCIATED.put(tcMaterial, gtMaterial);
        IS_ENABLED.put(tcMaterial, isEnabled);

        return tcMaterial;
    }

    private static void register(Material material) {
        if (IS_ENABLED.get(material)){
            TinkerRegistry.addMaterial(material);
        } else {
            removeFromLists(material);
        }
    }

    private static void removeFromLists(Material material) {
        MATERIALS.remove(material);
        BOWSTRING_MATERIALS.remove(material);
        FLETCHING_MATERIALS.remove(material);
        ASSOCIATED.remove(material);
        TIER.remove(material);
    }
}
