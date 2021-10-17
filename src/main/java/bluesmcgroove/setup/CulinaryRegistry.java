package bluesmcgroove.setup;

import net.minecraft.world.food.*;
import net.minecraft.world.item.Item;


public class CulinaryRegistry extends Item {

    public static final FoodProperties TOMATOFRUIT = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.5F).build();
    public static final FoodProperties TOMATOSLICE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();

    public CulinaryRegistry(Properties properties) {
        super(properties);
    }
}
