package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBItemModels extends ItemModelProvider {

    public LCBItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, LCB.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        getBuilder(LCBItems.IRONKNIFE.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/ironknife");
        getBuilder(LCBItems.TOMATOFRUIT.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/tomatofruit");
        getBuilder(LCBItems.TOMATOSLICE.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/tomatoslice");
        getBuilder(LCBItems.SALTWATER_BUCKET.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/saltwater_bucket");
        //withExistingParent(LCBItems.BUTCHERBLOCK_ITEM.get().getRegistryName().getPath(), new ResourceLocation(LCB.MODID, "block/butcherblock"));
   }

}
