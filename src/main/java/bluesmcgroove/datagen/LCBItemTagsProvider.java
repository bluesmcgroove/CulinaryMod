package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class LCBItemTagsProvider extends ItemTagsProvider {
    public LCBItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper helper) {
        super(generator, blockTags, LCB.ID, helper);
    }

    @Override
    protected void addTags() {

    }


}
