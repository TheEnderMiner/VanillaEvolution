package com.evep.evepmod.blocks;

//import com.evep.evepmod.VanillaEvolutionMod;
//import com.evep.evepmod.blocks.tileentity.TileEntityTitaniumVault;
//import com.evep.evepmod.init.VanillaEvolutionBlocks;
//import com.evep.evepmod.init.VanillaEvolutionItems;
//
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.inventory.InventoryHelper;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.EnumBlockRenderType;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//
//public class BlockTitaniumVault extends BlockContainer{
//
//	public BlockTitaniumVault(String name, Material material) {
//		super(material);
//		setUnlocalizedName(name);
//		setRegistryName(name);
//		
////		VanillaEvolutionBlocks.BLOCKS.add(this);
////		VanillaEvolutionItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
//	}
//	
//	@Override
//	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
//		if(!worldIn.isRemote){
//			playerIn.openGui(VanillaEvolutionMod.instance, VanillaEvolutionMod.GUI_TITANIUM_VAULT, worldIn, pos.getX(), pos.getY(), pos.getY());
//		}
//		
//		return true;
//	}
//	
//	@Override
//	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
//		TileEntityTitaniumVault tileentity = (TileEntityTitaniumVault)worldIn.getTileEntity(pos);
//		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
//		super.breakBlock(worldIn, pos, state);
//	}
//	
//	@Override
//	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
//	{
//		if(stack.hasDisplayName())
//		{
//			TileEntity tileentity = worldIn.getTileEntity(pos);
//			
//			if(tileentity instanceof TileEntityTitaniumVault)
//			{
//				((TileEntityTitaniumVault)tileentity).setCustomName(stack.getDisplayName());
//			}	
//		}
//	}
//	
//	@Override
//	public TileEntity createNewTileEntity(World worldIn, int meta) {
//		return new TileEntityTitaniumVault();
//	}
//	
//	@Override
//	 public EnumBlockRenderType getRenderType(IBlockState state)
//	    {
//	        return EnumBlockRenderType.MODEL;
//	    }
//	
//	@Override
//	public boolean isFullBlock(IBlockState state) {
//		return true;
//	}
//	
//	@Override
//	public boolean isFullCube(IBlockState state) {
//		return true;	
//		}
//	
//	@Override
//	public boolean isOpaqueCube(IBlockState state) {
//		return true;	
//		}
//
//}
