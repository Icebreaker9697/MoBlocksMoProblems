package com.mo.moblocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class CustomBlocks {
	
	public static mysteryBox mysteryBox;
	public static ssiBlock ssiBlock;
	public static SuperSolidOre SuperSolidOre;
	
	public static void createBlock(){
		GameRegistry.registerBlock(mysteryBox = new mysteryBox("mysteryBox", Material.rock, 22.5F, 15.0F, CustomItem.SuperHammer, 1, 1, 1), "mysteryBox");
		GameRegistry.registerBlock(ssiBlock = new ssiBlock("ssiBlock", Material.rock, 0, 0), "ssiBlock");
		GameRegistry.registerBlock(SuperSolidOre = new SuperSolidOre("SuperSolidOre", Material.rock, CustomBlocks.SuperSolidOre, 1, 1, 1), "SuperSolidOre");
	}
}