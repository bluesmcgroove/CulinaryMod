package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, LCB.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        getBuilder(Registration.IRONKNIFE.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/ironknife");
        getBuilder(Registration.TOMATOFRUIT.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/tomatofruit");
        getBuilder(Registration.TOMATOSLICE.get().getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/tomatoslice");
   }

}
