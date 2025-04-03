package pismeno.gregstinkering.unification;

import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

public class GregtechMaterialsModifications {
    public static void init() {
        Cobalt.addFlags(GENERATE_BOLT_SCREW);

        Cobalt.setProperty(PropertyKey.TOOL, new ToolProperty(7.0F, 1.0F, 1072, 4));
        Cobalt.setMaterialRGB(0x2376DD);
    }

    private GregtechMaterialsModifications() {}
}
