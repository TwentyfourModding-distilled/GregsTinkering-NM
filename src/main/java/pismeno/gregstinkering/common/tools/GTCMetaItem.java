package pismeno.gregstinkering.common.tools;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;

import static gregtech.api.GTValues.*;

public class GTCMetaItem extends MetaItem<GTCMetaItem.GCMetaValueItem> {

    public static final MetaItem<?>.MetaValueItem[] SHAPE_EXTRUDERS = new MetaItem.MetaValueItem[22];
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SWORDBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BEHEADER;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_ARROWHEAD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOUGHBINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_GUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_WIDEGUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_CROSSGUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_KNIFEBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOOLROD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOUGHTOOLROD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_LARGEPLATE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SHARPENINGKIT;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BOWLIMB;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_HAMMER;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_KAMA;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_AXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_LUMBERAXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_PICKAXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SHOVEL;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_EXCAVATOR;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SIGN;

    public GTCMetaItem() {
        super((short) 0);
    }

    @Override
    protected GCMetaValueItem constructMetaValueItem(short metaValue, String unlocalizedName) {
        return new GCMetaValueItem(metaValue, unlocalizedName);
    }

    @Override
    public void registerSubItems() {
        // Register each of the extruder shapes
        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_SWORDBLADE = addItem(1, "shape.extruder.swordblade")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_BEHEADER = addItem(2, "shape.extruder.beheader")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_ARROWHEAD = addItem(3, "shape.extruder.arrowhead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[3] = SHAPE_EXTRUDER_BINDING = addItem(4, "shape.extruder.binding")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[4] = SHAPE_EXTRUDER_TOUGHBINDING = addItem(5, "shape.extruder.toughbinding")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[5] = SHAPE_EXTRUDER_GUARD = addItem(6, "shape.extruder.guard")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_WIDEGUARD = addItem(7, "shape.extruder.wideguard")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_CROSSGUARD = addItem(8, "shape.extruder.crossguard")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_KNIFEBLADE = addItem(9, "shape.extruder.knifeblade")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_TOOLROD = addItem(10, "shape.extruder.toolrod")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[10] = SHAPE_EXTRUDER_TOUGHTOOLROD = addItem(11, "shape.extruder.toughtoolrod")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[11] = SHAPE_EXTRUDER_LARGEPLATE = addItem(12, "shape.extruder.largeplate")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[12] = SHAPE_EXTRUDER_SHARPENINGKIT = addItem(13, "shape.extruder.sharpeningkit")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[13] = SHAPE_EXTRUDER_BOWLIMB = addItem(14, "shape.extruder.bowlimb")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[14] = SHAPE_EXTRUDER_HAMMER = addItem(15, "shape.extruder.hammerhead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[15] = SHAPE_EXTRUDER_KAMA = addItem(16, "shape.extruder.kama")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[16] = SHAPE_EXTRUDER_AXE = addItem(17, "shape.extruder.axehead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[17] = SHAPE_EXTRUDER_LUMBERAXE = addItem(18, "shape.extruder.lumberaxe")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[18] = SHAPE_EXTRUDER_PICKAXE = addItem(19, "shape.extruder.pickaxehead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[19] = SHAPE_EXTRUDER_SHOVEL = addItem(20, "shape.extruder.shovelhead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[20] = SHAPE_EXTRUDER_EXCAVATOR = addItem(21, "shape.extruder.excavator")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[21] = SHAPE_EXTRUDER_SIGN = addItem(22, "shape.extruder.sign")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));

    }

    public class GCMetaValueItem extends MetaItem<?>.MetaValueItem {

        protected GCMetaValueItem(int metaValue, String unlocalizedName) {
            super(metaValue, unlocalizedName);
        }
    }
}
