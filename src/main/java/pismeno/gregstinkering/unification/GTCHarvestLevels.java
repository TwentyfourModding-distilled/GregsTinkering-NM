package pismeno.gregstinkering.unification;

import com.google.common.collect.Maps;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.tools.TinkerMaterials;

import java.util.Map;

public class GTCHarvestLevels {
    public static final int STONE = 0;
    public static final int IRON = 1;
    public static final int DIAMOND = 2;
    public static final int OBSIDIAN = 3;
    public static final int COBALT = 4;
    public static final int DURANIUM = 5;
    public static final int NEUTRONIUM = 6;
    public static final Map<Integer, String> harvestLevelNames = Maps.newHashMap();

    private GTCHarvestLevels() {
    }

    public static String getHarvestLevelName(int num) {
        return harvestLevelNames.containsKey(num) ? (String)harvestLevelNames.get(num) : String.valueOf(num);
    }

    public static void preInit() {
        harvestLevelNames.put(0, TinkerMaterials.stone.getTextColor() + Util.translate("ui.mininglevel.stone", new Object[0]));
        harvestLevelNames.put(1, TinkerMaterials.iron.getTextColor() + Util.translate("ui.mininglevel.iron", new Object[0]));
        harvestLevelNames.put(2, TextFormatting.AQUA + Util.translate("ui.mininglevel.diamond", new Object[0]));
        harvestLevelNames.put(3, TinkerMaterials.obsidian.getTextColor() + Util.translate("ui.mininglevel.obsidian", new Object[0]));
        harvestLevelNames.put(4, TinkerMaterials.cobalt.getTextColor() + Util.translate("ui.mininglevel.cobalt", new Object[0]));
        harvestLevelNames.put(5, TextFormatting.DARK_AQUA + Util.translate("ui.mininglevel.duranium", new Object[0]));
        harvestLevelNames.put(6, TextFormatting.WHITE + Util.translate("ui.mininglevel.neutronium", new Object[0]));

        // custom names via resource pack.. deprecated
        String base = "gui.mining";
        int i = 0;
        while(I18n.canTranslate(String.format("%s%d", base, i))) {
            harvestLevelNames.put(i, I18n.translateToLocal(String.format("%s%d", base, i)));
            i++;
        }

        // and new
        base = "ui.mininglevel.";
        i = 0;
        while(I18n.canTranslate(String.format("%s%d", base, i))) {
            harvestLevelNames.put(i, I18n.translateToLocal(String.format("%s%d", base, i)));
            i++;
        }
    }
}