package bluesmcgroove.setup;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registration {

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LCBItems.register(bus);
        LCBBlocks.register(bus);
        LCBFluids.register(bus);
//        ENTITIES.register(bus);

    }

}
