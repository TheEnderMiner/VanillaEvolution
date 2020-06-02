package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityEarthGuardian extends EntityMob{
	
	  private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setDarkenSky(false);
	
	public EntityEarthGuardian(World worldIn){
		super(worldIn);
		 this.setSize(2.5F, 3.8F);
	     this.experienceValue = 80;
	      this.setHealth(this.getMaxHealth());
		 
	}
	
	@Override
	protected void initEntityAI() {
	      this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(3, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(5, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityDwarvenGolem.class}));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(650.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
    this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(14D);
    this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(24.0D);
	}
	
	@Override
	public float getEyeHeight(){
		return  3.0F;
	}

	@Nullable
	protected ResourceLocation getLootTable()
	{
		return LootTableHandler.EARTH_GUARDIAN;
	}
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_EARTH_GUARDIAN_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_EARTH_GUARDIAN_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_EARTH_GUARDIAN_DEATH;
	}
	
	   public boolean attackEntityAsMob(Entity entityIn)
	    {
	        boolean flag = super.attackEntityAsMob(entityIn);

	        if (flag && this.getHeldItemMainhand().isEmpty() && entityIn instanceof EntityLivingBase)
	        {
	            float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();
	            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 7*20));
	        }

	        return flag;
	    }
	   
	   protected void updateAITasks()
	    {
		   this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }
	
public void setCustomNameTag(String name)
{
    super.setCustomNameTag(name);
    this.bossInfo.setName(this.getDisplayName());
}

public void addTrackingPlayer(EntityPlayerMP player)
{
    super.addTrackingPlayer(player);
    this.bossInfo.addPlayer(player);
}

public void removeTrackingPlayer(EntityPlayerMP player)
{
    super.removeTrackingPlayer(player);
    this.bossInfo.removePlayer(player);
}

	public boolean isNonBoss()
{
    return false;
}

}
