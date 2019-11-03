package com.evep.evepmod.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;
import com.google.common.collect.Sets;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityTurkey extends EntityChicken{
	 public float wingRotation;
	    public float destPos;
	    public float oFlapSpeed;
	    public float oFlap;
	    public float wingRotDelta = 1.0F;
	    public int timeUntilNextEgg;
	    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, VanillaEvolutionItems.barley_seed, VanillaEvolutionItems.corn_seed, VanillaEvolutionItems.oat_seed, VanillaEvolutionItems.rye_seed);
	
	public EntityTurkey(World worldIn) {
		super(worldIn);
	     this.setSize(0.4F, 0.7F);
	      this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
	}
	
	 protected void initEntityAI()
	    {
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 1.4D));
	        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(3, new EntityAITempt(this, 1.0D, false, TEMPTATION_ITEMS));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
	        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	    }
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.252D);
	}
	
	 public EntityTurkey createChild(EntityAgeable ageable)
	    {
	        return new EntityTurkey(this.world);
	    }
	 
	    public boolean isBreedingItem(ItemStack stack)
	    {
	        return TEMPTATION_ITEMS.contains(stack.getItem());
	    }
	
	    public void onLivingUpdate()
	    {
	        super.onLivingUpdate();
	        this.oFlap = this.wingRotation;
	        this.oFlapSpeed = this.destPos;
	        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);
	        this.destPos = MathHelper.clamp(this.destPos, 0.0F, 1.0F);

	        if (!this.onGround && this.wingRotDelta < 1.0F)
	        {
	            this.wingRotDelta = 1.0F;
	        }

	        this.wingRotDelta = (float)((double)this.wingRotDelta * 0.9D);

	        if (!this.onGround && this.motionY < 0.0D)
	        {
	            this.motionY *= 0.6D;
	        }

	        this.wingRotation += this.wingRotDelta * 2.0F;
	        
	        if (!this.world.isRemote && !this.isChild() && !this.isChickenJockey() && --this.timeUntilNextEgg <= 0)
	        {
	            this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
	            this.dropItem(VanillaEvolutionItems.turkey_feather, 1);
	            this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
	        }
	    }
	    
	    public void fall(float distance, float damageMultiplier)
	    {
	    }
	    
	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.TURKEY;
    }
	
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_TURKEY_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_TURKEY_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_TURKEY_DEATH;
	}

}
