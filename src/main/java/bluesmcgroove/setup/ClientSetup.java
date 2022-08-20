package bluesmcgroove.setup;

import bluesmcgroove.LCB;
import bluesmcgroove.block.entity.container.ButcherBlockScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LCB.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(LCBBlocks.BUTCHERBLOCK_CONTAINER.get(), ButcherBlockScreen::new);

        });

//        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LCBBlocks.TOMATO_CROP.get(), RenderType.cutout());
    }
}