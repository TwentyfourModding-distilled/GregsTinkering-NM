package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitMoonlit extends AbstractTrait {
    public TraitMoonlit() {super("moonlit", TextFormatting.WHITE);}

    public void miningSpeed(ItemStack tool, PlayerEvent.BreakSpeed event) {
        if (isNightTime(event.getEntityPlayer().world)) {
            event.setNewSpeed(event.getNewSpeed() * 1.8F);
        }
    }

    public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
        if (isNightTime(player.world)) {
            newDamage = damage + 6;
        }
        return super.damage(tool, player, target, damage, newDamage, isCritical);
    }

    public static boolean isNightTime(World world) {
        long time = world.getWorldTime() % 24000;
        return time >= 13000 && time <= 23000;
    }
}
