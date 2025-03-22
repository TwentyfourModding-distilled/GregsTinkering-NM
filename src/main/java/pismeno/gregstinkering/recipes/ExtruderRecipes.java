package pismeno.gregstinkering.recipes;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import pismeno.gregstinkering.GregsTinkering;
import pismeno.gregstinkering.common.tools.GTCMetaItem;

import static gregtech.api.GTValues.*;

public class ExtruderRecipes {
    public static void init() {
        GregsTinkering.LOGGER.info("Registering ExtruderRecipes...");
        RecipeMaps.EXTRUDER_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.AnnealedCopper)
                .notConsumable(MetaItems.SHAPE_EMPTY)
                .output(GTCMetaItem.SHAPE_EXTRUDER_SWORDBLADE)
                .duration(40).EUt(VA[MV]).buildAndRegister();
        GregsTinkering.LOGGER.info("Extruder recipe added!");
    }
}
