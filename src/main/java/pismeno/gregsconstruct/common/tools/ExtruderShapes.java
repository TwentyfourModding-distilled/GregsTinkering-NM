package pismeno.gregsconstruct.common.tools;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;

import static gregtech.api.GTValues.M;
import static pismeno.gregsconstruct.common.tools.MetaItems.*;

public class ExtruderShapes extends StandardMetaItem {
    public ExtruderShapes() {
        super();
    }

    @Override
    public void registerSubItems() {
        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_SWORD = addItem(31, "shape.extruder.sword")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_BEHEADER = addItem(32, "shape.extruder.beheader")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_ARROWHEAD = addItem(33, "shape.extruder.arrowhead")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, M * 4)));
    }
}
