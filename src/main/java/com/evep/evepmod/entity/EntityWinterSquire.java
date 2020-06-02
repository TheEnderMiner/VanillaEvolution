package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.init.VanillaEvolutionItems;
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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityWinterSquire extends EntityMob{

	public EntityWinterSquire(World worldIn) {
		super(worldIn);
	     this.setSize(0.6F, 1.95F);
	     this.experienceValue = 25;
	}
	
	@Override
	protected void initEntityAI() {
	      this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(3, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(5, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityWinterSquire.class}));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMinotaur.class, true));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityDwarvenGuard.class, true));
	        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityDwarvenHunter.class, true));
	        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityDwarvenMiner.class, true));
	        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
//	        this.applyEntityAttributes();
//	        this.applyEntityAI();
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22400000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(8.0D);
	}
	
	@Override
	public float getEyeHeight(){
		return  1.74F;
	}
	
	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.WINTER_SQUIRE;
    }
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_WINTER_SQUIRE_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_WINTER_SQUIRE_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_WINTER_SQUIRE_DEATH;
	}
	
	   public boolean attackEntityAsMob(Entity entityIn)
	    {
	        boolean flag = super.attackEntityAsMob(entityIn);

	        if (flag && this.getHeldItemMainhand().isEmpty() && entityIn instanceof EntityLivingBase)
	        {
	            float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();
	            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 200 * (int)f));
	        }

	        return flag;
	    }

}
