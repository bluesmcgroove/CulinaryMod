package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = LCB.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new LCBRecipes(generator));
            generator.addProvider(new LCBLootTables(generator));
            generator.addProvider(new LCBBlockTagsProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new LCBFluidTagProvider(generator, event.getExistingFileHelper()));
        }

        if (event.includeClient()) {
            generator.addProvider(new LCBBlockStateProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new LCBItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new LCBLanguageProvider(generator, "en_us"));
        }
    }
}
