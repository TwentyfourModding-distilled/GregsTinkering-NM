package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitBoneshatter extends AbstractTrait {
    public TraitBoneshatter() {
        super("boneshatter", TextFormatting.LIGHT_PURPLE);
    }

    public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, boolean isCritical) {
        target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 2));
    }
}