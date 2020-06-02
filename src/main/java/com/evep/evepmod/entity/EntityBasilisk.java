package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
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

public class EntityBasilisk extends EntityZombie{

	  private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS)).setDarkenSky(false);
	  
	public EntityBasilisk(World worldIn) {
		super(worldIn);
	     this.setSize(5F, 4.5F);
	     this.experienceValue = 50;
	      this.setHealth(this.getMaxHealth());
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3500009940395355D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(11.0D);
	}
	
	@Override
	 protected boolean shouldBurnInDay()
	    {
	        return false;
	    }
	
	@Override
	public float getEyeHeight(){
		return  5.5F;
	}

	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.BASILISK;
    }
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_BASILISK_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_BASILISK_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_BASILISK_DEATH;
	}
	
	   public boolean attackEntityAsMob(Entity entityIn)
	    {
	        boolean flag = super.attackEntityAsMob(entityIn);

	        if (flag && this.getHeldItemMainhand().isEmpty() && entityIn instanceof EntityLivingBase)
	        {
	            float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();
	            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, 200 * (int)f));
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
