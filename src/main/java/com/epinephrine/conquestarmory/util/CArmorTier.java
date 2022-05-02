package com.epinephrine.conquestarmory.util;

import com.epinephrine.conquestarmory.Conquestarmory;
import com.epinephrine.conquestarmory.item.Citems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CArmorTier implements IArmorMaterial {
//ARMORS
//TRASH
    CHEAP(Conquestarmory.MOD_ID + ":cheap", SoundEvents.BLOCK_WOOL_PLACE, Ingredient.fromStacks(new ItemStack(Citems.LINEN.get())),
        20, new int[] { 1, 2, 3, 2 }, 4, 0, 0.0f),
//TIER 0
    BONE(Conquestarmory.MOD_ID + ":bone", SoundEvents.ENTITY_SKELETON_HURT, Ingredient.fromStacks(new ItemStack(Items.BONE)),
            40, new int[] { 1, 2, 3, 2 }, 10, 0, 0.0f),
    ROOT(Conquestarmory.MOD_ID + ":root", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            40, new int[] { 1, 2, 3, 2 }, 10, 0, 0.0f),
    SKELETAL(Conquestarmory.MOD_ID + ":skeletal", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            40, new int[] { 1, 2, 3, 2 }, 10, 0, 0.0f),
    COPPER(Conquestarmory.MOD_ID + ":copper", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())),
            80, new int[] { 2, 7, 5, 3 }, 10, 1, 0.0f),
//TIER 1
    ROGUE(Conquestarmory.MOD_ID + ":rogue", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Items.LEATHER)),
            40, new int[] { 1, 2, 3, 2 }, 4, 0, 0.0f),
    THIEF(Conquestarmory.MOD_ID + ":thief", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Items.LEATHER)),
            40, new int[] { 1, 2, 3, 2 }, 4, 0, 0.0f),
    NORMAN(Conquestarmory.MOD_ID + ":norman", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Citems.IRONCHAINS.get())),
            120, new int[] { 1, 4, 5, 2 }, 10, 1, 0.0f),
    NORTH(Conquestarmory.MOD_ID + ":north", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Citems.IRONCHAINS.get())),
            120, new int[] { 1, 4, 5, 2 }, 10, 1, 0.0f),
    VIKING(Conquestarmory.MOD_ID + ":north", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Citems.IRONCHAINS.get())),
            120, new int[] { 1, 4, 5, 2 }, 10, 1, 0.0f),
    BRONZE(Conquestarmory.MOD_ID + ":bronze", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())),
            100, new int[] { 2, 7, 5, 3 }, 20, 1, 0.0f),
    BROTHERHOOD(Conquestarmory.MOD_ID + ":brotherhood", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    LONGBOWARCHER(Conquestarmory.MOD_ID + ":longbowarcher", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
//TIER 2
    CRUSADER(Conquestarmory.MOD_ID + ":crusader", SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            110, new int[] { 1, 2, 3, 2 }, 4, 0, 0.0f),
    CHAIN1(Conquestarmory.MOD_ID + ":chainmail1", SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.fromStacks(new ItemStack(Citems.IRONCHAINS.get())),
            120, new int[] { 1, 4, 5, 2 }, 10, 1, 0.0f),
    CHAIN2(Conquestarmory.MOD_ID + ":chainmail2", SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.fromStacks(new ItemStack(Citems.IRONCHAINS.get())),
            120, new int[] { 1, 4, 5, 2 }, 10, 1, 0.0f),
    FOOTSOLDIER(Conquestarmory.MOD_ID + ":footsoldier", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.STEELINGOT.get())),
            140, new int[] { 2, 7, 5, 3 }, 20, 1, 0.0f),
    KINGSTONE(Conquestarmory.MOD_ID + ":kingstone", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.STEELINGOT.get())),
            140, new int[] { 2, 7, 5, 3 }, 20, 1, 0.0f),
    SPOTTEDFOOTSOLDIER(Conquestarmory.MOD_ID + ":spottedfootsoldier", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.STEELINGOT.get())),
            140, new int[] { 2, 7, 5, 3 }, 20, 1, 0.0f),
    DWARVEN(Conquestarmory.MOD_ID + ":dwarven", SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            160, new int[] { 1, 3, 5, 2 }, 18, 0, 0.0f),
    ELVEN(Conquestarmory.MOD_ID + ":elven", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            160, new int[] { 1, 3, 5, 2 }, 18, 0, 0.0f),
    FANCYGAMBESON(Conquestarmory.MOD_ID + ":fancygambeson", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            160, new int[] { 1, 3, 5, 2 }, 4, 0, 0.0f),
