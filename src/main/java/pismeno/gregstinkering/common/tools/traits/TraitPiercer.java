package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitPiercer extends AbstractTrait {
    public TraitPiercer() {
        super("piercer", 16711680);
    }

    public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
        boolean hasArmor = target.getTotalArmorValue() > 0;
        if (hasArmor) {
            newDamage += damage * 2.0F;
        }

        return super.damage(tool, player, target, damage, newDamage, isCritical);
    }
}