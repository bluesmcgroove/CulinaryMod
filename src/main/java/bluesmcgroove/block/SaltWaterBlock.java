package bluesmcgroove.block;

import bluesmcgroove.setup.LCBFluids;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class SaltWaterBlock extends LiquidBlock {

    public SaltWaterBlock() {
        super(LCBFluids.SALTWATER_FLUID,
                BlockBehaviour.Properties.of(Material.WATER).noCollission()
                        .strength(100.0F).noDrops());
    }
}
