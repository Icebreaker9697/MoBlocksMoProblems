package com.mo.moblocks;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class MoRecipes {

	public static void addRecipes(){

		GameRegistry.addSmelting(new ItemStack(CustomBlocks.SuperSolidOre), new ItemStack(CustomItem.SuperSolidIngot), 1F);

		
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.ssiBlock), new Object[]{
				"AAA",
				"AAA",
				"AAA",
				'A', CustomItem.SuperSolidIngot}
				);

		GameRegistry.addRecipe(new ItemStack(CustomBlocks.mysteryBox), new Object[]{
				"IAI",
				"GAG",
				"IAI",
				'I', Items.iron_ingot, 'A', CustomBlocks.ssiBlock, 'G', Items.gold_ingot,}
				);
		
		GameRegistry.addShapelessRecipe(new ItemStack(CustomItem.SuperSolidIngot,9), new Object[] { 
				new ItemStack(CustomBlocks.ssiBlock)});
	}
}
