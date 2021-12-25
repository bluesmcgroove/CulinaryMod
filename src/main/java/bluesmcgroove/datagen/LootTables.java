package bluesmcgroove.datagen;

import bluesmcgroove.setup.Registration;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn){
        super(dataGeneratorIn);
    }

    protected void addTables() {
        lootTables.put(Registration.BUTCHERBLOCK.get(), createStandardTable("butcherblock", Registration.BUTCHERBLOCK.get(), Registration.BUTCHERBLOCK_ENTITY.get()));
    }

}
