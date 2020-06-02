package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityZombie;
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

public class EntityImmjiriChampion extends EntityZombie{
	
	  private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS)).setDarkenSky(false);
	
	public EntityImmjiriChampion(World worldIn){
		super(worldIn);
		 this.setSize(1.5F, 3.1F);
	     this.experienceValue = 70;
	      this.setHealth(this.getMaxHealth());
		 
	}
	
	@Override
	protected void initEntityAI() {
		   this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIZombieAttack(this, 1.0D, false));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityImmjiriChampion.class}));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	        this.applyEntityAI();
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(600.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3700099940395355D);
      this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15D);
      this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
	}
	
	@Override
	 protected boolean shouldBurnInDay()
	    {
	        return false;
	    }
	
	@Override
	public float getEyeHeight(){
		return  2.45F;
	}

	@Nullable
  protected ResourceLocation getLootTable()
  {
		return LootTableHandler.IMMJIRI_CHAMPION;
  }
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_IMMJIRI_CHAMPION_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_IMMJIRI_CHAMPION_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_IMMJIRI_CHAMPION_DEATH;
	}
	
	   public boolean attackEntityAsMob(Entity entityIn)
	    {
	        boolean flag = super.attackEntityAsMob(entityIn);

	        if (flag && this.getHeldItemMainhand().isEmpty() && entityIn instanceof EntityLivingBase)
	        {
	            float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();
	            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, 20*20));
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
