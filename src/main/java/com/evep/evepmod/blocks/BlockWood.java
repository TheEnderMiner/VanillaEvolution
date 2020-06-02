package com.evep.evepmod.blocks;

import com.evep.evepmod.util.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockWood extends Block 
//implements IMetaName
{

//	public static final PropertyEnum<BlockWood.EnumType> VARIANT = PropertyEnum.<BlockWood.EnumType>create("variant", BlockWood.EnumType.class);
	
	
	public BlockWood(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(blockSoundType.WOOD);
//		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockWood.EnumType.GOLDWOOD));
	}
	
//	@Override
//	public int damageDropped(IBlockState state) {
//	return((BlockWood.EnumType)state.getValue(VARIANT)).getMeta();
//	}
//	
//	@Override
//	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
//		for(BlockWood.EnumType blockwood$enumtype : BlockWood.EnumType.values()){
//			items.add(new ItemStack(this, 1, blockwood$enumtype.getMeta()));
//		}
//	}
//	
//	@Override
//	public IBlockState getStateFromMeta(int meta) {
//		return this.getDefaultState().withProperty(VARIANT, BlockWood.EnumType.byMetadata(meta));
//	}
//	
//	@Override
//	public int getMetaFromState(IBlockState state) {
//		return ((BlockWood.EnumType)state.getValue(VARIANT)).getMeta();
//	}
//	
//	@Override
//	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,EntityPlayer player) {
//		return new ItemStack(Item.getItemFromBlock(this), 1, (int)(getMetaFromState(world.getBlockState(pos))));
//	}
//	
//	@Override
//	protected BlockStateContainer createBlockState() {
//		return new BlockStateContainer (this, new IProperty[] {VARIANT});
//	}
//	
//	public static enum EnumType implements IStringSerializable{
//		
//		GOLDWOOD(0, "goldwood");
//		
//		private static final BlockWood.EnumType[] META_LOOKUP = new BlockWood.EnumType[values().length];
//		private final int meta;
//		private final String name, unlocalizedName;
//		
//		private EnumType(int meta, String name) {
//			this(meta, name, name);
//		}
//		
//		private EnumType(int meta, String name, String unlocalizedName) {
//		this.meta = meta;
//		this.name = name;
//		this.unlocalizedName = unlocalizedName;
//		}
//
//		@Override
//		public String getName() {
//			return this.name;
//		}
//		
//		public int getMeta() {
//			return this.meta;
//		}
//		
//		public String getUnlocalizedName() {
//			return this.unlocalizedName;
//		}
//		
//		@Override
//		public String toString() {
//			return this.name;
//		}
//		
//		public static BlockWood.EnumType byMetadata(int meta){
//			return META_LOOKUP[meta];
//		}
//		
//		static{
//			for(BlockWood.EnumType blockwood$enumtype : values()){
//				META_LOOKUP[blockwood$enumtype.getMeta()] = blockwood$enumtype;
//			}
//		}
//		
//	}

//	@Override
//	public String getSpecialName(ItemStack stack) {
//		return BlockWood.EnumType.values()[stack.getItemDamage()].getName();
//	}
}
