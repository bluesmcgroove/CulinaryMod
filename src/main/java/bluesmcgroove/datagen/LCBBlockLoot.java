package bluesmcgroove.datagen;

import bluesmcgroove.block.TomatoCropBlock;
import bluesmcgroove.setup.LCBBlocks;
import bluesmcgroove.setup.LCBItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

public class LCBBlockLoot extends BlockLoot {

    protected void addTables() {
//        lootTables.put(LCBBlocks.BUTCHERBLOCK.get(), createStandardTable("butcherblock", LCBBlocks.BUTCHERBLOCK.get(), LCBBlocks.BUTCHERBLOCK_ENTITY.get()));
        this.dropSelf(LCBBlocks.BUTCHERBLOCK.get());
//        this.dropOther(LCBBlocks.BUTCHERBLOCK_ENTITY.get(), LCBBlocks.BUTCHERBLOCK.get());

        LootItemCondition.Builder conditionbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(LCBBlocks.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TomatoCropBlock.AGE, 7));
//        this.add(LCBBlocks.TOMATO_CROP.get(), createCropDrops(LCBBlocks.TOMATO_CROP.get(), LCBItems.TOMATOFRUIT.get(), LCBItems.TOMATO_SEEDS.get(), conditionbuilder));
        this.add(LCBBlocks.TOMATO_CROP.get(), applyExplosionDecay(LCBBlocks.TOMATO_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(LCBItems.TOMATO_SEEDS.get()))
                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))
                .withPool(LootPool.lootPool().when(conditionbuilder).add(LootItem.lootTableItem(LCBItems.TOMATOFRUIT.get())
                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 4))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return LCBBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
