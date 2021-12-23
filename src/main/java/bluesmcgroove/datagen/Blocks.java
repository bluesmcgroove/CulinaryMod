package bluesmcgroove.datagen;

import bluesmcgroove.CulinaryMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Blocks extends BlockModelProvider {
    public Blocks(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CulinaryMod.MODID, existingFileHelper);
    }

    @Override
    public void registerModels(){
        //register block models here for generation


    }
}
