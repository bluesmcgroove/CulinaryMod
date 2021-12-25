package bluesmcgroove.setup;

import bluesmcgroove.block.entity.container.ButcherBlockScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void setup(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            MenuScreens.register(Registration.BUTCHERBLOCK_CONTAINER.get(), ButcherBlockScreen::new);

        });
    }
}