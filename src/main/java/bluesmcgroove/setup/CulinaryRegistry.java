package bluesmcgroove.setup;

import net.minecraft.world.food.*;
import net.minecraft.world.item.Item;


public class CulinaryRegistry extends Item {

    public static final FoodProperties TOMATOFRUIT = (new FoodProperties.Builder()).nutrition(2).saturationMod(1.2F).build();
    public static final FoodProperties TOMATOSLICE = (new FoodProperties.Builder()).nutrition(2).saturationMod(1.2F).build();

    public CulinaryRegistry(Properties properties) {
        super(properties);
    }
}
