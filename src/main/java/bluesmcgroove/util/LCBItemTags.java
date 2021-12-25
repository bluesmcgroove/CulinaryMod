package bluesmcgroove.util;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class LCBItemTags extends ItemTagsProvider {
    public LCBItemTags(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper helper) {
        super(generator, blockTags, LCB.MODID, helper);
    }

    @Override
    protected void addTags() {

    }


}
