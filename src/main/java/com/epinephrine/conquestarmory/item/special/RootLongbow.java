package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;



public class RootLongbow extends BowItem
{
    public RootLongbow()
    {
        super(new Properties().group(Citemgroup.CAWEAPON).maxDamage(200));
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 72000;
    }

}