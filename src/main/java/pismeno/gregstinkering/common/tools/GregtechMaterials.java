//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pismeno.gregstinkering.common.tools;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.utils.HarvestLevels;

public final class GregtechMaterials {

    // Create the material
    public static final Material PALLADIUM = new Material("palladium", TextFormatting.RED);

    public static void init(FMLPreInitializationEvent event) {
        // Set up the material render info (used for in-game appearance)
        PALLADIUM.setCraftable(true); // Can be crafted in Part Builder
        PALLADIUM.setCastable(true);  // Can be smelted into a casted tool
        PALLADIUM.setFluid(null);     // Set this to your fluid if smelting is needed

        // Register the material in Tinkers' Construct
        TinkerRegistry.addMaterial(PALLADIUM);

        // Define material stats
        TinkerRegistry.addMaterialStats(
                PALLADIUM,
                new HeadMaterialStats(1200, 9.5f, 6.5f, HarvestLevels.DIAMOND), // Durability, mining speed, attack, harvest level
                new HandleMaterialStats(1.1f, 300), // Handle multiplier & extra durability
                new ExtraMaterialStats(250),       // Extra part durability
                new BowMaterialStats(0.6f, 1.6f, 5.5f) // Draw speed, velocity, projectile damage
        );
    }
}
