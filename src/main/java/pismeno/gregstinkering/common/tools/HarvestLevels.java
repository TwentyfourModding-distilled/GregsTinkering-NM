package pismeno.gregstinkering.common.tools;

import com.google.common.collect.Maps;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.tools.TinkerMaterials;

import java.util.Map;

public class HarvestLevels {
    public static final int STONE = 0;
    public static final int IRON = 1;
    public static final int DIAMOND = 2;
    public static final int OBSIDIAN = 3;
    public static final int COBALT = 4;
    public static final int DURANIUM = 5;
    public static final Map<Integer, String> harvestLevelNames = Maps.newHashMap();

    private HarvestLevels() {
    }

    public static String getHarvestLevelName(int num) {
        return harvestLevelNames.containsKey(num) ? (String)harvestLevelNames.get(num) : String.valueOf(num);
    }

    public static void preInit() {
        harvestLevelNames.put(5, TextFormatting.DARK_AQUA + Util.translate("ui.mininglevel.duranium", new Object[0]));
    }
}