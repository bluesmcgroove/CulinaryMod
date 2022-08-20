package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import bluesmcgroove.block.TomatoCropBlock;
import bluesmcgroove.setup.LCBBlocks;
import bluesmcgroove.setup.LCBFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Function;

public class LCBBlockStateProvider extends BlockStateProvider {
    @Nonnull protected static final String PARTICLE_TAG = "particle";

    public LCBBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, LCB.ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerFluids();
        registerSimpleBlocks();
        registerCrops();
    }

    private void registerFluids() {
        registerFluid(LCBFluids.SALTWATER_FLUID.get());
    }

    private void registerCrops() {
        makeCrop((TomatoCropBlock)LCBBlocks.TOMATO_CROP.get(), "tomato_crop_stage", "tomato_crop_stage");
    }

    private void registerSimpleBlocks() {

    }

    protected void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(block.getAgeProperty()),
                new ResourceLocation(LCB.ID, "block/" + textureName + state.getValue(block.getAgeProperty()))));

        return models;
    }

    protected void registerFluid(@Nonnull final Fluid fluid) {
        @Nonnull final ResourceLocation stillTexture = fluid.getAttributes().getStillTexture();
        @Nullable final ResourceLocation resourceLocation = fluid.getRegistryName();
        if (resourceLocation != null) {
            @Nonnull final ModelFile model = models().getBuilder("block/" + resourceLocation.getPath())
                    .texture(PARTICLE_TAG, stillTexture);
            getVariantBuilder(fluid.defaultFluidState().createLegacyBlock().getBlock()).partialState()
                    .setModels(new ConfiguredModel(model));
        }
    }
}
