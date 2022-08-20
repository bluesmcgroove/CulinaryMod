package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBFluidTagProvider extends FluidTagsProvider {

    public LCBFluidTagProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.ID, helper);
    }

    @Override
    public void addTags() {

    }

    @Override
    public String getName() {
        return "LCB Fluid Tags";
    }
}
