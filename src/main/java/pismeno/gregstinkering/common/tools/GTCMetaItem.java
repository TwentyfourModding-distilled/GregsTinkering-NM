package pismeno.gregstinkering.common.tools;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;

import static gregtech.api.GTValues.*;

public class GTCMetaItem extends MetaItem<GTCMetaItem.GCMetaValueItem> {

    public static final MetaItem<?>.MetaValueItem[] SHAPE_EXTRUDERS = new MetaItem.MetaValueItem[10];
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SWORDBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BEHEADER;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_ARROWHEAD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOUGHBINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_GUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_KNIFEBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOOLROD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_LARGEPLATE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SHARPENINGKIT;

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
        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_KNIFEBLADE = addItem(7, "shape.extruder.knifeblade")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_TOOLROD = addItem(8, "shape.extruder.toolrod")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_LARGEPLATE = addItem(9, "shape.extruder.largeplate")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_SHARPENINGKIT = addItem(10, "shape.extruder.sharpeningkit")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
    }

    public class GCMetaValueItem extends MetaItem<?>.MetaValueItem {

        protected GCMetaValueItem(int metaValue, String unlocalizedName) {
            super(metaValue, unlocalizedName);
        }
    }
}
