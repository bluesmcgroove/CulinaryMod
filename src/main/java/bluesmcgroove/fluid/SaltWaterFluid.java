package bluesmcgroove.fluid;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBBlocks;
import bluesmcgroove.setup.LCBFluids;
import bluesmcgroove.setup.LCBItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import javax.annotation.Nonnull;

public abstract class SaltWaterFluid extends ForgeFlowingFluid {

    @Nonnull
    public static final ForgeFlowingFluid.Properties SALTWATER_PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    LCBFluids.SALTWATER_FLUID, LCBFluids.SALTWATER_FLOWING, FluidAttributes
                    .builder(new ResourceLocation(LCB.ID,
                                    "block/salt_water"),
                            new ResourceLocation(LCB.ID,
                                    "block/salt_water_flow"))
                    .color(0xbf1D6595))
                    .bucket(LCBItems.SALTWATER_BUCKET)
                    .block(LCBBlocks.SALTWATER);

    protected SaltWaterFluid(Properties properties) {
        super(properties);
    }

    public static class Flowing extends SaltWaterFluid {

        public Flowing(@Nonnull final Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        @Override
        public int getAmount(@Nonnull final FluidState fluidState) {
            return fluidState.getValue(LEVEL);
        }

        @Override
        public boolean isSource(@Nonnull final FluidState state) {
            return false;
        }

        @Override
        public void createFluidStateDefinition(@Nonnull final StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }
    }

    public static class Source extends SaltWaterFluid {
        public Source(@Nonnull final Properties properties) {
            super(properties);
        }

        @Override
        public int getAmount(@Nonnull final FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isSource(@Nonnull final FluidState state) {
            return true;
        }
    }
}