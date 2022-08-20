package bluesmcgroove;

import bluesmcgroove.setup.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LCB.ID)
public class LCB
{
    public static final String ID = "lcb";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public LCB() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();


        LCBItems.register(modBus);
        LCBBlocks.register(modBus);
        LCBFluids.register(modBus);

        // Register the setup method for modloading

        modBus.addListener(this::setup);
        // Register the ModSetup method for modloading
        modBus.addListener(ModSetup::init);
        // Register the ClientSetup method for modloading
        modBus.addListener(ClientSetup::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(final ServerStartingEvent event) {
        //LOGGER.info("HELLO from server starting");
    }

}
