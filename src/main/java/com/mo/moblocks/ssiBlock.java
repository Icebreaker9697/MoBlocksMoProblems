package com.mo.moblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ssiBlock extends Block{

	public ssiBlock(String name, Material material, float hardness, float resistance) {
		super(Material.rock);
		this.setHardness(4.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
