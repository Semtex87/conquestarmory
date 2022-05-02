package com.epinephrine.conquestarmory.block;

import com.epinephrine.conquestarmory.Conquestarmory;
import com.epinephrine.conquestarmory.util.Citemgroup;
import com.epinephrine.conquestarmory.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class Cblocks
{
    public static void register() { }
    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().group(Citemgroup.CARMORYTAB)));
        return toReturn;
    }
}
