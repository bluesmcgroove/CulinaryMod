package bluesmcgroove.setup;

import bluesmcgroove.block.ButcherBlock;
import bluesmcgroove.block.entity.ButcherBlockEntity;
import bluesmcgroove.block.entity.container.ButcherBlockContainer;
import bluesmcgroove.item.IronKnife;
import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static bluesmcgroove.LCB.MODID;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCKENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
//    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
        BLOCKENTITIES.register(bus);
        CONTAINERS.register(bus);
//        ENTITIES.register(bus);

    }

    // Blocks
    public static final RegistryObject<Block> BUTCHERBLOCK = BLOCKS.register("butcherblock", ButcherBlock::new);
    public static final RegistryObject<Item> BUTCHERBLOCK_ITEM = ITEMS.register("butcherblock", () -> new BlockItem(BUTCHERBLOCK.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    // Block Entities and Menus
    public static final RegistryObject<BlockEntityType<ButcherBlockEntity>> BUTCHERBLOCK_ENTITY = BLOCKENTITIES.register("butcherblock",
            () -> BlockEntityType.Builder.of(ButcherBlockEntity::new, BUTCHERBLOCK.get()).build(null));
    public static final RegistryObject<MenuType<ButcherBlockContainer>> BUTCHERBLOCK_CONTAINER = CONTAINERS.register("butcherblock",
            () -> IForgeMenuType.create((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                Level world = inv.player.getCommandSenderWorld();
                return new ButcherBlockContainer(windowId, world, pos, inv, inv.player);
            }));

    // Complex items
    public static final RegistryObject<Item> IRONKNIFE = ITEMS.register("ironknife", () -> new IronKnife(new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    // Simple items
    public static final RegistryObject<Item> TOMATOFRUIT = ITEMS.register("tomatofruit", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.ITEM_GROUP).food(CulinaryRegistry.TOMATOFRUIT)));
    public static final RegistryObject<Item> TOMATOSLICE = ITEMS.register("tomatoslice", () -> new CulinaryRegistry(new Item.Properties().tab(ModSetup.ITEM_GROUP).food(CulinaryRegistry.TOMATOSLICE)));
}
