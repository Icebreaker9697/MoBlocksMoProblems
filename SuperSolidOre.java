package com.mo.moblocks;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperSolidOre extends Block{

	private Block drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public SuperSolidOre(String name, Material material, Block drop, 
	int meta, int least_quantity, int most_quantity) {	
		super(material);
		this.setHardness(10.0F);
		this.setResistance(15.0f);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
	}	
}
