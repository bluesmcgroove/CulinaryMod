package bluesmcgroove.setup;

import bluesmcgroove.item.IronKnife;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static bluesmcgroove.LCB.ID;
import static bluesmcgroove.setup.LCBBlocks.BUTCHERBLOCK;
import static bluesmcgroove.setup.LCBBlocks.TOMATO_CROP;

public class LCBItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ID);

    // Complex items
    public static final RegistryObject<Item> IRONKNIFE = ITEMS.register("iron_knife", () -> new IronKnife(new Item.Properties().tab(ModSetup.LCB_TAB)));

    // Simple items
    public static final RegistryObject<Item> BUTCHERBLOCK_ITEM = ITEMS.register("butcherblock", () -> new BlockItem(BUTCHERBLOCK.get(), new Item.Properties().tab(ModSetup.LCB_TAB)));
    public static final RegistryObject<Item> TOMATOFRUIT = ITEMS.register("tomato_fruit", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.LCB_TAB).food(CulinaryRegistry.TOMATOFRUIT)));
    public static final RegistryObject<Item> TOMATOSLICE = ITEMS.register("tomato_slice", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.LCB_TAB).food(CulinaryRegistry.TOMATOSLICE)));
    public static final RegistryObject<Item> SALTWATER_BUCKET = ITEMS.register("saltwater_bucket", () -> new BucketItem(LCBFluids.SALTWATER_FLUID, new Item.Properties().tab(ModSetup.LCB_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(TOMATO_CROP.get(), new Item.Properties().tab(ModSetup.LCB_TAB)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
