package com.epinephrine.conquestarmory.util;

import com.epinephrine.conquestarmory.item.Citems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Citemgroup {
    public static final ItemGroup CARMORYTAB = new ItemGroup("carmorytab")
    {   @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Citems.IRONCHAINS.get());
        }
    };

    public static final ItemGroup CAARMOR = new ItemGroup("caarmor")
    {   @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Citems.DWARVEN_HELMET.get());
        }
    };
    public static final ItemGroup CAWEAPON = new ItemGroup("caweapon")
    {   @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Citems.BROADAXE.get());
        }
    };
    public static final ItemGroup CAFOOD = new ItemGroup("cafood")
    {   @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Citems.ONION.get());
        }
    };
    public static final ItemGroup CAMISC = new ItemGroup("camisc")
    {   @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Citems.IRONPLATES.get());
        }
    };
}
