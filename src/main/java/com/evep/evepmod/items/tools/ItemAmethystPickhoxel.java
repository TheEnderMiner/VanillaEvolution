package com.evep.evepmod.items.tools;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.evep.evepmod.init.VanillaEvolutionItems;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAmethystPickhoxel extends ItemPickaxe{
	
private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER, Blocks.ACACIA_STAIRS, Blocks.BIRCH_STAIRS, Blocks.DARK_OAK_STAIRS, Blocks.JUNGLE_STAIRS, Blocks.OAK_STAIRS, Blocks.SPRUCE_STAIRS, Blocks.DOUBLE_WOODEN_SLAB, Blocks.WOODEN_SLAB, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE, Blocks.WEB, Blocks.CRAFTING_TABLE, Blocks.ACACIA_DOOR, Blocks.BIRCH_DOOR, Blocks.DARK_OAK_DOOR, Blocks.JUNGLE_DOOR, Blocks.OAK_DOOR, Blocks.SPRUCE_DOOR);
    
	public ItemAmethystPickhoxel(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.amethyst;
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "axe", "shovel", "hoe");
	}

	public boolean canHarvestBlock(IBlockState block) {
		return EFFECTIVE_ON.contains(block.getBlock()) ? true : super.canHarvestBlock(block);
	}

	public float getDestroySpeed(ItemStack stack, IBlockState state)
	{
		Material material = state.getMaterial();
		if( material == Material.WOOD && material == Material.PLANTS && material == Material.VINE) {
			return this.efficiency;
		}

		return EFFECTIVE_ON.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	}
	
	 public boolean canHarvestBlock1(IBlockState blockIn)
	    {
	        Block block = blockIn.getBlock();

	        if (block == Blocks.SNOW_LAYER)
	        {
	            return true;
	        }
	        else
	        {
	            return block == Blocks.SNOW;
	        }
	    }

	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.getBlockState(pos.up()).getMaterial() == Material.AIR && block == Blocks.GRASS)
	            {
	                IBlockState iblockstate1 = Blocks.GRASS_PATH.getDefaultState();
	                worldIn.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

	                if (!worldIn.isRemote)
	                {
	                    worldIn.setBlockState(pos, iblockstate1, 11);
	                    itemstack.damageItem(1, player);
	                }

	                return EnumActionResult.SUCCESS;
	            }
	            else
	            {
	                return EnumActionResult.PASS;
	            }
	        }
	    }
	
	    @SuppressWarnings("incomplete-switch")
	    public EnumActionResult onItemUse1(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	            {
	                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
	                {
	                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                    return EnumActionResult.SUCCESS;
	                }

	                if (block == Blocks.DIRT)
	                {
	                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
	                    {
	                        case DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                            return EnumActionResult.SUCCESS;
	                        case COARSE_DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	                            return EnumActionResult.SUCCESS;
	                    }
	                }
	            }

	            return EnumActionResult.PASS;
	        }
	    }

		private void setBlock(ItemStack itemstack, EntityPlayer player, World worldIn, BlockPos pos,
				IBlockState defaultState) {
			
		}

		@Override
		public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
			final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

			if (slot == EntityEquipmentSlot.MAINHAND) {
				replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 1);
				replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 0.1);
			}

			return modifiers;
		}
		private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double multiplier) {
			// Get the modifiers for the specified attribute
			final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

			// Find the modifier with the specified ID, if any
			final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

			if (modifierOptional.isPresent()) { // If it exists,
				final AttributeModifier modifier = modifierOptional.get();
				modifiers.remove(modifier); // Remove it
				modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier, modifier.getOperation())); // Add the new modifier
			}
		}
}
