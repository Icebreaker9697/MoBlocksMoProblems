package com.mo.moblocks;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world,IChunkProvider chunkProvider, IChunkProvider chunkProvider2) {
		switch(world.provider.getDimensionId()) {
		case -1:
			//nether
			break;
		case 0:
			//over
			generateSurface(world, rand, chunkX, chunkZ, 50, 0, 80 );
			break;
		case 1:
			//end
			break;
		}
	}
	
	  private void generateSurface(World world, Random rand, int chunkX, int chunkZ,int chancesToSpawn, int minHeight, int maxHeight) {
		  	int heightDiff = maxHeight - minHeight + 1;
		    for (int i = 0; i < chancesToSpawn; i ++) {
		    	int x = chunkX * 16 + rand.nextInt(16);
		    	int y = minHeight + rand.nextInt(heightDiff);
	        	int z = chunkZ * 16 + rand.nextInt(16);
	        	(new WorldGenMinable(CustomBlocks.SuperSolidOre.getDefaultState(), 11)).generate(world, rand, new BlockPos(x, y, z));
		    }
	    }
}