//TIER 3
    HEAVYFOOTSOLDIER(Conquestarmory.MOD_ID + ":heavyfootsoldier", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            200, new int[] { 1, 4, 5, 2 }, 18, 0, 0.2f),
    KNIGHT(Conquestarmory.MOD_ID + ":knight", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            200, new int[] { 1, 4, 5, 2 }, 20, 0, 0.2f),
    HIGH(Conquestarmory.MOD_ID + ":high", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            180, new int[] { 1, 4, 5, 2 }, 20, 0, 0.2f),
    LEGIONNAIRE(Conquestarmory.MOD_ID + ":legionnaire", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    SARACEN(Conquestarmory.MOD_ID + ":saracen", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
//TIER 4
    HEAVYHIGH(Conquestarmory.MOD_ID + ":heavyhigh", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
        200, new int[] { 1, 4, 5, 2 }, 20, 0, 0.2f),
    ORC(Conquestarmory.MOD_ID + ":orc", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            240, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    STEEL(Conquestarmory.MOD_ID + ":steel", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            200, new int[] { 3, 6, 6, 3 }, 15, 0, 0.1f),
    TOURNEY(Conquestarmory.MOD_ID + ":tourney", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    ENGLISHKNIGHT(Conquestarmory.MOD_ID + ":english_knight", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    FRENCHKNIGHT(Conquestarmory.MOD_ID + ":french_knight", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
//TIER 5
    ICE(Conquestarmory.MOD_ID + ":ice", SoundEvents.BLOCK_GLASS_BREAK, Ingredient.fromStacks(new ItemStack(Items.PACKED_ICE)),
        150, new int[] { 1, 4, 5, 2 }, 10, 0, 0.1f),
    XENTHIUM(Conquestarmory.MOD_ID + ":xenthium", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            200, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    BLACKLEGION(Conquestarmory.MOD_ID + ":blacklegion", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    LORDOFWESTWICK(Conquestarmory.MOD_ID + ":lord_of_westwick", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            220, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    ROSEPLATE(Conquestarmory.MOD_ID + ":roseplate", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            200, new int[] { 1, 5, 5, 3 }, 15, 0, 0.1f),
    LORD(Conquestarmory.MOD_ID + ":lord", SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            180, new int[] { 1, 4, 5, 2 }, 15, 0, 0.1f),
    MAJESTIC(Conquestarmory.MOD_ID + ":majestic", SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
            190, new int[] { 1, 4, 5, 2 }, 15, 0, 0.1f),
    BLACKKNIGHT(Conquestarmory.MOD_ID + ":blackknight", SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())),
            200, new int[] { 3, 6, 8, 3 }, 10, 2.0f, 0.0f),
//TIER 6
    MITHRIL(Conquestarmory.MOD_ID + ":mithril", SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromStacks(new ItemStack(Citems.IRONPLATES.get())),
        280, new int[] { 2, 5, 6, 3 }, 15, 0, 0.1f),
    EVIL(Conquestarmory.MOD_ID + ":evil", SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT)),
            340, new int[] { 5, 8, 10, 6 }, 30, 2, 0.4f),
//SPECIAL
    DWARVENCROWN(Conquestarmory.MOD_ID + ":dwarvencrown", SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())),
            100, new int[] { 2, 0, 0, 0 }, 10, 0, 0.0f),
    ELVENCROWN(Conquestarmory.MOD_ID + ":elvencrown", SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, Ingredient.fromStacks(new ItemStack(Citems.MAGICDUST.get())),
            100, new int[] { 2, 0, 0, 0 }, 10, 0, 0.0f);








    private final String name;
    private final SoundEvent soundEvent;
    private final Ingredient repairMaterial;
    private final int durability;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final float toughness;
    private final float knockbackResistance;

    CArmorTier(String name, SoundEvent soundEvent, Ingredient repairMaterial, int durability, int[] damageReductionAmountArray, int enchantability, float toughness, float knockbackResistance) {
        this.name = name;
        this.soundEvent = soundEvent;
        this.repairMaterial = repairMaterial;
        this.durability = durability;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}