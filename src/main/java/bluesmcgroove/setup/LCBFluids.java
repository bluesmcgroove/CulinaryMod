package bluesmcgroove.setup;

import bluesmcgroove.LCB;
import bluesmcgroove.fluid.SaltWaterFluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LCBFluids {


    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, LCB.ID);

    // Fluids
    public static final RegistryObject<FlowingFluid> SALTWATER_FLUID = FLUIDS.register("saltwater_fluid", () -> new SaltWaterFluid.Source(SaltWaterFluid.SALTWATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SALTWATER_FLOWING = FLUIDS.register("saltwater_flowing", () -> new SaltWaterFluid.Flowing(SaltWaterFluid.SALTWATER_PROPERTIES));


    public static void register(IEventBus bus) {
        FLUIDS.register(bus);
    }
}
