package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;



public class Musket extends CrossbowItem
{
    public Musket()
    {
        super(new Properties().group(Citemgroup.CAWEAPON).maxDamage(220));
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 72000;
    }

}