package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBFluids;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBBlockStateProvider extends AbstractBlockStateGenerator {

    public LCBBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerFluids();
    }

    private void registerFluids() {
        registerFluid(LCBFluids.SALTWATER_FLUID.get());
    }
}
