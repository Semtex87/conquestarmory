package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;


import javax.annotation.Nullable;
import java.util.List;

public class ShieldT1 extends ShieldItem
{
    public ShieldT1()
    {
       super(new Properties().group(Citemgroup.CAARMOR).maxDamage(160));
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity)
    {
        return true;
    }
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        tooltip.add(new StringTextComponent( "\u00A76" + "common shield, 160 durability"+ "\u00A76"));
        super.addInformation(stack, world, tooltip, flag);
    }
}
