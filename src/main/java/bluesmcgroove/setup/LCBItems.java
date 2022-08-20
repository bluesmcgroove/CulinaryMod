package bluesmcgroove.setup;

import bluesmcgroove.item.IronKnife;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static bluesmcgroove.LCB.ID;
import static bluesmcgroove.setup.LCBBlocks.*;

public class LCBItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ID);

    // Complex items
    public static final RegistryObject<Item> IRONKNIFE = ITEMS.register("ironknife", () -> new IronKnife(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    // Simple items
    public static final RegistryObject<Item> BUTCHERBLOCK_ITEM = ITEMS.register("butcherblock", () -> new BlockItem(BUTCHERBLOCK.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> TOMATOFRUIT = ITEMS.register("tomatofruit", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.ITEM_GROUP).food(CulinaryRegistry.TOMATOFRUIT)));
    public static final RegistryObject<Item> TOMATOSLICE = ITEMS.register("tomatoslice", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.ITEM_GROUP).food(CulinaryRegistry.TOMATOSLICE)));
    public static final RegistryObject<Item> SALTWATER_BUCKET = ITEMS.register("saltwater_bucket",
            () -> new BucketItem(LCBFluids.SALTWATER_FLUID, new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
