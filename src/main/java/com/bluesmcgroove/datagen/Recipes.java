package com.bluesmcgroove.datagen;

import com.bluesmcgroove.culinarycraft.CulinaryCraft;
import com.bluesmcgroove.items.IronKnife;
import com.bluesmcgroove.items.TomatoFruit;
import com.bluesmcgroove.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;


import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Registration.IRONKNIFE.get())
                .pattern("x")
                .pattern("s")
                .define('x', Tags.Items.INGOTS_IRON)
                .define('s', Items.STICK)
                .group("culinarycraft")
                .unlockedBy("iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.TOMATOSLICE.get())
                .group("culinarycraft")
                .requires(Registration.IRONKNIFE.get())
                .requires(Registration.TOMATOFRUIT.get())
                .unlockedBy("ironknife", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRONKNIFE.get()))
                .save(consumer);
    }
}
