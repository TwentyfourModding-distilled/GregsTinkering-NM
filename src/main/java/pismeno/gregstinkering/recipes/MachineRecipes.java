package pismeno.gregstinkering.recipes;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import pismeno.gregstinkering.common.tools.GTCMetaItem;

import static gregtech.api.GTValues.*;

public class MachineRecipes {
    public static void init() {
        RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.AnnealedCopper)
                .notConsumable(MetaItems.SHAPE_EMPTY)
                .output(GTCMetaItem.SHAPE_EXTRUDER_SWORDBLADE)
                .duration(40).EUt(VA[MV]).buildAndRegister();
    }
}
