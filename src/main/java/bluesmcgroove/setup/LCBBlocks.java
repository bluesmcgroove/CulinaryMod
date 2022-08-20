package bluesmcgroove.setup;

import bluesmcgroove.block.ButcherBlock;
import bluesmcgroove.block.entity.ButcherBlockEntity;
import bluesmcgroove.block.entity.container.ButcherBlockContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static bluesmcgroove.LCB.ID;

public class LCBBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCKENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ID);
    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ID);


    // Blocks
    public static final RegistryObject<Block> BUTCHERBLOCK = BLOCKS.register("butcherblock", ButcherBlock::new);

    // Block Entities and Menus
    public static final RegistryObject<BlockEntityType<ButcherBlockEntity>> BUTCHERBLOCK_ENTITY = BLOCKENTITIES.register("butcherblock",
            () -> BlockEntityType.Builder.of(ButcherBlockEntity::new, BUTCHERBLOCK.get()).build(null));
    public static final RegistryObject<MenuType<ButcherBlockContainer>> BUTCHERBLOCK_CONTAINER = CONTAINERS.register("butcherblock",
            () -> IForgeMenuType.create((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                Level world = inv.player.getCommandSenderWorld();
                return new ButcherBlockContainer(windowId, world, pos, inv, inv.player);
            }));
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        BLOCKENTITIES.register(bus);
        CONTAINERS.register(bus);
    }
}
