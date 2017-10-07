package com.mo.moblocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class CustomItemRenderer {
	
	public static void renderThis(){
		register(CustomItem.SuperDeathScythe);
		register(CustomItem.SuperSolidIngot);
		register(CustomItem.SuperHammer);
	}
	
	public static void register(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().
		register(item,0,new ModelResourceLocation(MoBlocksMoProblems.MODID 
				+ ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
