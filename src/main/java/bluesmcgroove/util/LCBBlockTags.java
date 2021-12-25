package bluesmcgroove.util;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBBlockTags extends BlockTagsProvider {
    public LCBBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.MODID, helper);
    }


    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Registration.BUTCHERBLOCK.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.BUTCHERBLOCK.get());
    }

    @Override
    public String getName() {
        return "Le Cordon Blues Tags";
    }
}
