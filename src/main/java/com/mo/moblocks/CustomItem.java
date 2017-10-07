package com.mo.moblocks;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class CustomItem{
	
	public static Item SuperDeathScythe;
	public static Item SuperSolidIngot;
	public static Item SuperHammer;
	public static ToolMaterial Scythe = EnumHelper.addToolMaterial("Scythe", 3, 3000, 10.0F, 
			60.0F, 30);
	static ToolMaterial hammer = EnumHelper.addToolMaterial("superSolid", 10, 5000, 15.0F, 
			10.0F, 29);

	
	public static void createItems() {
		GameRegistry.registerItem(SuperDeathScythe = new SuperDeathScythe(Scythe ,"SuperDeathScythe"), "SuperDeathScythe");
		GameRegistry.registerItem(SuperSolidIngot = new SuperSolidIngot("SuperSolidIngot"), "SuperSolidIngot");
		GameRegistry.registerItem(SuperHammer = new SuperHammer(hammer, "SuperHammer"), "SuperHammer");
	}
}
