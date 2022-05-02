package com.epinephrine.conquestarmory.item;

import com.epinephrine.conquestarmory.item.special.Smithinghammer;
import com.epinephrine.conquestarmory.item.special.*;
import com.epinephrine.conquestarmory.item.weapon.BluntWeapon;
import com.epinephrine.conquestarmory.item.weapon.GreatWeapon;
import com.epinephrine.conquestarmory.item.weapon.HiddenWeapon;
import com.epinephrine.conquestarmory.util.CArmorTier;
import com.epinephrine.conquestarmory.util.CItemTier;
import com.epinephrine.conquestarmory.util.Citemgroup;
import com.epinephrine.conquestarmory.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

import java.util.Properties;


public class Citems
{
    //MISC
    public static final RegistryObject<Item> IRONCHAINS = Registration.ITEMS.register("ironchains",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> IRONPLATES = Registration.ITEMS.register("ironplates",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> BOWSTRING = Registration.ITEMS.register("bowstring",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> BOWLIMBS = Registration.ITEMS.register("bowlimbs",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> MAGICDUST = Registration.ITEMS.register("magicdust",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> SMITHINGHAMMER = Registration.ITEMS.register("smithinghammer",
            () -> new Smithinghammer(new Item.Properties().group(Citemgroup.CAMISC).maxDamage(32)));
    public static final RegistryObject<Item> RAWBLADE = Registration.ITEMS.register("raw_blade",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> LEATHERSTRIPES = Registration.ITEMS.register("leatherstripes",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> STEELINGOT = Registration.ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> IRONANDCOAL = Registration.ITEMS.register("iron_and_coal",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> NEEDLE = Registration.ITEMS.register("needle",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> SMALLCHISEL = Registration.ITEMS.register("smallchisel",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> TONGS = Registration.ITEMS.register("tongs",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> HANDSAW = Registration.ITEMS.register("handsaw",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> SCREWDRIVER = Registration.ITEMS.register("screwdriver",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> FILE = Registration.ITEMS.register("file",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> KNIFE = Registration.ITEMS.register("knife",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> BOWSAW = Registration.ITEMS.register("bowsaw",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> LINEN = Registration.ITEMS.register("linen",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> PELT = Registration.ITEMS.register("pelt",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> GOLDPLATES = Registration.ITEMS.register("goldplates",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> STEELPLATES = Registration.ITEMS.register("steelplates",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> BRONZEPLATES = Registration.ITEMS.register("bronzeplates",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> RUNEDUST = Registration.ITEMS.register("runedust",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> BONEAMULET = Registration.ITEMS.register("bone_amulet",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> IRONRIVETS = Registration.ITEMS.register("iron_rivets",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> IRONFITTINGS = Registration.ITEMS.register("iron_fittings",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
    public static final RegistryObject<Item> COPPERANDTIN = Registration.ITEMS.register("copper_and_tin_ore",
            () -> new Item(new Item.Properties().group(Citemgroup.CAMISC)));
//--------------------------------------------------------------------------------------------------------------------//
//FOOD
    public static final RegistryObject<Item> BANANA = Registration.ITEMS.register("food_banana",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(2).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> CARAMEL = Registration.ITEMS.register("food_caramel",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(3).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BEANS = Registration.ITEMS.register("food_beans",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BEAUTYBERRY = Registration.ITEMS.register("food_beautyberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BILBERRY = Registration.ITEMS.register("food_bilberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BLACKBERRY = Registration.ITEMS.register("food_blackberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BOGBLUEBERRY = Registration.ITEMS.register("food_bogblueberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BOTTLEOFWINE = Registration.ITEMS.register("food_bottleofwine",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(3).fastToEat().setAlwaysEdible().effect(new EffectInstance(Effects.NAUSEA, 30,1),0.1f).build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> CABBAGE = Registration.ITEMS.register("food_cabbage",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(2).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> CHERRY = Registration.ITEMS.register("food_cherry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> CITRUS = Registration.ITEMS.register("food_citrus",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> COCOABEANS = Registration.ITEMS.register("food_cocoa_beans",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> CORN = Registration.ITEMS.register("food_corn",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> GRAPES = Registration.ITEMS.register("food_grapes",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> HAWTHORN = Registration.ITEMS.register("food_hawthorn",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> HOLLYBERRY = Registration.ITEMS.register("food_hollyberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> LEGUMES = Registration.ITEMS.register("food_legumes",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> LIME = Registration.ITEMS.register("food_lime",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> LINGONBERRY = Registration.ITEMS.register("food_lingonberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> ONION = Registration.ITEMS.register("food_onion",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> PEAR = Registration.ITEMS.register("food_pear",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> PLUM = Registration.ITEMS.register("food_plum",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> RASPBERRY = Registration.ITEMS.register("food_raspberry",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> RICE = Registration.ITEMS.register("food_rice",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> ROWAN = Registration.ITEMS.register("food_rowan",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BERRYMIX = Registration.ITEMS.register("food_berrymix",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(4).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BASICPIZZA = Registration.ITEMS.register("food_basic_pizza",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(7).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> BREAD02 = Registration.ITEMS.register("food_bread_02",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(4).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> DORSETCHEESE = Registration.ITEMS.register("food_dorset_cheese",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(7).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> GRILLEDSHASHLIK = Registration.ITEMS.register("food_grilled_shashlik",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(7).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> RAWSHASHLIK = Registration.ITEMS.register("food_raw_shashlik",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(5).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> SAUSAGES = Registration.ITEMS.register("food_sausages",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(6).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));
    public static final RegistryObject<Item> SPATZLE = Registration.ITEMS.register("food_spaetzle",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(7).fastToEat().setAlwaysEdible().build()).group(Citemgroup.CAFOOD)));



    //--------------------------------------------------------------------------------------------------------------------//
//ARMOR
    public static final RegistryObject<Item> CHEAP_BOOTS = Registration.ITEMS.register("cheap_boots",
            () -> new ArmorItem(CArmorTier.CHEAP, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHEAP_CHESTPLATE = Registration.ITEMS.register("cheap_chestplate",
            () -> new ArmorItem(CArmorTier.CHEAP, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHEAP_LEGGINGS = Registration.ITEMS.register("cheap_leggings",
            () -> new ArmorItem(CArmorTier.CHEAP, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHEAP_HELMET = Registration.ITEMS.register("cheap_helmet",
            () -> new ArmorItem(CArmorTier.CHEAP, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BONE_BOOTS = Registration.ITEMS.register("bone_boots",
        () -> new ArmorItem(CArmorTier.BONE, EquipmentSlotType.FEET,
                new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BONE_CHESTPLATE = Registration.ITEMS.register("bone_chestplate",
            () -> new ArmorItem(CArmorTier.BONE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BONE_LEGGINGS = Registration.ITEMS.register("bone_leggings",
            () -> new ArmorItem(CArmorTier.BONE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BONE_HELMET = Registration.ITEMS.register("bone_helmet",
            () -> new ArmorItem(CArmorTier.BONE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN1_BOOTS = Registration.ITEMS.register("chainmail1_boots",
            () -> new ArmorItem(CArmorTier.CHAIN1, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN1_CHESTPLATE = Registration.ITEMS.register("chainmail1_chestplate",
            () -> new ArmorItem(CArmorTier.CHAIN1, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN1_LEGGINGS = Registration.ITEMS.register("chainmail1_leggings",
            () -> new ArmorItem(CArmorTier.CHAIN1, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN1_HELMET = Registration.ITEMS.register("chainmail1_helmet",
            () -> new ArmorItem(CArmorTier.CHAIN1, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN2BOOTS = Registration.ITEMS.register("chainmail2_boots",
            () -> new ArmorItem(CArmorTier.CHAIN2, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN2_CHESTPLATE = Registration.ITEMS.register("chainmail2_chestplate",
            () -> new ArmorItem(CArmorTier.CHAIN2, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN2_LEGGINGS = Registration.ITEMS.register("chainmail2_leggings",
            () -> new ArmorItem(CArmorTier.CHAIN2, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CHAIN2_HELMET = Registration.ITEMS.register("chainmail2_helmet",
            () -> new ArmorItem(CArmorTier.CHAIN2, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BRONZE_BOOTS = Registration.ITEMS.register("bronze_boots",
            () -> new ArmorItem(CArmorTier.BRONZE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = Registration.ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(CArmorTier.BRONZE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = Registration.ITEMS.register("bronze_leggings",
            () -> new ArmorItem(CArmorTier.BRONZE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BRONZE_HELMET = Registration.ITEMS.register("bronze_helmet",
            () -> new ArmorItem(CArmorTier.BRONZE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKKNIGHT_BOOTS = Registration.ITEMS.register("blackknight_boots",
            () -> new ArmorItem(CArmorTier.BLACKKNIGHT, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKKNIGHT_CHESTPLATE = Registration.ITEMS.register("blackknight_chestplate",
            () -> new ArmorItem(CArmorTier.BLACKKNIGHT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKKNIGHT_LEGGINGS = Registration.ITEMS.register("blackknight_leggings",
            () -> new ArmorItem(CArmorTier.BLACKKNIGHT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKKNIGHT_HELMET = Registration.ITEMS.register("blackknight_helmet",
            () -> new ArmorItem(CArmorTier.BLACKKNIGHT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CRUSADER_BOOTS = Registration.ITEMS.register("crusader_boots",
            () -> new ArmorItem(CArmorTier.CRUSADER, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CRUSADER_CHESTPLATE = Registration.ITEMS.register("crusader_chestplate",
            () -> new ArmorItem(CArmorTier.CRUSADER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CRUSADER_LEGGINGS = Registration.ITEMS.register("crusader_leggings",
            () -> new ArmorItem(CArmorTier.CRUSADER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> CRUSADER_HELMET = Registration.ITEMS.register("crusader_helmet",
            () -> new ArmorItem(CArmorTier.CRUSADER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> DWARVEN_BOOTS = Registration.ITEMS.register("dwarven_boots",
            () -> new ArmorItem(CArmorTier.DWARVEN, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> DWARVEN_CHESTPLATE = Registration.ITEMS.register("dwarven_chestplate",
            () -> new ArmorItem(CArmorTier.DWARVEN, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> DWARVEN_LEGGINGS = Registration.ITEMS.register("dwarven_leggings",
            () -> new ArmorItem(CArmorTier.DWARVEN, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> DWARVEN_HELMET = Registration.ITEMS.register("dwarven_helmet",
            () -> new ArmorItem(CArmorTier.DWARVEN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> DWARVEN_CROWN = Registration.ITEMS.register("dwarven_crown",
            () -> new ArmorItem(CArmorTier.DWARVENCROWN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ELVEN_BOOTS = Registration.ITEMS.register("elven_boots",
            () -> new ArmorItem(CArmorTier.ELVEN, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ELVEN_CHESTPLATE = Registration.ITEMS.register("elven_chestplate",
            () -> new ArmorItem(CArmorTier.ELVEN, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ELVEN_LEGGINGS = Registration.ITEMS.register("elven_leggings",
            () -> new ArmorItem(CArmorTier.ELVEN, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ELVEN_HELMET = Registration.ITEMS.register("elven_helmet",
            () -> new ArmorItem(CArmorTier.ELVEN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ELVEN_CROWN = Registration.ITEMS.register("elven_crown",
            () -> new ArmorItem(CArmorTier.ELVENCROWN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> EVIL_BOOTS = Registration.ITEMS.register("evil_boots",
            () -> new ArmorItem(CArmorTier.EVIL, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> EVIL_CHESTPLATE = Registration.ITEMS.register("evil_chestplate",
            () -> new ArmorItem(CArmorTier.EVIL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> EVIL_LEGGINGS = Registration.ITEMS.register("evil_leggings",
            () -> new ArmorItem(CArmorTier.EVIL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> EVIL_HELMET = Registration.ITEMS.register("evil_helmet",
            () -> new ArmorItem(CArmorTier.EVIL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FANCYGAMBESON_BOOTS = Registration.ITEMS.register("fancygambeson_boots",
            () -> new ArmorItem(CArmorTier.FANCYGAMBESON, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FANCYGAMBESON_CHESTPLATE = Registration.ITEMS.register("fancygambeson_chestplate",
            () -> new ArmorItem(CArmorTier.FANCYGAMBESON, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FANCYGAMBESON_LEGGINGS = Registration.ITEMS.register("fancygambeson_leggings",
            () -> new ArmorItem(CArmorTier.FANCYGAMBESON, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FANCYGAMBESON_DIADEM = Registration.ITEMS.register("fancygambeson_diadem",
            () -> new ArmorItem(CArmorTier.FANCYGAMBESON, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FOOTSOLDIER_BOOTS = Registration.ITEMS.register("footsoldier_boots",
            () -> new ArmorItem(CArmorTier.FOOTSOLDIER, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FOOTSOLDIER_CHESTPLATE = Registration.ITEMS.register("footsoldier_chestplate",
            () -> new ArmorItem(CArmorTier.FOOTSOLDIER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FOOTSOLDIER_LEGGINGS = Registration.ITEMS.register("footsoldier_leggings",
            () -> new ArmorItem(CArmorTier.FOOTSOLDIER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FOOTSOLDIER_HELMET = Registration.ITEMS.register("footsoldier_helmet",
            () -> new ArmorItem(CArmorTier.FOOTSOLDIER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SPOTTEDFOOTSOLDIER_BOOTS = Registration.ITEMS.register("spottedfootsoldier_boots",
            () -> new ArmorItem(CArmorTier.SPOTTEDFOOTSOLDIER, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SPOTTEDFOOTSOLDIER_CHESTPLATE = Registration.ITEMS.register("spottedfootsoldier_chestplate",
            () -> new ArmorItem(CArmorTier.SPOTTEDFOOTSOLDIER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SPOTTEDFOOTSOLDIER_LEGGINGS = Registration.ITEMS.register("spottedfootsoldier_leggings",
            () -> new ArmorItem(CArmorTier.SPOTTEDFOOTSOLDIER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SPOTTEDFOOTSOLDIER_HELMET = Registration.ITEMS.register("spottedfootsoldier_helmet",
            () -> new ArmorItem(CArmorTier.SPOTTEDFOOTSOLDIER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYFOOTSOLDIER_BOOTS = Registration.ITEMS.register("heavyfootsoldier_boots",
            () -> new ArmorItem(CArmorTier.HEAVYFOOTSOLDIER, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYFOOTSOLDIER_CHESTPLATE = Registration.ITEMS.register("heavyfootsoldier_chestplate",
            () -> new ArmorItem(CArmorTier.HEAVYFOOTSOLDIER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYFOOTSOLDIER_LEGGINGS = Registration.ITEMS.register("heavyfootsoldier_leggings",
            () -> new ArmorItem(CArmorTier.HEAVYFOOTSOLDIER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYFOOTSOLDIER_HELMET = Registration.ITEMS.register("heavyfootsoldier_helmet",
            () -> new ArmorItem(CArmorTier.HEAVYFOOTSOLDIER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYHIGH_BOOTS = Registration.ITEMS.register("heavyhigh_boots",
            () -> new ArmorItem(CArmorTier.HEAVYHIGH, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYHIGH_CHESTPLATE = Registration.ITEMS.register("heavyhigh_chestplate",
            () -> new ArmorItem(CArmorTier.HEAVYHIGH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYHIGH_LEGGINGS = Registration.ITEMS.register("heavyhigh_leggings",
            () -> new ArmorItem(CArmorTier.HEAVYHIGH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HEAVYHIGH_HELMET = Registration.ITEMS.register("heavyhigh_helmet",
            () -> new ArmorItem(CArmorTier.HEAVYHIGH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HIGH_BOOTS = Registration.ITEMS.register("high_boots",
            () -> new ArmorItem(CArmorTier.HIGH, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HIGH_CHESTPLATE = Registration.ITEMS.register("high_chestplate",
            () -> new ArmorItem(CArmorTier.HIGH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HIGH_LEGGINGS = Registration.ITEMS.register("high_leggings",
            () -> new ArmorItem(CArmorTier.HIGH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> HIGH_HELMET = Registration.ITEMS.register("high_helmet",
            () -> new ArmorItem(CArmorTier.HIGH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ICE_BOOTS = Registration.ITEMS.register("ice_boots",
            () -> new ArmorItem(CArmorTier.ICE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ICE_CHESTPLATE = Registration.ITEMS.register("ice_chestplate",
            () -> new ArmorItem(CArmorTier.ICE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ICE_LEGGINGS = Registration.ITEMS.register("ice_leggings",
            () -> new ArmorItem(CArmorTier.ICE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ICE_HELMET = Registration.ITEMS.register("ice_helmet",
            () -> new ArmorItem(CArmorTier.ICE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KINGSTONE_BOOTS = Registration.ITEMS.register("kingstone_boots",
            () -> new ArmorItem(CArmorTier.KINGSTONE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KINGSTONE_CHESTPLATE = Registration.ITEMS.register("kingstone_chestplate",
            () -> new ArmorItem(CArmorTier.KINGSTONE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KINGSTONE_LEGGINGS = Registration.ITEMS.register("kingstone_leggings",
            () -> new ArmorItem(CArmorTier.KINGSTONE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KINGSTONE_HELMET = Registration.ITEMS.register("kingstone_helmet",
            () -> new ArmorItem(CArmorTier.KINGSTONE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KNIGHT_BOOTS = Registration.ITEMS.register("knight_boots",
            () -> new ArmorItem(CArmorTier.KNIGHT, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KNIGHT_CHESTPLATE = Registration.ITEMS.register("knight_chestplate",
            () -> new ArmorItem(CArmorTier.KNIGHT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KNIGHT_LEGGINGS = Registration.ITEMS.register("knight_leggings",
            () -> new ArmorItem(CArmorTier.KNIGHT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> KNIGHT_HELMET = Registration.ITEMS.register("knight_helmet",
            () -> new ArmorItem(CArmorTier.KNIGHT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORD_BOOTS = Registration.ITEMS.register("lord_boots",
            () -> new ArmorItem(CArmorTier.LORD, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORD_CHESTPLATE = Registration.ITEMS.register("lord_chestplate",
            () -> new ArmorItem(CArmorTier.LORD, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORD_LEGGINGS = Registration.ITEMS.register("lord_leggings",
            () -> new ArmorItem(CArmorTier.LORD, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORD_HELMET = Registration.ITEMS.register("lord_helmet",
            () -> new ArmorItem(CArmorTier.LORD, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MAJESTIC_BOOTS = Registration.ITEMS.register("majestic_boots",
            () -> new ArmorItem(CArmorTier.MAJESTIC, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MAJESTIC_CHESTPLATE = Registration.ITEMS.register("majestic_chestplate",
            () -> new ArmorItem(CArmorTier.MAJESTIC, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MAJESTIC_LEGGINGS = Registration.ITEMS.register("majestic_leggings",
            () -> new ArmorItem(CArmorTier.MAJESTIC, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MAJESTIC_DIADEM = Registration.ITEMS.register("majestic_diadem",
            () -> new ArmorItem(CArmorTier.MAJESTIC, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = Registration.ITEMS.register("mithril_boots",
            () -> new ArmorItem(CArmorTier.MITHRIL, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = Registration.ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(CArmorTier.MITHRIL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = Registration.ITEMS.register("mithril_leggings",
            () -> new ArmorItem(CArmorTier.MITHRIL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> MITHRIL_HELMET = Registration.ITEMS.register("mithril_helmet",
            () -> new ArmorItem(CArmorTier.MITHRIL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORMAN_BOOTS = Registration.ITEMS.register("norman_boots",
            () -> new ArmorItem(CArmorTier.NORMAN, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORMAN_CHESTPLATE = Registration.ITEMS.register("norman_chestplate",
            () -> new ArmorItem(CArmorTier.NORMAN, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORMAN_LEGGINGS = Registration.ITEMS.register("norman_leggings",
            () -> new ArmorItem(CArmorTier.NORMAN, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORMAN_HELMET = Registration.ITEMS.register("norman_helmet",
            () -> new ArmorItem(CArmorTier.NORMAN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORTH_BOOTS = Registration.ITEMS.register("north_boots",
            () -> new ArmorItem(CArmorTier.NORTH, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORTH_CHESTPLATE = Registration.ITEMS.register("north_chestplate",
            () -> new ArmorItem(CArmorTier.NORTH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORTH_LEGGINGS = Registration.ITEMS.register("north_leggings",
            () -> new ArmorItem(CArmorTier.NORTH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> NORTH_HELMET = Registration.ITEMS.register("north_helmet",
            () -> new ArmorItem(CArmorTier.NORTH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ORC_BOOTS = Registration.ITEMS.register("orc_boots",
            () -> new ArmorItem(CArmorTier.ORC, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ORC_CHESTPLATE = Registration.ITEMS.register("orc_chestplate",
            () -> new ArmorItem(CArmorTier.ORC, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ORC_LEGGINGS = Registration.ITEMS.register("orc_leggings",
            () -> new ArmorItem(CArmorTier.ORC, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ORC_HELMET = Registration.ITEMS.register("orc_helmet",
            () -> new ArmorItem(CArmorTier.ORC, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> XENTHIUM_BOOTS = Registration.ITEMS.register("xenthium_boots",
            () -> new ArmorItem(CArmorTier.XENTHIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> XENTHIUM_CHESTPLATE = Registration.ITEMS.register("xenthium_chestplate",
            () -> new ArmorItem(CArmorTier.XENTHIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> XENTHIUM_LEGGINGS = Registration.ITEMS.register("xenthium_leggings",
            () -> new ArmorItem(CArmorTier.XENTHIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> XENTHIUM_HELMET = Registration.ITEMS.register("xenthium_diadem",
            () -> new ArmorItem(CArmorTier.XENTHIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROGUE_BOOTS = Registration.ITEMS.register("rogue_boots",
            () -> new ArmorItem(CArmorTier.ROGUE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROGUE_CHESTPLATE = Registration.ITEMS.register("rogue_chestplate",
            () -> new ArmorItem(CArmorTier.ROGUE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROGUE_LEGGINGS = Registration.ITEMS.register("rogue_leggings",
            () -> new ArmorItem(CArmorTier.ROGUE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROGUE_HELMET = Registration.ITEMS.register("rogue_helmet",
            () -> new ArmorItem(CArmorTier.ROGUE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROSEPLATE_BOOTS = Registration.ITEMS.register("roseplate_boots",
            () -> new ArmorItem(CArmorTier.ROSEPLATE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROSEPLATE_CHESTPLATE = Registration.ITEMS.register("roseplate_chestplate",
            () -> new ArmorItem(CArmorTier.ROSEPLATE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROSEPLATE_LEGGINGS = Registration.ITEMS.register("roseplate_leggings",
            () -> new ArmorItem(CArmorTier.ROSEPLATE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROSEPLATE_HELMET = Registration.ITEMS.register("roseplate_helmet",
            () -> new ArmorItem(CArmorTier.ROSEPLATE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> STEEL_BOOTS = Registration.ITEMS.register("steel_boots",
            () -> new ArmorItem(CArmorTier.STEEL, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = Registration.ITEMS.register("steel_chestplate",
            () -> new ArmorItem(CArmorTier.STEEL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = Registration.ITEMS.register("steel_leggings",
            () -> new ArmorItem(CArmorTier.STEEL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> STEEL_HELMET = Registration.ITEMS.register("steel_helmet",
            () -> new ArmorItem(CArmorTier.STEEL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> THIEF_BOOTS = Registration.ITEMS.register("thief_boots",
            () -> new ArmorItem(CArmorTier.THIEF, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> THIEF_CHESTPLATE = Registration.ITEMS.register("thief_chestplate",
            () -> new ArmorItem(CArmorTier.THIEF, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> THIEF_LEGGINGS = Registration.ITEMS.register("thief_leggings",
            () -> new ArmorItem(CArmorTier.THIEF, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> THIEF_CAP = Registration.ITEMS.register("thief_cap",
            () -> new ArmorItem(CArmorTier.THIEF, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> TOURNEY_BOOTS = Registration.ITEMS.register("tourney_boots",
            () -> new ArmorItem(CArmorTier.TOURNEY, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> TOURNEY_CHESTPLATE = Registration.ITEMS.register("tourney_chestplate",
            () -> new ArmorItem(CArmorTier.TOURNEY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> TOURNEY_LEGGINGS = Registration.ITEMS.register("tourney_leggings",
            () -> new ArmorItem(CArmorTier.TOURNEY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> TOURNEY_HELMET = Registration.ITEMS.register("tourney_helmet",
            () -> new ArmorItem(CArmorTier.TOURNEY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> VIKING_BOOTS = Registration.ITEMS.register("viking_boots",
            () -> new ArmorItem(CArmorTier.VIKING, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> VIKING_CHESTPLATE = Registration.ITEMS.register("viking_chestplate",
            () -> new ArmorItem(CArmorTier.VIKING, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> VIKING_LEGGINGS = Registration.ITEMS.register("viking_leggings",
            () -> new ArmorItem(CArmorTier.VIKING, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> VIKING_HELMET = Registration.ITEMS.register("viking_helmet",
            () -> new ArmorItem(CArmorTier.VIKING, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ENGLISHKNIGHTBOOTS = Registration.ITEMS.register("english_knight_boots",
            () -> new ArmorItem(CArmorTier.ENGLISHKNIGHT, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ENGLISHKNIGHTCHESTPLATE = Registration.ITEMS.register("english_knight_chestplate",
            () -> new ArmorItem(CArmorTier.ENGLISHKNIGHT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ENGLISHKNIGHTLEGGINGS = Registration.ITEMS.register("english_knight_leggings",
            () -> new ArmorItem(CArmorTier.ENGLISHKNIGHT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ENGLISHKNIGHTHELMET = Registration.ITEMS.register("english_knight_helmet",
            () -> new ArmorItem(CArmorTier.ENGLISHKNIGHT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FRENCHKNIGHTBOOTS = Registration.ITEMS.register("french_knight_boots",
            () -> new ArmorItem(CArmorTier.FRENCHKNIGHT, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FRENCHKNIGHTCHESTPLATE = Registration.ITEMS.register("french_knight_chestplate",
            () -> new ArmorItem(CArmorTier.FRENCHKNIGHT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FRENCHKNIGHTLEGGINGS = Registration.ITEMS.register("french_knight_leggings",
            () -> new ArmorItem(CArmorTier.FRENCHKNIGHT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> FRENCHKNIGHTHELMET = Registration.ITEMS.register("french_knight_helmet",
            () -> new ArmorItem(CArmorTier.FRENCHKNIGHT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LEGIONNAIREBOOTS= Registration.ITEMS.register("legionnaire_boots",
            () -> new ArmorItem(CArmorTier.LEGIONNAIRE, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LEGIONNAIRECHESTPLATE = Registration.ITEMS.register("legionnaire_chestplate",
            () -> new ArmorItem(CArmorTier.LEGIONNAIRE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LEGIONNAIRELEGGINGS = Registration.ITEMS.register("legionnaire_leggings",
            () -> new ArmorItem(CArmorTier.LEGIONNAIRE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LEGIONNAIREHELMET = Registration.ITEMS.register("legionnaire_helmet",
            () -> new ArmorItem(CArmorTier.LEGIONNAIRE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LONGBOWARCHERBOOTS = Registration.ITEMS.register("longbowarcher_boots",
            () -> new ArmorItem(CArmorTier.LONGBOWARCHER, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LONGBOWARCHERCHESTPLATE = Registration.ITEMS.register("longbowarcher_chestplate",
            () -> new ArmorItem(CArmorTier.LONGBOWARCHER, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LONGBOWARCHERLEGGINGS = Registration.ITEMS.register("longbowarcher_leggings",
            () -> new ArmorItem(CArmorTier.LONGBOWARCHER, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LONGBOWARCHERHELMET = Registration.ITEMS.register("longbowarcher_helmet",
            () -> new ArmorItem(CArmorTier.LONGBOWARCHER, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORDOFWESTWICKBOOTS = Registration.ITEMS.register("lord_of_westwick_boots",
            () -> new ArmorItem(CArmorTier.LORDOFWESTWICK, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORDOFWESTWICKCHESTPLATE = Registration.ITEMS.register("lord_of_westwick_chestplate",
            () -> new ArmorItem(CArmorTier.LORDOFWESTWICK, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORDOFWESTWICKLEGGINGS = Registration.ITEMS.register("lord_of_westwick_leggings",
            () -> new ArmorItem(CArmorTier.LORDOFWESTWICK, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> LORDOFWESTWICKHELMET = Registration.ITEMS.register("lord_of_westwick_helmet",
            () -> new ArmorItem(CArmorTier.LORDOFWESTWICK, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROOTBOOTS = Registration.ITEMS.register("root_boots",
            () -> new ArmorItem(CArmorTier.ROOT, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROOTCHESTPLATE = Registration.ITEMS.register("root_chestplate",
            () -> new ArmorItem(CArmorTier.ROOT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROOTLEGGINGS = Registration.ITEMS.register("root_leggings",
            () -> new ArmorItem(CArmorTier.ROOT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> ROOTHELMET = Registration.ITEMS.register("root_helmet",
            () -> new ArmorItem(CArmorTier.ROOT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SARACENBOOTS = Registration.ITEMS.register("saracen_boots",
            () -> new ArmorItem(CArmorTier.SARACEN, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SARACENCHESTPLATE = Registration.ITEMS.register("saracen_chestplate",
            () -> new ArmorItem(CArmorTier.SARACEN, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SARACENLEGGINGS = Registration.ITEMS.register("saracen_leggings",
            () -> new ArmorItem(CArmorTier.SARACEN, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SARACENHELMET = Registration.ITEMS.register("saracen_helmet",
            () -> new ArmorItem(CArmorTier.SARACEN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SKELETALBOOTS = Registration.ITEMS.register("skeletal_boots",
            () -> new ArmorItem(CArmorTier.SKELETAL, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SKELETALCHESTPLATE = Registration.ITEMS.register("skeletal_chestplate",
            () -> new ArmorItem(CArmorTier.SKELETAL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SKELETALLEGGINGS = Registration.ITEMS.register("skeletal_leggings",
            () -> new ArmorItem(CArmorTier.SKELETAL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> SKELETALHELMET = Registration.ITEMS.register("skeletal_helmet",
            () -> new ArmorItem(CArmorTier.SKELETAL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BROTHERHOODBOOTS = Registration.ITEMS.register("brotherhood_boots",
            () -> new ArmorItem(CArmorTier.BROTHERHOOD, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BROTHERHOODCHESTPLATE = Registration.ITEMS.register("brotherhood_chestplate",
            () -> new ArmorItem(CArmorTier.BROTHERHOOD, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BROTHERHOODLEGGINGS = Registration.ITEMS.register("brotherhood_leggings",
            () -> new ArmorItem(CArmorTier.BROTHERHOOD, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BROTHERHOODHELMET = Registration.ITEMS.register("brotherhood_helmet",
            () -> new ArmorItem(CArmorTier.BROTHERHOOD, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKLEGIONBOOTS = Registration.ITEMS.register("blacklegion_boots",
            () -> new ArmorItem(CArmorTier.BLACKLEGION, EquipmentSlotType.FEET,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKLEGIONCHESTPLATE = Registration.ITEMS.register("blacklegion_chestplate",
            () -> new ArmorItem(CArmorTier.BLACKLEGION, EquipmentSlotType.CHEST,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKLEGIONLEGGINGS = Registration.ITEMS.register("blacklegion_leggings",
            () -> new ArmorItem(CArmorTier.BLACKLEGION, EquipmentSlotType.LEGS,
                    new Item.Properties().group(Citemgroup.CAARMOR)));
    public static final RegistryObject<Item> BLACKLEGIONHELMET = Registration.ITEMS.register("blacklegion_helmet",
            () -> new ArmorItem(CArmorTier.BLACKLEGION, EquipmentSlotType.HEAD,
                    new Item.Properties().group(Citemgroup.CAARMOR)));


//--------------------------------------------------------------------------------------------------------------------//
//SHIELD
    public static final RegistryObject<Item> XENTHIUMSHIELD = Registration.ITEMS.register("xenthium_shield", ShieldT5::new);
    public static final RegistryObject<Item> COFFINSHIELD = Registration.ITEMS.register("coffin_shield", ShieldT2::new);
    public static final RegistryObject<Item> NORMANSHIELD = Registration.ITEMS.register("norman_shield", ShieldT2::new);
    public static final RegistryObject<Item> SOMEWITCHERSHIELD = Registration.ITEMS.register("some_witcher_shield", ShieldT3::new);
    public static final RegistryObject<Item> WITCHERSHIELD = Registration.ITEMS.register("witcher_shield", ShieldT3::new);
    public static final RegistryObject<Item> BONESHIELD = Registration.ITEMS.register("bone_shield", ShieldT1::new);
    public static final RegistryObject<Item> BIGROMANSCUTUM = Registration.ITEMS.register("big_roman_scutum", ShieldT3::new);
    public static final RegistryObject<Item> DWARVENSHIELD = Registration.ITEMS.register("dwarven_shield", DwarvenShield::new);
    public static final RegistryObject<Item> BIGROUNDBIRDSSHIELD = Registration.ITEMS.register("big_round_birds_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDBLUESHIELD = Registration.ITEMS.register("big_round_blue_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDGREENWHITESHIELD = Registration.ITEMS.register("big_round_green_white_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDREDBLACKSHIELD = Registration.ITEMS.register("big_round_red_black_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDREDSHIELD = Registration.ITEMS.register("big_round_red_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDTRISKELLSHIELD = Registration.ITEMS.register("big_round_triskell_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLBLUESHIELD = Registration.ITEMS.register("big_round_whirl_blue_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLGREENWHITESHIELD = Registration.ITEMS.register("big_round_whirl_green_white_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLREDSHIELD = Registration.ITEMS.register("big_round_whirl_red_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLREDWHITESHIELD = Registration.ITEMS.register("big_round_whirl_red_white_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLYELLOWSHIELD = Registration.ITEMS.register("big_round_whirl_yellow_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWOODSHIELD = Registration.ITEMS.register("big_round_wood_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDYELLOWBLACKSHIELD = Registration.ITEMS.register("big_round_yellow_black_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDYELLOWSHIELD = Registration.ITEMS.register("big_round_yellow_shield", BigRoundShield::new);
    public static final RegistryObject<Item> BIGROUNDWHIRLYELLOWWHITESHIELD = Registration.ITEMS.register("big_round_whirl_yellow_white_shield", BigRoundShield::new);
    public static final RegistryObject<Item> ELVENSHIELD = Registration.ITEMS.register("elven_shield", ElvenShield::new);
    public static final RegistryObject<Item> ELVENSILVERSHIELD = Registration.ITEMS.register("elven_silver_shield", ElvenSilverShield::new);
    public static final RegistryObject<Item> FANCYIRONSHIELD = Registration.ITEMS.register("fancy_iron_shield", FancyIronShield::new);
    public static final RegistryObject<Item> ORCSHIELD = Registration.ITEMS.register("orc_shield", OrcShield::new);
    public static final RegistryObject<Item> ORCSHIELDWHITEHAND = Registration.ITEMS.register("orc_shield_white_hand", OrcShield::new);
    public static final RegistryObject<Item> PAVISESHIELD = Registration.ITEMS.register("pavise_shield", PaviseShield::new);
    public static final RegistryObject<Item> ROHIRRIMSHIELD = Registration.ITEMS.register("rohirrim_shield", RohirrimShield::new);
    public static final RegistryObject<Item> ROMANSHIELD = Registration.ITEMS.register("roman_shield", RomanShield::new);
    public static final RegistryObject<Item> ROMANSHIELDRED = Registration.ITEMS.register("roman_shield_red", RomanShield::new);
    public static final RegistryObject<Item> ROMANSHIELDGREEN = Registration.ITEMS.register("roman_shield_green", RomanShield::new);
    public static final RegistryObject<Item> ROMANSHIELDWHITE = Registration.ITEMS.register("roman_shield_white", RomanShield::new);
    public static final RegistryObject<Item> ROMANSHIELDYELLOW = Registration.ITEMS.register("roman_shield_yellow", RomanShield::new);
    public static final RegistryObject<Item> ROUNDEDROMANSCUTUM = Registration.ITEMS.register("rounded_roman_scutum", RoundedRomanScutum::new);
    public static final RegistryObject<Item> AFRICANTALLSHIELD = Registration.ITEMS.register("african_tall_shield", AfricanTallShield::new);
    public static final RegistryObject<Item> ARABIANKITESHIELD = Registration.ITEMS.register("arabian_kite_shield", ArabianKiteShield::new);
    public static final RegistryObject<Item> ARABIANROUNDSHIELD = Registration.ITEMS.register("arabian_round_shield", ArabianRoundShield::new);
    public static final RegistryObject<Item> BRONZESHIELD = Registration.ITEMS.register("bronze_shield", BronzeShield::new);
    public static final RegistryObject<Item> CRUSADERSHIELD = Registration.ITEMS.register("crusader_shield", CrusaderShield::new);
    public static final RegistryObject<Item> EAGLEHEATERSPARP = Registration.ITEMS.register("eagle_heater_sparp", EagleHeaterSparp::new);
    public static final RegistryObject<Item> HEATERSHARPSHIELD = Registration.ITEMS.register("heater_sharp_shield", HeaterSharpShield::new);
    public static final RegistryObject<Item> FANCYSHIELD = Registration.ITEMS.register("fancy_shield", FancyShield::new);
    public static final RegistryObject<Item> HOPLITESHIELDBLANK = Registration.ITEMS.register("hoplite_shield_blank", HopliteShield::new);
    public static final RegistryObject<Item> HOPLITESHIELDEYE = Registration.ITEMS.register("hoplite_shield_eye", HopliteShield::new);
    public static final RegistryObject<Item> HOPLITESHIELDSCORPION = Registration.ITEMS.register("hoplite_shield_scorpion", HopliteShield::new);
    public static final RegistryObject<Item> HOPLITESHIELDSPARA = Registration.ITEMS.register("hoplite_shield_sparta", HopliteShield::new);
    public static final RegistryObject<Item> HOPLITESHIELDTRIDENT = Registration.ITEMS.register("hoplite_shield_trident", HopliteShield::new);
    public static final RegistryObject<Item> LONGWOODENSHIELD = Registration.ITEMS.register("long_wooden_shield", LongWoodenShield::new);
    public static final RegistryObject<Item> SQUAREWANKELSHIELD = Registration.ITEMS.register("square_wankel_shield", SquareWankelShield::new);
    public static final RegistryObject<Item> STHADGARDSHIELD = Registration.ITEMS.register("sthadgard_shield", SthadgardShield::new);
    public static final RegistryObject<Item> TARGESHIELD = Registration.ITEMS.register("targe_shield", TargeShield::new);
    public static final RegistryObject<Item> TEMPLARSHIELD = Registration.ITEMS.register("templarshield", TemplarShield::new);

    public static final RegistryObject<Item> BLUETRIANGLEHEATER = Registration.ITEMS.register("blue_triangle_heater", ShieldT2::new);
    public static final RegistryObject<Item> CHIMALLISHIELD = Registration.ITEMS.register("chimalli_shield", ShieldT1::new);
    public static final RegistryObject<Item> CHIMALLISHIELD2 = Registration.ITEMS.register("chimalli_shield2", ShieldT1::new);
    public static final RegistryObject<Item> CHINESESHIELD = Registration.ITEMS.register("chinese_shield", ShieldT3::new);
    public static final RegistryObject<Item> CONQUESTSHIELD = Registration.ITEMS.register("conquest_shield", ShieldT3::new);
    public static final RegistryObject<Item> ELEVENTHCENTURYSHIELD = Registration.ITEMS.register("eleventh_century_shield", ShieldT2::new);
    public static final RegistryObject<Item> FIFTEENTHCENTURYSHIELD = Registration.ITEMS.register("fifteenth_century_shield", ShieldT3::new);
    public static final RegistryObject<Item> FLEURDELIS = Registration.ITEMS.register("fleur_de_lis", ShieldT2::new);
    public static final RegistryObject<Item> FLICIASHIELD = Registration.ITEMS.register("flicia_shield", ShieldT3::new);
    public static final RegistryObject<Item> GREEKCUTSHIELD = Registration.ITEMS.register("greek_cut_shield", ShieldT2::new);
    public static final RegistryObject<Item> HEATERBOTTOMROUNDSHIELD = Registration.ITEMS.register("heater_bottom_round_shield", ShieldT2::new);
    public static final RegistryObject<Item> JOUSTINGSHIELD = Registration.ITEMS.register("jousting_shield", ShieldT2::new);
    public static final RegistryObject<Item> KITESHIELDGOLDBLACK = Registration.ITEMS.register("kiteshield_gold_black", ShieldT4::new);
    public static final RegistryObject<Item> KITESHIELDSILVERBLUE= Registration.ITEMS.register("kiteshield_silver_blue", ShieldT4::new);
    public static final RegistryObject<Item> KITESHIELDGOLDBLUE = Registration.ITEMS.register("kiteshield_gold_blue", ShieldT4::new);
    public static final RegistryObject<Item> KITESHIELDWOOD = Registration.ITEMS.register("kiteshield_wood", ShieldT2::new);
    public static final RegistryObject<Item> LORDSOFTHEPINE = Registration.ITEMS.register("lords_of_the_pine", ShieldT3::new);
    public static final RegistryObject<Item> STRONGHOLDHEATERSHARP = Registration.ITEMS.register("stronghold_heater_sharp", ShieldT2::new);
    public static final RegistryObject<Item> TARGET = Registration.ITEMS.register("target", ShieldT1::new);






    //TOOL
    public static final RegistryObject<Item> IRONSICKLE = Registration.ITEMS.register("iron_sickle",
        () -> new HoeItem(CItemTier.IRON,0,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PITCHFORK = Registration.ITEMS.register("pitchfork",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZEHOE = Registration.ITEMS.register("bronze_hoe",
            () -> new HoeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZEPICKAXE = Registration.ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZESHOVEL = Registration.ITEMS.register("bronze_shovel",
            () -> new ShovelItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELHOE = Registration.ITEMS.register("steel_hoe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELPICKAXE = Registration.ITEMS.register("steel_pickaxe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELSPADE = Registration.ITEMS.register("steel_spade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
//WEAPON
    //#BLUNT#
    public static final RegistryObject<Item> IRONMACE = Registration.ITEMS.register("iron_mace",
           () -> new BluntWeapon(CItemTier.IRON, -1,-2.5f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BALLHEADEDWARCLUB = Registration.ITEMS.register("ball_headed_war_club",
           () -> new BluntWeapon(CItemTier.WOOD, -2,-2.5f,new Item.Properties().defaultMaxDamage(30).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BONECLUB = Registration.ITEMS.register("bone_club",
            () -> new BluntWeapon(CItemTier.BONE, -2,-2.5f,new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DOUBLEFLAIL = Registration.ITEMS.register("double_flail",
            () -> new BluntWeapon(CItemTier.IRON,6,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> POLEFLAIL = Registration.ITEMS.register("pole_flail",
            () -> new BluntWeapon(CItemTier.IRON,3,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPIKYFLAIL = Registration.ITEMS.register("spiky_flail",
            () -> new BluntWeapon(CItemTier.STEEL,3,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SIMPLE_FLAIL = Registration.ITEMS.register("simple_flail",
            () -> new BluntWeapon(CItemTier.WOOD,3,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BECDECORBIN = Registration.ITEMS.register("bec_de_corbin",
            () -> new BluntWeapon(CItemTier.IRON,3,-2.5f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HEAVYMACE = Registration.ITEMS.register("heavy_mace",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> WOODENCLUB = Registration.ITEMS.register("wooden_club",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KANABO = Registration.ITEMS.register("kanabo",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SMALLMACUAHUITL = Registration.ITEMS.register("small_macuahuitl",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELMACE = Registration.ITEMS.register("steel_mace",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELSTAFF = Registration.ITEMS.register("steel_staff",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPIKEDCLUB = Registration.ITEMS.register("spiked_club",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TEPOZTOPILLI = Registration.ITEMS.register("tepoztopilli",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDFLAIL = Registration.ITEMS.register("diamond_flail",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FANCYFLAIL = Registration.ITEMS.register("fancy_flail",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PRIMITIVEFLAIL = Registration.ITEMS.register("primitive_flail",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SINGLEFLAIL = Registration.ITEMS.register("single_flail",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TRAININGFLAIL = Registration.ITEMS.register("training_flail",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDWARHAMMER = Registration.ITEMS.register("diamond_warhammer",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GOLDENHAMMER = Registration.ITEMS.register("golden_hammer",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> WOODENWARCLUB = Registration.ITEMS.register("wooden_warclub",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FIREROD = Registration.ITEMS.register("firerod",
            () -> new BluntWeapon(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));

    //#SWORD#
    public static final RegistryObject<Item> BRONZEAXESWORD = Registration.ITEMS.register("bronze_axe_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> COPPER_SWORD = Registration.ITEMS.register("copper_sword",
            () -> new SwordItem(CItemTier.COPPER,2,0.5f, new Item.Properties().defaultMaxDamage(80).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> XENTHIUMKATANA = Registration.ITEMS.register("xenthium_katana",
            () -> new SwordItem(CItemTier.XENTHIUM,6,0.5f, new Item.Properties().defaultMaxDamage(250).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ICEBLADEOFTHEMONARCH = Registration.ITEMS.register("icebladeofthemonarch",
            () -> new SwordItem(CItemTier.UNIQUEITEM,8,2f, new Item.Properties().defaultMaxDamage(1500).group(Citemgroup.CAWEAPON).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CHRYSAMERE = Registration.ITEMS.register("chrysamere",
            () -> new SwordItem(CItemTier.UNIQUEITEM,9,2f, new Item.Properties().defaultMaxDamage(1500).group(Citemgroup.CAWEAPON).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BIPOLARBLADE = Registration.ITEMS.register("bipolarblade",
            () -> new SwordItem(CItemTier.UNIQUEITEM,8,2f, new Item.Properties().defaultMaxDamage(1500).group(Citemgroup.CAWEAPON).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASTARDSWORD = Registration.ITEMS.register("bastard_sword",
            () -> new SwordItem(CItemTier.STEEL,3,2f , new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLADESWORD = Registration.ITEMS.register("blade_sword",
            () -> new SwordItem(CItemTier.IRON,3,2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ICEBLADE = Registration.ITEMS.register("ice_blade",
            () -> new SwordItem(CItemTier.UNIQUEITEM,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZESWORD = Registration.ITEMS.register("bronze_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BUTTERFLYSWORD = Registration.ITEMS.register("butterfly_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CUAHOLOLLI = Registration.ITEMS.register("cuahololli",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CUTLASS = Registration.ITEMS.register("cutlass",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> EXCALIBUR = Registration.ITEMS.register("excalibur",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> FALCATA = Registration.ITEMS.register("falcata",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FALCHION = Registration.ITEMS.register("falchion",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FALX = Registration.ITEMS.register("falx",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FANCYSHORTSWORD = Registration.ITEMS.register("fancy_short_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DARKSWORD = Registration.ITEMS.register("dark_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENSWORD = Registration.ITEMS.register("dwarven_sword",
            () -> new SwordItem(CItemTier.DWARVEN,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAO = Registration.ITEMS.register("dao",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HOOKSWORD = Registration.ITEMS.register("hook_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HOPLITESWORD = Registration.ITEMS.register("hoplite_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> IRONAXESWORD = Registration.ITEMS.register("iron_axe_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KATANA = Registration.ITEMS.register("katana",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLOODTHORN = Registration.ITEMS.register("bloodthorn",
            () -> new SwordItem(CItemTier.UNIQUEITEM,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KHANDA = Registration.ITEMS.register("khanda",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KHOPESH = Registration.ITEMS.register("khopesh",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KODACHI = Registration.ITEMS.register("kodachi",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KONDA = Registration.ITEMS.register("konda",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KOREANSWORD = Registration.ITEMS.register("korean_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LARGEVIKINGSWORD = Registration.ITEMS.register("large_viking_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LONGSWORD = Registration.ITEMS.register("long_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> MOROKRISSWORD = Registration.ITEMS.register("moro_kris_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> NODACHI = Registration.ITEMS.register("nodachi",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ORCBLADE = Registration.ITEMS.register("orc_blade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ORCISHSWORD = Registration.ITEMS.register("orcish_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PANABAS = Registration.ITEMS.register("panabas",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> RAPIER = Registration.ITEMS.register("rapier",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ROMANGLADIUS = Registration.ITEMS.register("roman_gladius",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ROOTSWORD = Registration.ITEMS.register("root_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SCIMITAR = Registration.ITEMS.register("scimitar",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SHORTSWORD = Registration.ITEMS.register("short_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SIMPLERUNEBLADE = Registration.ITEMS.register("simple_rune_blade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPARTANSWORD = Registration.ITEMS.register("spartan_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELSWORD = Registration.ITEMS.register("steel_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> VIKINGSWORD = Registration.ITEMS.register("viking_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CRUSADERBLADE = Registration.ITEMS.register("crusaderblade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDKATANA = Registration.ITEMS.register("diamond_katana",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLADIUSIRON = Registration.ITEMS.register("gladius_iron",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KENDOSWORD = Registration.ITEMS.register("kendo_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> MACHETE = Registration.ITEMS.register("machete",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PRIMITIVESTONEBLADE = Registration.ITEMS.register("primitive_stoneblade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SCIMITAR02 = Registration.ITEMS.register("scimitar_02",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SLANTEDSWORD = Registration.ITEMS.register("slanted_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DOOMBRINGERSWORD = Registration.ITEMS.register("doombringer_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> XENTHIUMBLADE = Registration.ITEMS.register("xenthium_blade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SWORDIRON = Registration.ITEMS.register("sword_iron",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STAHLRIMSWORD = Registration.ITEMS.register("stahlrim_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELCRESCENT = Registration.ITEMS.register("steel_crescent",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> RAZORTOOTH = Registration.ITEMS.register("razortooth",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ASSASSINPOISONBLADE = Registration.ITEMS.register("assassin_poisonblade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLADE = Registration.ITEMS.register("blade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRUTALORCBLADE = Registration.ITEMS.register("brutal_orc_blade",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));

    //#HIDDEN#
    public static final RegistryObject<Item> DAGGERDIAMOND = Registration.ITEMS.register("dagger_diamond",
            () -> new HiddenWeapon(CItemTier.DIAMOND,EquipmentSlotType.MAINHAND,3,3f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAGGERDWARVEN = Registration.ITEMS.register("dagger_dwarven",
            () -> new HiddenWeapon(CItemTier.DWARVEN,EquipmentSlotType.MAINHAND,2,2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAGGERIRON = Registration.ITEMS.register("dagger_iron",
            () -> new HiddenWeapon(CItemTier.IRON,EquipmentSlotType.MAINHAND,1,1f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAGGERROOT = Registration.ITEMS.register("dagger_root",
            () -> new HiddenWeapon(CItemTier.ROOT,EquipmentSlotType.MAINHAND,0,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAGGERSTEEL = Registration.ITEMS.register("dagger_steel",
            () -> new HiddenWeapon(CItemTier.STEEL,EquipmentSlotType.MAINHAND,2,2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KATARBRONZE = Registration.ITEMS.register("katar_bronze",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,2,2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KATARSTEEL = Registration.ITEMS.register("katar_steel",
            () -> new HiddenWeapon(CItemTier.STEEL,EquipmentSlotType.MAINHAND,2,2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KATARIRON = Registration.ITEMS.register("katar_iron",
            () -> new HiddenWeapon(CItemTier.IRON,EquipmentSlotType.MAINHAND,2,2f,new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZEDAGGER = Registration.ITEMS.register("bronze_dagger",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HUNTINGKNIFE = Registration.ITEMS.register("hunting_knife",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> JAPANESEJITTE = Registration.ITEMS.register("japanese_jitte",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PIERCINGSAI = Registration.ITEMS.register("piercing_sai",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FANCYGOLDENKNIFE = Registration.ITEMS.register("fancy_golden_knife",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FANCYDAGGER = Registration.ITEMS.register("fancy_dagger",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KRISOFSCHAFFAR = Registration.ITEMS.register("kris_of_schaffar",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> OBLIVION = Registration.ITEMS.register("oblivion",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DAEDRICDAGGER = Registration.ITEMS.register("daedric_dagger",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLADEOFWOE = Registration.ITEMS.register("blade_of_woe",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STAHLRIMDAGGER = Registration.ITEMS.register("stahlrim_dagger",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLASSDAGGER = Registration.ITEMS.register("glass_dagger",
            () -> new HiddenWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));

    //2Hand
    public static final RegistryObject<Item> BERSERKERSWRATH = Registration.ITEMS.register("berserkers_wrath",
            () -> new GreatWeapon(CItemTier.UNIQUEITEM,EquipmentSlotType.MAINHAND,18,-5f, new Item.Properties().defaultMaxDamage(1000).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BATTLE_STAFF = Registration.ITEMS.register("battle_staff",
            () -> new GreatWeapon(CItemTier.WOOD, EquipmentSlotType.MAINHAND, 2,-1f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BARDICHE = Registration.ITEMS.register("bardiche",
            () -> new GreatWeapon(CItemTier.IRON, EquipmentSlotType.MAINHAND, 5,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BATTLEAXEBRONZE = Registration.ITEMS.register("battleaxe_bronze",
            () -> new GreatWeapon(CItemTier.BRONZE, EquipmentSlotType.MAINHAND, 3,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BATTLEAXEIRON = Registration.ITEMS.register("battleaxe_iron",
            () -> new GreatWeapon(CItemTier.IRON, EquipmentSlotType.MAINHAND, 4,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BATTLEAXESTEEL = Registration.ITEMS.register("battleaxe_steel",
            () -> new GreatWeapon(CItemTier.STEEL, EquipmentSlotType.MAINHAND, 6,-2f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZEGREATSWORD = Registration.ITEMS.register("bronze_great_sword",
            () -> new GreatWeapon(CItemTier.BRONZE, EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CLEAVEROFTHEDRAGONGOD = Registration.ITEMS.register("cleaver_of_the_dragongod",
            () -> new GreatWeapon(CItemTier.UNIQUEITEM, EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DOUBLESTEELGLAIVE = Registration.ITEMS.register("double_steel_glaive",
            () -> new GreatWeapon(CItemTier.STEEL, EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENGREATSWORD = Registration.ITEMS.register("dwarven_great_sword",
            () -> new GreatWeapon(CItemTier.BRONZE, EquipmentSlotType.MAINHAND, 3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENWARHAMMER = Registration.ITEMS.register("dwarven_warhammer",
            () -> new GreatWeapon(CItemTier.DWARVEN,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LONGWARAXEBRONZE = Registration.ITEMS.register("longwaraxe_bronze",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LONGWARAXEIRON = Registration.ITEMS.register("longwaraxe_iron",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LONGWARAXESTEEL = Registration.ITEMS.register("longwaraxe_steel",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BILLHOOK = Registration.ITEMS.register("bill_hook",
            () -> new GreatWeapon(CItemTier.WOOD,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DARKPIKE = Registration.ITEMS.register("dark_pike",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENWARAXE = Registration.ITEMS.register("dwarven_waraxe",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GUANDAO = Registration.ITEMS.register("guan_dao",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HEAVYHALBERD = Registration.ITEMS.register("heavy_halberd",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> IRONGREATSWORD = Registration.ITEMS.register("iron_great_sword",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> IRONPOLEARM = Registration.ITEMS.register("iron_polearm",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TROLLBANE = Registration.ITEMS.register("trollbane",
            () -> new GreatWeapon(CItemTier.UNIQUEITEM,EquipmentSlotType.MAINHAND,30,-3f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LARGEWOODENCLUB = Registration.ITEMS.register("large_wooden_club",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> MILITARYFORK = Registration.ITEMS.register("military_fork",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> MONKSPADE = Registration.ITEMS.register("monk_spade",
            () -> new GreatWeapon(CItemTier.BRONZE,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ANGELICFORK = Registration.ITEMS.register("angelic_fork",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDSPEAR = Registration.ITEMS.register("diamond_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENSPEAR = Registration.ITEMS.register("dwarven_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLAIVEBRONZE = Registration.ITEMS.register("glaive_bronze",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLAIVEIRON = Registration.ITEMS.register("glaive_iron",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLAIVESTEEL = Registration.ITEMS.register("glaive_steel",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HARPOONSPEAR = Registration.ITEMS.register("harpoon_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PRIMITIVEFISHINGSPEAR = Registration.ITEMS.register("primitive_fishing_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PRIMITIVESPEAR = Registration.ITEMS.register("primitive_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ROMANPILUM = Registration.ITEMS.register("roman_pilum",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SHARPPOLE = Registration.ITEMS.register("sharp_pole",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPEARIRON = Registration.ITEMS.register("spear_iron",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPEARSTEEL = Registration.ITEMS.register("spear_steel",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STONESPEAR = Registration.ITEMS.register("stone_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TWISTEDSPEAR = Registration.ITEMS.register("twisted_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> XENTHIUMSPEAR = Registration.ITEMS.register("xenthium_spear",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KRUSHAGASH = Registration.ITEMS.register("krush_agash",
            () -> new GreatWeapon(CItemTier.ORC,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KRUSHPACH = Registration.ITEMS.register("krush_pach",
            () -> new GreatWeapon(CItemTier.ORC,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> KRUSHTUROK = Registration.ITEMS.register("krush_turok",
            () -> new GreatWeapon(CItemTier.ORC,EquipmentSlotType.MAINHAND,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> JOUSTINGLANCE = Registration.ITEMS.register("jousting_lance",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> IRONWARHAMMER = Registration.ITEMS.register("iron_warhammer",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> IRONSTAFF = Registration.ITEMS.register("iron_staff",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LARGEFANCYMACUAHUITL = Registration.ITEMS.register("large_fancy_macuahuitl",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LARGEMACUAHUITL = Registration.ITEMS.register("large_macuahuitl",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> LEAFBLADECLAYMORE = Registration.ITEMS.register("leaf_blade_claymore",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ORCISHWARSCYTHE = Registration.ITEMS.register("orcish_war_scythe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> RANSEUR = Registration.ITEMS.register("ranseur",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SIMPLETRIDENT = Registration.ITEMS.register("simple_trident",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELGREATSWORD = Registration.ITEMS.register("steel_great_sword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELPOLEARM = Registration.ITEMS.register("steel_polearm",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELWARSCYTHE = Registration.ITEMS.register("steel_war_scythe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELWARHAMMER = Registration.ITEMS.register("steel_warhammer",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SWISSHALBERD = Registration.ITEMS.register("swiss_halberd",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TWOHEADEDWARAXE = Registration.ITEMS.register("two_headed_war_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> VOULGE = Registration.ITEMS.register("voulge",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CEREMONIALHALBERT = Registration.ITEMS.register("ceremonial_halbert",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDHALBERT = Registration.ITEMS.register("diamond_halbert",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> PRIMITIVEWARHAMMER = Registration.ITEMS.register("primitive_warhammer",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SARISSA = Registration.ITEMS.register("sarissa",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SASUMATA = Registration.ITEMS.register("sasumata",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SIMPLEHALBERT = Registration.ITEMS.register("simple_halbert",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SPIKEDHALBERT = Registration.ITEMS.register("spiked_halbert",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STONEHALBERT = Registration.ITEMS.register("stone_halbert",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLACKGUARDCLAYMORE = Registration.ITEMS.register("blackguard_claymore",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZECLAYMORE = Registration.ITEMS.register("bronze_claymore",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DRAGONBONEGREATAXE = Registration.ITEMS.register("dragonbone_greataxe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DRAGONBONEGREATSWORD = Registration.ITEMS.register("dragonbone_greatsword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GLASSCLAYMORE = Registration.ITEMS.register("glass_claymore",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> POLEAXE = Registration.ITEMS.register("poleaxe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> POLEMACE = Registration.ITEMS.register("polemace",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STAHLRIMGREATAXE = Registration.ITEMS.register("stahlrim_greataxe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STAHLRIMGREATSWORD = Registration.ITEMS.register("stahlrim_greatsword",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> YARI = Registration.ITEMS.register("yari",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));

    //AXE
    public static final RegistryObject<Item> BROADAXE = Registration.ITEMS.register("broad_axe",
            () -> new AxeItem(CItemTier.WOOD,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BRONZEAXE = Registration.ITEMS.register("bronze_axe",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENAXE = Registration.ITEMS.register("dwarven_axe",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DWARVENHATCHET = Registration.ITEMS.register("dwarven_hatchet",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HATCHETBRONZE = Registration.ITEMS.register("hatchet_bronze",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HATCHETIRON = Registration.ITEMS.register("hatchet_iron",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> HATCHETSTEEL = Registration.ITEMS.register("hatchet_steel",
            () -> new AxeItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ORCISHAXE = Registration.ITEMS.register("orcish_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> ROOTCLEAVER = Registration.ITEMS.register("root_cleaver",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SMALLBATTLEAXE = Registration.ITEMS.register("small_battle_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SMALLORCISHAXE = Registration.ITEMS.register("small_orcish_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STEELAXE = Registration.ITEMS.register("steel_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> THORGRIMAXE = Registration.ITEMS.register("thorgrim_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TROLLHUNTERAXE = Registration.ITEMS.register("troll_hunter_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> VIKINGAXE = Registration.ITEMS.register("viking_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> DIAMONDHATCHET = Registration.ITEMS.register("diamond_hatchet",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> GOLDHATCHET = Registration.ITEMS.register("gold_hatchet",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STONEHATCHET = Registration.ITEMS.register("stone_hatchet",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> TOMAHAWK = Registration.ITEMS.register("tomahawk",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> WOODHATCHET = Registration.ITEMS.register("wood_hatchet",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> STAHLRIMAXE = Registration.ITEMS.register("stahlrim_axe",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
//unsorted
//-
//-
//-
//BOWS-XBOWS
    public static final RegistryObject<Item> COPPERBOW = Registration.ITEMS.register("copperbow", CopperBow::new);
    public static final RegistryObject<Item> STEELLONGWARBOW = Registration.ITEMS.register("steel_long_warbow", SteelLongWarbow::new);
    public static final RegistryObject<Item> STEELLONGBOW = Registration.ITEMS.register("steel_longbow", SteelLongbow::new);
    public static final RegistryObject<Item> STEELBOW = Registration.ITEMS.register("steelbow", SteelBow::new);
    public static final RegistryObject<Item> STEELCROSSBOW = Registration.ITEMS.register("steel_crossbow", SteelCrossbow::new);
    public static final RegistryObject<Item> BONELONGBOW = Registration.ITEMS.register("bone_longbow", BoneLongbow::new);
    public static final RegistryObject<Item> IRONBOW = Registration.ITEMS.register("ironbow", IronBow::new);
    public static final RegistryObject<Item> IRONCROSSBOW = Registration.ITEMS.register("iron_crossbow", IronCrossbow::new);
    public static final RegistryObject<Item> BRONZEBOW = Registration.ITEMS.register("bronzebow", BronzeBow::new);
    public static final RegistryObject<Item> BRONZECROSSBOW = Registration.ITEMS.register("bronze_crossbow", BronzeCrossbow::new);
    public static final RegistryObject<Item> ELVENLONGBOW = Registration.ITEMS.register("elven_longbow", ElvenLongbow::new);
    public static final RegistryObject<Item> IRONLONGBOW = Registration.ITEMS.register("iron_longbow", IronLongbow::new);
    public static final RegistryObject<Item> XENTHIUMCOMPOUNDBOW = Registration.ITEMS.register("xenthium_compoundbow", XenthiumCompoundbow::new);
    public static final RegistryObject<Item> ROOTLONGBOW = Registration.ITEMS.register("root_longbow", RootLongbow::new);
    public static final RegistryObject<Item> STAHLRIMBOW = Registration.ITEMS.register("stahlrim_bow", StahlrimBow::new);
//OTHERTHROWABLES OR RANGE
    public static final RegistryObject<Item> FIRESTAFF = Registration.ITEMS.register("firestaff",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> FLINTLOCK = Registration.ITEMS.register("flintlock",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLUNDERBUSS = Registration.ITEMS.register("blunderbuss",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> BLOWGUN = Registration.ITEMS.register("blowgun",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> MUSKET = Registration.ITEMS.register("musket",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> SHURIKEN = Registration.ITEMS.register("shuriken",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));
    public static final RegistryObject<Item> CHAKRAM = Registration.ITEMS.register("chakram",
            () -> new SwordItem(CItemTier.BRONZE,3,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CAWEAPON)));

//TEST
//public static final RegistryObject<Item> SHURIKEN = Registration.ITEMS.register("shuriken",
      //() -> new Shuriken(new Item.Properties().group(Citemgroup.CARMORYTAB)));
    //  public static final RegistryObject<Item> CHAKRAM = Registration.ITEMS.register("chakram",
    //       () -> new Chakram(new Item.Properties().group(Citemgroup.CARMORYTAB)));
 // public static final RegistryObject<Item> ASSEGAI = Registration.ITEMS.register("assegai", Assegai::new);
    public static final RegistryObject<Item> ASSEGAI = Registration.ITEMS.register("assegai",
            () -> new SwordItem(CItemTier.WOOD,12,0f, new Item.Properties().defaultMaxDamage(40).group(Citemgroup.CARMORYTAB)));
    //  public static final RegistryObject<Item> MUSKET = Registration.ITEMS.register("musket", Musket::new);



    public static void register() { }
}
