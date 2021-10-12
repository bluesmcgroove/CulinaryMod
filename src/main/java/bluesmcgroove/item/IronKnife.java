package bluesmcgroove.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class IronKnife extends SwordItem {
    public IronKnife(Properties properties) {
        super(Tiers.IRON, 2, -2.4F, properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 320;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        final ItemStack damagedStack = itemStack.copy();
        if(damagedStack.hurt(1, null, null)) {
            damagedStack.setDamageValue(0);
            damagedStack.shrink(1);
        }
        return damagedStack;

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        list.add(new TranslatableComponent("message.ironknife"));
    }

}
