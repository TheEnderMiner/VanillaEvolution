package com.evep.evepmod.items.tools.ranged;

import javax.annotation.Nullable;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTitaniumBow extends ItemBow implements IHasModel //Remove implements for before, Extends Item instead of ItemBow
{
    public ItemTitaniumBow(String name)
    {
    	setUnlocalizedName(name);
		setRegistryName(name);
        this.maxStackSize = 1;
        this.setMaxDamage(700);
        
        VanillaEvolutionItems.ITEMS.add(this);
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    return entityIn.getActiveItemStack().getItem() != VanillaEvolutionItems.titanium_bow ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
                }
            }
        });
        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
    }
        @Override
    	public int getItemEnchantability() 
    	{
    		return 10;
    	}
    	
        @Override
    	protected boolean isArrow(ItemStack stack) 
    	{
    		if(stack.getItem() == VanillaEvolutionItems.tech_arrow)
    		{
    			return true;
    		}
    		return false;
    	}
    	
    	@Override
    	public void registerModels() 
    	{
    		VanillaEvolutionMod.proxy.registerItemRenderer(this, 0, "inventory");
    	}
    }
  

//Arrow Speed + Charge time
//public static float getArrowVelocity(int charge)
//{
//  float f = (float)charge / 20.0F;
//  f = (f * f + f * 2.0F) / 3.0F;
//
//  if (f > 1.0F)
//  {
//      f = 1.0F;
//  }
//
//  return f;
//}
//
///**
//* How long it takes to use or consume an item
//*/
//public int getMaxItemUseDuration(ItemStack stack)
//{
//  return 72000;
//}






//    private ItemStack findAmmo(EntityPlayer player)
//    {
//        if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND)))
//        {
//            return player.getHeldItem(EnumHand.OFF_HAND);
//        }
//        else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND)))
//        {
//            return player.getHeldItem(EnumHand.MAIN_HAND);
//        }
//        else
//        {
//            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
//            {
//                ItemStack itemstack = player.inventory.getStackInSlot(i);
//
//                if (this.isArrow(itemstack))
//                {
//                    return itemstack;
//                }
//            }
//
//            return ItemStack.EMPTY;
//        }
//    }
//
//    protected boolean isArrow(ItemStack stack)
//    {
//        return stack.getItem() instanceof ItemArrow;
//    }
//
//    /**
//     * Called when the player stops using an Item (stops holding the right mouse button).
//     */
//    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
//    {
//        if (entityLiving instanceof EntityPlayer)
//        {
//            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
//            boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
//            ItemStack itemstack = this.findAmmo(entityplayer);
//
//            int i = this.getMaxItemUseDuration(stack) - timeLeft;
//            i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, entityplayer, i, !itemstack.isEmpty() || flag);
//            if (i < 0) return;
//
//            if (!itemstack.isEmpty() || flag)
//            {
//                if (itemstack.isEmpty())
//                {
//                    itemstack = new ItemStack(Items.ARROW);
//                }
//
//                float f = getArrowVelocity(i);
//
//                if ((double)f >= 0.1D)
//                {
//                    boolean flag1 = entityplayer.capabilities.isCreativeMode || (itemstack.getItem() instanceof ItemArrow && ((ItemArrow) itemstack.getItem()).isInfinite(itemstack, stack, entityplayer));
//
//                    if (!worldIn.isRemote)
//                    {
//                        ItemArrow itemarrow = (ItemArrow)(itemstack.getItem() instanceof ItemArrow ? itemstack.getItem() : Items.ARROW);
//                        EntityArrow entityarrow = itemarrow.createArrow(worldIn, itemstack, entityplayer);
//                        entityarrow.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);
//
//                        if (f == 1.0F)
//                        {
//                            entityarrow.setIsCritical(true);
//                        }
//
//                        int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);
//
//                        if (j > 0)
//                        {
//                            entityarrow.setDamage(entityarrow.getDamage() + (double)j * 0.5D + 0.5D);
//                        }
//
//                        int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
//
//                        if (k > 0)
//                        {
//                            entityarrow.setKnockbackStrength(k);
//                        }
//
//                        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0)
//                        {
//                            entityarrow.setFire(100);
//                        }
//
//                        stack.damageItem(1, entityplayer);
//
//                        if (flag1 || entityplayer.capabilities.isCreativeMode && (itemstack.getItem() == Items.SPECTRAL_ARROW || itemstack.getItem() == Items.TIPPED_ARROW))
//                        {
//                            entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
//                        }
//
//                        worldIn.spawnEntity(entityarrow);
//                    }
//
//                    worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
//
//                    if (!flag1 && !entityplayer.capabilities.isCreativeMode)
//                    {
//                        itemstack.shrink(1);
//
//                        if (itemstack.isEmpty())
//                        {
//                            entityplayer.inventory.deleteStack(itemstack);
//                        }
//                    }
//
//                    entityplayer.addStat(StatList.getObjectUseStats(this));
//                }
//            }
//        }
//    }

//
//    /**
//     * returns the action that specifies what animation to play when the items is being used
//     */
//    public EnumAction getItemUseAction(ItemStack stack)
//    {
//        return EnumAction.BOW;
//    }
//
//    /**
//     * Called when the equipped item is right clicked.
//     */
//    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
//    {
//        ItemStack itemstack = playerIn.getHeldItem(handIn);
//        boolean flag = !this.findAmmo(playerIn).isEmpty();
//
//        ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
//        if (ret != null) return ret;
//
//        if (!playerIn.capabilities.isCreativeMode && !flag)
//        {
//            return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
//        }
//        else
//        {
//            playerIn.setActiveHand(handIn);
//            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
//        }
//    }
//
//    /**
//     * Return the enchantability factor of the item, most of the time is based on material.
//     */
//    public int getItemEnchantability()
//    {
//        return 20;
//    }
