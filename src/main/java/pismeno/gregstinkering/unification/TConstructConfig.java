package pismeno.gregstinkering.unification;

import static pismeno.gregstinkering.Config.*;
import static slimeknights.tconstruct.common.config.Config.*;

public class TConstructConfig {
    public static void preInit() {
        if (doOverrideTconstructConfig) {
            genArdite = false;
            genCobalt = false;
            oreToIngotRatio = 1.0F;
        }
    }

    private TConstructConfig() {}
}
