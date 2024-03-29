package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.util.LCBBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = LCB.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new Recipes(generator));
            generator.addProvider(new LootTables(generator));
            generator.addProvider(new LCBBlockTags(generator, event.getExistingFileHelper()));
        }

        if (event.includeClient()) {
            generator.addProvider(new Items(generator, event.getExistingFileHelper()));
        }
    }
}
