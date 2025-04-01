package pismeno.gregstinkering.unification;

import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.Util;

import static slimeknights.tconstruct.library.utils.HarvestLevels.harvestLevelNames;

public class GTCHarvestLevels {
    public static final int STONE = 0;
    public static final int IRON = 1;
    public static final int DIAMOND = 2;
    public static final int OBSIDIAN = 3;
    public static final int COBALT = 4;
    public static final int DURANIUM = 5;
    public static final int NEUTRONIUM = 6;

    private GTCHarvestLevels() {}

    public static void preInit() {
        harvestLevelNames.put(5, TextFormatting.DARK_AQUA + Util.translate("ui.mininglevel.duranium", new Object[0]));
        harvestLevelNames.put(6, TextFormatting.WHITE + Util.translate("ui.mininglevel.neutronium", new Object[0]));
    }
}