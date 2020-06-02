package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityCactusBug extends EntitySpider{

	public EntityCactusBug(World worldIn) {
		super(worldIn);
	     this.setSize(0.5F, 0.3F);
	     this.experienceValue = 2;
//	     this.setHealth(this.getMaxHealth());
	}
	
//	@Override 
//	protected void initEntityAI()
//	    {
//	        this.tasks.addTask(1, new EntityAISwimming(this));
//	        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
//	//        this.tasks.addTask(4, new EntitySpider.AISpiderAttack(this));
//	        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.8D));
//	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
//	        this.tasks.addTask(6, new EntityAILookIdle(this));
//	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
//	    }

	@Override
	 protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
    }
	
	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.CACTUS_BUG;
    }
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_CACTUS_BUG_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundsHandler.ENTITY_CACTUS_BUG_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_CACTUS_BUG_DEATH;
	}
	
	@Override
	 public float getEyeHeight()
    {
        return 0.3F;
    }
	
	    @Override
	    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
	    {
	        livingdata = super.onInitialSpawn(difficulty, livingdata);

	        if (this.world.rand.nextInt(100) == 0)
	        {
	            EntitySkeleton entityskeleton = new EntitySkeleton(this.world);
	            entityskeleton.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
	            entityskeleton.onInitialSpawn(difficulty, (IEntityLivingData)null);
	            this.world.spawnEntity(entityskeleton);
	            entityskeleton.startRiding(this);
	        }
	        return null;
	    }
	    
}
