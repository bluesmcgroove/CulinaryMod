package bluesmcgroove.setup;

import bluesmcgroove.block.entity.container.ButcherBlockScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(LCBBlocks.BUTCHERBLOCK_CONTAINER.get(), ButcherBlockScreen::new);

        });

//        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LCBFluids.SALTWATER_FLOWING.get(), RenderType.translucent());
    }
}