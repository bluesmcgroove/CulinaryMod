package bluesmcgroove.datagen;

import bluesmcgroove.setup.LCBItems;
import bluesmcgroove.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;


import java.util.function.Consumer;

public class LCBRecipes extends RecipeProvider {

    public LCBRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(LCBItems.IRONKNIFE.get())
                .pattern("x")
                .pattern("s")
                .define('x', Tags.Items.INGOTS_IRON)
                .define('s', Items.STICK)
                .group("culinarymod")
                .unlockedBy("iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(LCBItems.TOMATOSLICE.get())
                .group("culinarymod")
                .requires(LCBItems.IRONKNIFE.get())
                .requires(LCBItems.TOMATOFRUIT.get())
                .unlockedBy("ironknife", InventoryChangeTrigger.TriggerInstance.hasItems(LCBItems.IRONKNIFE.get()))
                .save(consumer);
    }
}
