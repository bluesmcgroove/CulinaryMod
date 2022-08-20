package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBFluidTagProvider extends FluidTagsProvider {

    public LCBFluidTagProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.ID, helper);
    }

    @Override
    public void addTags() {
        tag(FluidTags.WATER).add(LCBFluids.SALTWATER_FLUID.get());
        tag(FluidTags.WATER).add(LCBFluids.SALTWATER_FLOWING.get());
    }

    @Override
    public String getName() {
        return "LCB Fluid Tags";
    }
}
