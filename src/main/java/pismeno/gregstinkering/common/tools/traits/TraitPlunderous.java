package pismeno.gregstinkering.common.tools.traits;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.traits.AbstractTraitLeveled;
import slimeknights.tconstruct.library.utils.TagUtil;
import slimeknights.tconstruct.library.utils.TinkerUtil;

import java.util.Random;


public class TraitPlunderous extends AbstractTraitLeveled {

    public TraitPlunderous(int levels) {
        super("plunderous", 0xdb690b, 3, levels);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public void onItemDrop(LivingDropsEvent event) {

        if (event.getEntityLiving() == null || event.getDrops().isEmpty())
            return;

        if (event.getSource().getTrueSource() instanceof EntityPlayer && !(event.getEntityLiving() instanceof EntityPlayer)) {
            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();

            if (player != null && TinkerUtil.hasTrait(TagUtil.getTagSafe(player.getHeldItemMainhand()), this.identifier)){
                for (EntityItem drop : event.getDrops()) {
                    ItemStack originalStack = drop.getItem();

                    ItemStack modifiedStack = originalStack.copy();
                    modifiedStack.setCount(originalStack.getCount() + getExtraDropsCount());

                    drop.setItem(modifiedStack);
                }
            }
        }
    }

    private int getExtraDropsCount() {
        int extraDrops = 0;

        if (this.levels == 1) {
            extraDrops = RANDOM.nextInt(2);
        }

        else if (this.levels == 2) {
            extraDrops = RANDOM.nextInt(2) + 1;
        }

        else if (this.levels == 3) {
            extraDrops = RANDOM.nextInt(3) + 1;
        }
        return extraDrops;
    }
}
