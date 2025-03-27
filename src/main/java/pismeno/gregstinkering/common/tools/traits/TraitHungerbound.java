package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.traits.AbstractTraitLeveled;

public class TraitHungerbound extends AbstractTraitLeveled {
    private static final String tagStoredDamage = "storedDamage"; // NBT key

    public TraitHungerbound(int levels) {
        super("hungerbound", 16762381, 3, levels);
    }

    public int onToolDamage(ItemStack tool, int damage, int newDamage, EntityLivingBase entity) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            int hunger = player.getFoodStats().getFoodLevel();

            NBTTagCompound tag = tool.getTagCompound();
            if (tag == null) {
                tag = new NBTTagCompound();
                tool.setTagCompound(tag);
            }
            int storedDamage = tag.getInteger(tagStoredDamage);

            storedDamage++;

            if (storedDamage >= 30) {
                if (hunger > 0) {
                    player.getFoodStats().setFoodLevel(hunger - 1);
                } else {
                    player.setHealth(player.getHealth() - 1);
                }

                newDamage = -3 * levels;
                storedDamage = 0;
            }
            tag.setInteger(tagStoredDamage, storedDamage);
        }

        return super.onToolDamage(tool, damage, newDamage, entity);
    }
}
