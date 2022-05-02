package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;


import javax.annotation.Nullable;

public class WitcherShield extends ShieldItem
{
    public WitcherShield()
    {
       super(new Item.Properties().group(Citemgroup.CAARMOR).maxDamage(200));
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity)
    {
        return true;
    }
}
