package bluesmcgroove.datagen;

import bluesmcgroove.setup.LCBBlocks;
import net.minecraft.data.DataGenerator;

public class LCBLootTables extends BaseLootTableProvider {

    public LCBLootTables(DataGenerator dataGeneratorIn){
        super(dataGeneratorIn);
    }

    protected void addTables() {
        lootTables.put(LCBBlocks.BUTCHERBLOCK.get(), createStandardTable("butcherblock", LCBBlocks.BUTCHERBLOCK.get(), LCBBlocks.BUTCHERBLOCK_ENTITY.get()));
    }

}
