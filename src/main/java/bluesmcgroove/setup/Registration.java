package bluesmcgroove.setup;

import bluesmcgroove.item.IronKnife;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static bluesmcgroove.culinarycraft.CulinaryCraft.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
//    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
//    private static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
//    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
//    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
//        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
//        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
//        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
//        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    public static final RegistryObject<Item> IRONKNIFE = ITEMS.register("ironknife", () -> new IronKnife(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> TOMATOFRUIT = ITEMS.register("tomatofruit", () -> new CulinaryRegistry(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(CulinaryRegistry.TOMATOFRUIT)));
    public static final RegistryObject<Item> TOMATOSLICE = ITEMS.register("tomatoslice", () -> new CulinaryRegistry(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(CulinaryRegistry.TOMATOSLICE)));
}
