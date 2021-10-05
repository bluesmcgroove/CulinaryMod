package com.bluesmcgroove.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class IronKnife extends SwordItem {
    public IronKnife(Properties properties) {
        super(Tiers.IRON, 2, -2.4F, properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        final ItemStack damagedStack = itemStack.copy();
        if(damagedStack.hurt(1, null, null)) {
            damagedStack.setDamageValue(0);
        }
        return damagedStack;

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        list.add(new TranslatableComponent("message.ironknife"));
    }

}
