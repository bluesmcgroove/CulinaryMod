package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class LCBBlockTagsProvider extends BlockTagsProvider {

    public LCBBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.ID, helper);
    }


    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE).add(LCBBlocks.BUTCHERBLOCK.get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(LCBBlocks.BUTCHERBLOCK.get());


    }

    @Override
    public String getName() {
        return "Le Cordon Blues Tags";
    }
}
