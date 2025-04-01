package pismeno.gregstinkering.common.recipes;

import java.util.*;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import net.minecraft.item.Item;
import slimeknights.tconstruct.library.TinkerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraft.item.ItemStack;

public class MeltingRecipes {
    public static void init() {
        addMeltingOres(tinOres, new FluidStack(Materials.Tin.getFluid(), 144));
        addMeltingOres(copperOres, new FluidStack(Materials.Copper.getFluid(), 144));
        addMeltingOres(leadOres, new FluidStack(Materials.Lead.getFluid(), 144));
        addMeltingOres(silverOres, new FluidStack(Materials.Silver.getFluid(), 144));
        addMeltingOres(goldOres, new FluidStack(Materials.Gold.getFluid(), 144));
        addMeltingOres(nickelOres, new FluidStack(Materials.Nickel.getFluid(), 144));
    }

    private MeltingRecipes() {}

    private static final Map<Integer, List<UnificationEntry>> tinOres = new HashMap<>() {{
        put(1, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Tin)));
        put(2, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Cassiterite), new UnificationEntry(OrePrefix.ore, Materials.CassiteriteSand)));
    }};

    private static final Map<Integer, List<UnificationEntry>> copperOres = new HashMap<>() {{
        put(1, Arrays.asList(
                new UnificationEntry(OrePrefix.ore, Materials.Copper),
                new UnificationEntry(OrePrefix.ore, Materials.Chalcopyrite),
                new UnificationEntry(OrePrefix.ore, Materials.Tetrahedrite),
                new UnificationEntry(OrePrefix.ore, Materials.Chalcocite),
                new UnificationEntry(OrePrefix.ore, Materials.Malachite)
        ));
    }};

    private static final Map<Integer, List<UnificationEntry>> leadOres = new HashMap<>() {{
        put(1, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Lead), new UnificationEntry(OrePrefix.ore, Materials.Galena)));
    }};

    private static final Map<Integer, List<UnificationEntry>> goldOres = new HashMap<>() {{
        put(1, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Gold)));
    }};

    private static final Map<Integer, List<UnificationEntry>> nickelOres = new HashMap<>() {{
        put(1, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Nickel)));
    }};

    private static final Map<Integer, List<UnificationEntry>> silverOres = new HashMap<>() {{
        put(1, Arrays.asList(new UnificationEntry(OrePrefix.ore, Materials.Silver)));
    }};


    public static void addMeltingOres(Map<Integer, List<UnificationEntry>> oreMap, FluidStack fluid) {
        
        for (Map.Entry<Integer, List<UnificationEntry>> entry : oreMap.entrySet()) {
            int key = entry.getKey();
            for (UnificationEntry unificationEntry : entry.getValue()) {
                Item item = OreDictUnifier.get(unificationEntry).getItem();

                ItemStack normal = new ItemStack(item, 1, 0);
                ItemStack nether = new ItemStack(item, 1, 1);
                ItemStack ender = new ItemStack(item, 1, 2);

                TinkerRegistry.registerMelting(normal, fluid.getFluid(), 144 * key);
                TinkerRegistry.registerMelting(nether, fluid.getFluid(), 144 * key * 2);
                TinkerRegistry.registerMelting(ender, fluid.getFluid(), 144 * key * 2);
            }
        }
    }
}
