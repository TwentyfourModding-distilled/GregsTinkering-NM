package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.PlayerEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitAiry extends AbstractTrait {
    public TraitAiry() {super("airy", TextFormatting.BLUE);}

    public void miningSpeed(ItemStack tool, PlayerEvent.BreakSpeed event) {
        if (event.getEntityPlayer().getPosition().getY() > 60) {
            event.setNewSpeed(event.getNewSpeed() * 1.8F);
        }
    }

    public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
        if (player.getPosition().getY() > 60) {
            newDamage = damage * 1.4F;
        }
        return super.damage(tool, player, target, damage, newDamage, isCritical);
    }
}
