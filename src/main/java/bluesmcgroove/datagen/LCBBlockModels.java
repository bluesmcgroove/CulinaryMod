package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBBlockModels extends BlockModelProvider {
    public LCBBlockModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, LCB.ID, existingFileHelper);
    }

    @Override
    public void registerModels(){
        //register block models here for generation


    }
}
