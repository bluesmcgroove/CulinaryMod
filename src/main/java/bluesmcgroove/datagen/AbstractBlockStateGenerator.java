package bluesmcgroove.datagen;

import bluesmcgroove.LCB;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public abstract class AbstractBlockStateGenerator extends BlockStateProvider {

    @Nonnull protected static final String PARTICLE_TAG = "particle";

    protected AbstractBlockStateGenerator(
            @Nonnull final DataGenerator gen,
            @Nonnull final String modId,
            @Nonnull final ExistingFileHelper exFileHelper) {
        super(gen, modId, exFileHelper);
    }

    @Nonnull
    protected ResourceLocation lcbLoc(@Nonnull final String string) {
        return new ResourceLocation(LCB.ID, string);
    }

    protected void basicBlock(@Nonnull final Block block) {
        simpleItemBlock(block, cubeAll(block));
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

    protected void simpleItemBlock(@Nonnull final Block block, @Nonnull final ModelFile modelFile) {
        simpleBlock(block, modelFile);
        simpleBlockItem(block, modelFile);
    }

    @Nullable
    protected String getRegistryName(@Nonnull final Block b) {
        @Nullable final ResourceLocation resourceLocation = ForgeRegistries.BLOCKS.getKey(b);
        if (resourceLocation != null) {
            return resourceLocation.toString();
        }
        return null;
    }

//    protected void createBarrel(@Nonnull final Block block, @Nonnull final ResourceLocation texture) {
//        @Nonnull
//        final ConfiguredModel model =
//                new ConfiguredModel(
//                        models()
//                                .withExistingParent(getRegistryName(block), exnihiloLoc("block/barrel"))
//                                .texture("texture", texture)
//                                .texture(PARTICLE_TAG, texture));
//
//        simpleItemBlock(block, model.model);
//    }

//    protected void createCake(@Nonnull final Block block) {
//        @Nonnull final VariantBlockStateBuilder builder = getVariantBuilder(block);
//
//        for (int i = 1; i < 7; i++) {
//            VariantBlockStateBuilder.PartialBlockstate partialBlockstate = builder.partialState();
//            @Nonnull
//            final ConfiguredModel model =
//                    new ConfiguredModel(models().getExistingFile(exnihiloLoc("block/cake_slice" + i)));
//            partialBlockstate.with(BITES, i).addModels(model);
//        }
//        VariantBlockStateBuilder.PartialBlockstate partialBlockstate = builder.partialState();
//        @Nonnull
//        final ConfiguredModel model =
//                new ConfiguredModel(models().getExistingFile(exnihiloLoc("block/cake_uneaten")));
//        partialBlockstate.with(BITES, 0).addModels(model);
//    }

}