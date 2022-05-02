package com.epinephrine.conquestarmory.util;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class CItemModelProperties
{
    public static void makeBow(Item item)
    {
        ItemModelsProperties.registerProperty(item, new ResourceLocation("pull"), (p_239429_0_, p_239429_1_, p_239429_2_) ->
        {
            if (p_239429_2_ == null)
            {
                return 0.0F;
            } else {
                return p_239429_2_.getActiveItemStack() != p_239429_0_ ? 0.0F : (float)(p_239429_0_.getUseDuration() - p_239429_2_.getItemInUseCount()) / 20.0F;
            }
        });

        ItemModelsProperties.registerProperty(item, new ResourceLocation("pulling"), (p_239428_0_, p_239428_1_, p_239428_2_) ->
        {
            return p_239428_2_ != null && p_239428_2_.isHandActive() && p_239428_2_.getActiveItemStack() == p_239428_0_ ? 1.0F : 0.0F;
        });
    }
    public static void makeCrossbow(Item item)
    {
        ItemModelsProperties.registerProperty(item, new ResourceLocation("pull"), (p_239427_0_, p_239427_1_, p_239427_2_) ->
        {
            if (p_239427_2_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_239427_0_) ? 0.0F : (float)(p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount()) / (float)CrossbowItem.getChargeTime(p_239427_0_);
            }
        });
        ItemModelsProperties.registerProperty(item, new ResourceLocation("pulling"), (p_239426_0_, p_239426_1_, p_239426_2_) ->
        {
            return p_239426_2_ != null && p_239426_2_.isHandActive() && p_239426_2_.getActiveItemStack() == p_239426_0_ && !CrossbowItem.isCharged(p_239426_0_) ? 1.0F : 0.0F;
        });
        ItemModelsProperties.registerProperty(item, new ResourceLocation("charged"), (p_239425_0_, p_239425_1_, p_239425_2_) ->
        {
            return p_239425_2_ != null && CrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
        });
        ItemModelsProperties.registerProperty(item, new ResourceLocation("firework"), (p_239424_0_, p_239424_1_, p_239424_2_) ->
        {
            return p_239424_2_ != null && CrossbowItem.isCharged(p_239424_0_) && CrossbowItem.hasChargedProjectile(p_239424_0_, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }
    public static void makeShield(Item item)
    {
        ItemModelsProperties.registerProperty(item, new ResourceLocation("blocking"), (p_239421_0_, p_239421_1_, p_239421_2_) ->
        {
            return p_239421_2_ != null && p_239421_2_.isHandActive() && p_239421_2_.getActiveItemStack() == p_239421_0_ ? 1.0F : 0.0F;
        });

    }
    public static void makeTriedent(Item item)
    {
        ItemModelsProperties.registerProperty(item, new ResourceLocation("throwing"), (p_239419_0_, p_239419_1_, p_239419_2_) ->
        {
            return p_239419_2_ != null && p_239419_2_.isHandActive() && p_239419_2_.getActiveItemStack() == p_239419_0_ ? 1.0F : 0.0F;
        });
    }

    public static void register() { }
}
