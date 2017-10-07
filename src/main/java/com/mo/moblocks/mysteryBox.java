package com.mo.moblocks;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class mysteryBox extends Block{
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public mysteryBox(String name, Material material, float hardness, float resistance, Item drop,
			int meta, int least_quantity, int most_quantity) {
		super(material);
		this.setHardness(22.5F);
		this.setResistance(15.0F);
		this.setLightLevel(.6F);
		this.setStepSound(soundTypeWood);
		this.setHarvestLevel("pickaxe", 3);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.drop = drop;
		this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
	}
	protected mysteryBox(String name, Material material, Item drop, int least_quantity, int most_quantity) {
	    this(name, material, 22.5f, 15.0f, drop, 0, least_quantity, most_quantity);
	}

	protected mysteryBox(String name, Material material, Item drop) {
	    this(name, material, drop, 1, 1);
	}
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
		return CustomItem.SuperHammer;
	}

	@Override
	public int damageDropped(IBlockState blockstate) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
}
