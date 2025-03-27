package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.traits.AbstractTraitLeveled;

public class TraitUnbreakable extends AbstractTrait {

    public TraitUnbreakable() {
        super("unbreakable", TextFormatting.WHITE);
    }

    public int onToolDamage(ItemStack tool, int damage, int newDamage, EntityLivingBase entity) {
        newDamage = 0;

        return super.onToolDamage(tool, damage, newDamage, entity);
    }
}
