package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;



public class SteelLongWarbow extends BowItem
{
    public SteelLongWarbow()
    {
        super(new Properties().group(Citemgroup.CAWEAPON).maxDamage(220));
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 72000;
    }

}