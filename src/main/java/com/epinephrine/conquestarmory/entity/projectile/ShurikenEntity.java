package com.epinephrine.conquestarmory.entity.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class ShurikenEntity extends SnowballEntity
{
    public ShurikenEntity(EntityType<? extends SnowballEntity> p_i50159_1_, World p_i50159_2_) {
        super(p_i50159_1_, p_i50159_2_);
    }

    public ShurikenEntity(World worldIn, LivingEntity throwerIn) {
        super(worldIn, throwerIn);
    }

    public ShurikenEntity(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    @Override
    protected void onEntityHit(EntityRayTraceResult result) {
        super.onEntityHit(result);
        result.getEntity().attackEntityFrom(DamageSource.causeThrownDamage(this,  this.getShooter()), 2.0F);}
}

