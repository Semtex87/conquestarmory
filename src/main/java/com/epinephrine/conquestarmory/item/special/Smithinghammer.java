package com.epinephrine.conquestarmory.item.special;

import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class Smithinghammer extends Item
{

    public Smithinghammer(Properties properties)
    {
        super(properties);
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack container = itemStack.copy();
        if(container.attemptDamageItem(1, random, null))
        {
              return ItemStack.EMPTY;
        } else {
            return container;
        }
    }
    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }


}
