package com.epinephrine.conquestarmory.entity.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class ChakramEntity extends SnowballEntity
{
    public static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/entity/trident.png");

    public ChakramEntity(EntityType<? extends SnowballEntity> p_i50159_1_, World p_i50159_2_) {
        super(p_i50159_1_, p_i50159_2_);

    }

    public ChakramEntity(World worldIn, LivingEntity throwerIn) {
        super(worldIn, throwerIn);
    }

    public ChakramEntity(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    @Override
    protected void onEntityHit(EntityRayTraceResult result) {
        super.onEntityHit(result);
        result.getEntity().attackEntityFrom(DamageSource.causeThrownDamage(this,  this.getShooter()), 6.0F);}

   private boolean shouldReturnToThrower() {
        Entity entity = this.getShooter();
        if (entity != null && entity.isAlive()) {
            return !(entity instanceof ServerPlayerEntity) || !entity.isSpectator();
        } else {
            return true;
        }
    }

}

