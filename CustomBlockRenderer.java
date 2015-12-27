package com.mo.moblocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class CustomBlockRenderer {
//	
//	public static mysteryBox mbox;
//	public static ssiBlock ssiBlock;
//	public static SuperSolidOre superOre;
	private static String string = MoBlocksMoProblems.MODID;
	public static void renderThis() {
		register(CustomBlocks.mysteryBox);
		register(CustomBlocks.ssiBlock);
		register(CustomBlocks.SuperSolidOre);
	}
	
	public static void register(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block),0,new ModelResourceLocation(string + 
				":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
