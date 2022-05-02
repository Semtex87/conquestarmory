package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;


import javax.annotation.Nullable;

public class ShieldT3 extends ShieldItem
{
    public ShieldT3()
    {
       super(new Properties().group(Citemgroup.CAARMOR).maxDamage(260));
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity)
    {
        return true;
    }
}
