package bluesmcgroove.datagen;

import bluesmcgroove.culinarycraft.CulinaryCraft;
import bluesmcgroove.setup.CulinaryRegistry;
import bluesmcgroove.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Blocks extends BlockModelProvider {
    public Blocks(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CulinaryCraft.MODID, existingFileHelper);
    }

    @Override
    public void registerModels(){
        //register block models here for generation


    }
}
