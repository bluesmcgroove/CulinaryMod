package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Blocks extends BlockModelProvider {
    public Blocks(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, LCB.MODID, existingFileHelper);
    }

    @Override
    public void registerModels(){
        //register block models here for generation

    }
}
