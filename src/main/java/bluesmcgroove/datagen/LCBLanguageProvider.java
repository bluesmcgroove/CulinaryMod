package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.setup.LCBBlocks;
import bluesmcgroove.setup.LCBItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static bluesmcgroove.block.ButcherBlock.SCREEN_BUTCHERBLOCK;
import static bluesmcgroove.setup.ModSetup.TAB_NAME;

public class LCBLanguageProvider extends LanguageProvider {

    public LCBLanguageProvider(DataGenerator gen, String locale) {
        super(gen, LCB.ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Le Cordon Blues");

        add(SCREEN_BUTCHERBLOCK, "Butcher Block");
        // Blocks
        add(LCBBlocks.BUTCHERBLOCK.get(), "Butcher Block");
        add(LCBBlocks.TOMATO_CROP.get(), "Tomato Crop");

        // Items
//        add(LCBItems.BUTCHERBLOCK_ITEM.get(), "Butcher Block"); // is this needed?
        add(LCBItems.IRONKNIFE.get(), "Iron Knife");
        add(LCBItems.SALTWATER_BUCKET.get(), "Saltwater Bucket");
        add(LCBItems.TOMATOFRUIT.get(), "Tomato");
        add(LCBItems.TOMATOSLICE.get(), "Sliced Tomato");
        add(LCBItems.TOMATO_SEEDS.get(), "Tomato Seeds");

        // Item hover text
        add("message." + LCBItems.IRONKNIFE.get(), "An iron knife for cooking");
    }

}
