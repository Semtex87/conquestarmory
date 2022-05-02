package com.epinephrine.conquestarmory.util;

import com.epinephrine.conquestarmory.item.Citems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;

public enum CItemTier implements IItemTier
{
    TRASH(0, 10, 0.5f, 1, 0, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    // TIER 0 : TRASH < BONE == WOOD
    BONE(1, 40, 1.5f, 2, 5, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    WOOD(1, 40, 1.5f, 2, 5, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    // TIER 1 : TRASH < BONE == WOOD
    COPPER(1, 50, 2f, 4, 10, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    BRONZE(1, 80, 2f, 5, 10, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    ROOT(1, 80, 2f, 5, 10,Ingredient.fromStacks(new ItemStack(Items.OAK_WOOD))),
    IRON(2, 80, 2f, 7, 10, Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT))),
    // TIER 2 : DWARVEN,ELVEN,STEEL,PLATE,ORC
    DWARVEN(2, 80, 2f, 3, 10, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    STEEL(3, 80, 2f, 3, 10, Ingredient.fromStacks(new ItemStack(Citems.STEELINGOT.get()))),
    // TIER 3 : DIAMOND,HEAVYPLATE
    DIAMOND(3, 80, 2f, 3, 10, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    XENTHIUM(3, 80, 2f, 3, 10, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get()))),
    // TIER 4 : DIAMOND,HEAVYPLATE
    ORC(3, 140, 2f, 4, 14, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get()))),
    // TIER 5 : DIAMOND,HEAVYPLATE

    // TIER 6 : UNIQUE
    UNIQUEITEM(6, 1500, 9.0F, 9.0F, 50, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    CItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }

}