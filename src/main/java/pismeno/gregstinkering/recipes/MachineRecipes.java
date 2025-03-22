package pismeno.gregstinkering.recipes;

import gregtech.api.recipes.RecipeMaps;
import pismeno.gregstinkering.common.tools.GTCMetaItem;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.tools.TinkerTools;

import java.util.Iterator;

import static pismeno.gregstinkering.common.tools.GTCTinkerMaterials.*;

public class MachineRecipes {
    public static void init() {
        Iterator materials = MATERIALS.iterator();

        while (materials.hasNext()) {
            Material material = (Material) materials.next();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_ARROWHEAD)
                    .outputs(TinkerTools.arrowHead.getItemstackWithMaterial(material))
                    .duration(400).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BEHEADER)
                    .outputs(TinkerTools.largeSwordBlade.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BINDING)
                    .outputs(TinkerTools.toughBinding.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOUGHBINDING)
                    .outputs(TinkerTools.toughBinding.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_BOWLIMB)
                    .outputs(TinkerTools.bowLimb.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_GUARD)
                    .outputs(TinkerTools.handGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_CROSSGUARD)
                    .outputs(TinkerTools.crossGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_WIDEGUARD)
                    .outputs(TinkerTools.wideGuard.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SHOVEL)
                    .outputs(TinkerTools.shovelHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_EXCAVATOR)
                    .outputs(TinkerTools.excavatorHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_HAMMER)
                    .outputs(TinkerTools.hammerHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_KAMA)
                    .outputs(TinkerTools.kamaHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_KNIFEBLADE)
                    .outputs(TinkerTools.knifeBlade.getItemstackWithMaterial(material))
                    .duration(700).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_LARGEPLATE)
                    .outputs(TinkerTools.largePlate.getItemstackWithMaterial(material))
                    .duration(1000).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_AXE)
                    .outputs(TinkerTools.axeHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_LUMBERAXE)
                    .outputs(TinkerTools.broadAxeHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_PICKAXE)
                    .outputs(TinkerTools.pickHead.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SHARPENINGKIT)
                    .outputs(TinkerTools.sharpeningKit.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SIGN)
                    .outputs(TinkerTools.signHead.getItemstackWithMaterial(material))
                    .duration(1200).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_SWORDBLADE)
                    .outputs(TinkerTools.swordBlade.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOOLROD)
                    .outputs(TinkerTools.toolRod.getItemstackWithMaterial(material))
                    .duration(600).EUt(TIER.get(material)).buildAndRegister();

            RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                    .inputs(material.getRepresentativeItem())
                    .notConsumable(GTCMetaItem.SHAPE_EXTRUDER_TOUGHTOOLROD)
                    .outputs(TinkerTools.toughToolRod.getItemstackWithMaterial(material))
                    .duration(900).EUt(TIER.get(material)).buildAndRegister();
        }
    }
}
