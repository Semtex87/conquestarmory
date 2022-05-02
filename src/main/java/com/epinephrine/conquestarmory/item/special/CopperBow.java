package com.epinephrine.conquestarmory.item.special;

import com.epinephrine.conquestarmory.util.Citemgroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;


public class CopperBow extends BowItem
{
    public CopperBow()
    {
        super(new Item.Properties().group(Citemgroup.CAWEAPON).maxDamage(180));
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 72000;
    }
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
            tooltip.add(new StringTextComponent( "\u00A76" + "What an unique Bow!!! " +"\u00A76"));
            super.addInformation(stack, world, tooltip, flag);
    }

}