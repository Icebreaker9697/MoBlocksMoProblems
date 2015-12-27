package com.mo.moblocks;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SuperHammer extends ItemPickaxe {
	static ToolMaterial toolMaterial = EnumHelper.addToolMaterial("superSolid", 10, 5000, 15.0F, 10.0F, 29);
	
	public SuperHammer(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "sword", "axe", "shovel");
		
	}
	
	 private static Set effectiveAgainst = Sets.newHashSet(new Block[] {Blocks.planks, 
			 Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, 
			 Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});

	 @Override
	 public boolean canHarvestBlock(Block block) {
	     return effectiveAgainst.contains(block) ? true : super.canHarvestBlock(block);
	 }
	 
	 @Override
	 public float getStrVsBlock(ItemStack stack, Block block) {
	     if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine || block.getMaterial() == Material.plants)
	     {
	    	 return this.efficiencyOnProperMaterial;
	     }
	     return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, block);
	 }

}
