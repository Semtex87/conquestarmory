package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;


import javax.annotation.Nullable;

public class ShieldT6 extends ShieldItem
{
    public ShieldT6()
    {
       super(new Properties().group(Citemgroup.CAARMOR).maxDamage(700));
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity)
    {
        return true;
    }
}
