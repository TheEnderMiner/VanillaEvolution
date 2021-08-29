package com.evep.evepmod.entity;

import javax.annotation.Nullable;

import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityDwarvenMiner extends EntityMob
{

	public EntityDwarvenMiner(World worldIn) {
		super(worldIn);
		 this.setSize(0.5F, 1.6F);
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
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityDwarvenMiner.class}));
//	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMinotaur.class, true));
//	        this.applyEntityAttributes();
//	        this.applyEntityAI();
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23900000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(12.0D);
	}
	
	@Override
	public float getEyeHeight(){
		return  1.35F;
	}
	
	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.DWARVEN_MINER;
    }
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_DWARF_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_DWARF_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_DWARF_DEATH;
	}
	
}
