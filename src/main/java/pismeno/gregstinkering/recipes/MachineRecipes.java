package pismeno.gregstinkering.recipes;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.GTUtility;
import gregtech.common.items.MetaItems;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import pismeno.gregstinkering.common.tools.GTCMetaItem;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.tools.TinkerTools;

import java.util.Iterator;

import static pismeno.gregstinkering.common.tools.GTCTinkerMaterials.*;

public class MachineRecipes {
    public static void init() {
        initToolParts();
        initShapeExtruders();
    }

    private static void initToolParts() {
        Iterator materials = MATERIALS.iterator();

        while (materials.hasNext()) {
            Material material = (Material) materials.next();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_ARROWHEAD)
                    .outputs(TinkerTools.arrowHead.getItemstackWithMaterial(material))
                    .duration(400).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BEHEADER)
                    .outputs(TinkerTools.largeSwordBlade.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BINDING)
                    .outputs(TinkerTools.binding.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(3, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOUGHBINDING)
                    .outputs(TinkerTools.toughBinding.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(3, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BOWLIMB)
                    .outputs(TinkerTools.bowLimb.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_GUARD)
                    .outputs(TinkerTools.handGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_CROSSGUARD)
                    .outputs(TinkerTools.crossGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_WIDEGUARD)
                    .outputs(TinkerTools.wideGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SHOVEL)
                    .outputs(TinkerTools.shovelHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_EXCAVATOR)
                    .outputs(TinkerTools.excavatorHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_HAMMER)
                    .outputs(TinkerTools.hammerHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_KAMA)
                    .outputs(TinkerTools.kamaHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_KNIFEBLADE)
                    .outputs(TinkerTools.knifeBlade.getItemstackWithMaterial(material))
                    .duration(700).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_LARGEPLATE)
                    .outputs(TinkerTools.largePlate.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_AXE)
                    .outputs(TinkerTools.axeHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_LUMBERAXE)
                    .outputs(TinkerTools.broadAxeHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_PICKAXE)
                    .outputs(TinkerTools.pickHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SHARPENINGKIT)
                    .outputs(TinkerTools.sharpeningKit.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(3, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SIGN)
                    .outputs(TinkerTools.signHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(2, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SWORDBLADE)
                    .outputs(TinkerTools.swordBlade.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(1, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOOLROD)
                    .outputs(TinkerTools.toolRod.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(3, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOUGHTOOLROD)
                    .outputs(TinkerTools.toughToolRod.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(8, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SCYTHE)
                    .outputs(TinkerTools.scytheHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(3, material.getRepresentativeItem()))
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_FRYPAN)
                    .outputs(TinkerTools.panHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();
        }
    }
    private static void initShapeExtruders() {
        buildExtruderShapeRecipes("pick_head", GTCMetaItem.SHAPE_EXTRUDER_PICKAXE);
        buildExtruderShapeRecipes("arrowhead", GTCMetaItem.SHAPE_EXTRUDER_ARROWHEAD);
        buildExtruderShapeRecipes("axe_head", GTCMetaItem.SHAPE_EXTRUDER_AXE);
        buildExtruderShapeRecipes("large_sword_blade", GTCMetaItem.SHAPE_EXTRUDER_BEHEADER);
        buildExtruderShapeRecipes("binding", GTCMetaItem.SHAPE_EXTRUDER_BINDING);
        buildExtruderShapeRecipes("bow_limb", GTCMetaItem.SHAPE_EXTRUDER_BOWLIMB);
        buildExtruderShapeRecipes("cross_guard", GTCMetaItem.SHAPE_EXTRUDER_CROSSGUARD);
        buildExtruderShapeRecipes("excavator_head", GTCMetaItem.SHAPE_EXTRUDER_EXCAVATOR);
        buildExtruderShapeRecipes("pan", GTCMetaItem.SHAPE_EXTRUDER_FRYPAN);
        buildExtruderShapeRecipes("hand_guard", GTCMetaItem.SHAPE_EXTRUDER_GUARD);
        buildExtruderShapeRecipes("hammer_head", GTCMetaItem.SHAPE_EXTRUDER_HAMMER);
        buildExtruderShapeRecipes("kama_head", GTCMetaItem.SHAPE_EXTRUDER_KAMA);
        buildExtruderShapeRecipes("knife_blade", GTCMetaItem.SHAPE_EXTRUDER_KNIFEBLADE);
        buildExtruderShapeRecipes("large_plate", GTCMetaItem.SHAPE_EXTRUDER_LARGEPLATE);
        buildExtruderShapeRecipes("broad_axe_head", GTCMetaItem.SHAPE_EXTRUDER_LUMBERAXE);
        buildExtruderShapeRecipes("scythe_head", GTCMetaItem.SHAPE_EXTRUDER_SCYTHE);
        buildExtruderShapeRecipes("sharpening_kit", GTCMetaItem.SHAPE_EXTRUDER_SHARPENINGKIT);
        buildExtruderShapeRecipes("shovel_head", GTCMetaItem.SHAPE_EXTRUDER_SHOVEL);
        buildExtruderShapeRecipes("sign_head", GTCMetaItem.SHAPE_EXTRUDER_SIGN);
        buildExtruderShapeRecipes("sword_blade", GTCMetaItem.SHAPE_EXTRUDER_SWORDBLADE);
        buildExtruderShapeRecipes("tool_rod", GTCMetaItem.SHAPE_EXTRUDER_TOOLROD);
        buildExtruderShapeRecipes("tough_binding", GTCMetaItem.SHAPE_EXTRUDER_TOUGHBINDING);
        buildExtruderShapeRecipes("tough_tool_rod", GTCMetaItem.SHAPE_EXTRUDER_TOUGHTOOLROD);
        buildExtruderShapeRecipes("wide_guard", GTCMetaItem.SHAPE_EXTRUDER_WIDEGUARD);
    }

    private static void buildExtruderShapeRecipes(String castType, MetaItem<?>.MetaValueItem shapeValue) {
        ItemStack cast = getCast(castType);
        ItemStack shape = shapeValue.getStackForm();
        ItemStack blank = MetaItems.SHAPE_EMPTY.getStackForm();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(blank)
                .notConsumable(cast)
                .outputs(shape)
                .duration(240).EUt(32).buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tconstruct", "cast"))))
                .notConsumable(cast)
                .outputs(cast)
                .duration(120).EUt(22).buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(blank)
                .notConsumable(shape)
                .outputs(shape)
                .duration(120).EUt(22).buildAndRegister();
    }

    private static ItemStack getCast(String type) {
        ItemStack cast = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tconstruct", "cast")));
        NBTTagCompound tag = new NBTTagCompound();

        tag.setString("PartType", "tconstruct:" + type);
        cast.setTagCompound(tag);

        return cast;
    }
}
