package obesityFactor.factorHandleing;

import java.io.IOException;
import java.util.HashMap;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.WorldEvent.Load;

public class Handler {
	


	public static HashMap<String ,Integer> height = new HashMap<String,Integer>();

	
	public static void Event(EntityPlayer player) {
	
		
		player.addPotionEffect(new PotionEffect(2, 10000000, (int) ((int)10 * Equations.Speed(Double.parseDouble(StorageHandler.map.get(player.getGameProfile().getName()))))));
		if(player.motionY < 0){
		do {
			if(height.isEmpty()) {
		height.put(player.getGameProfile().getName(), (int)player.posY);
		continue;
		}
		if(height.containsKey(player.getGameProfile().getName())) {
			if(height.get(player.getGameProfile().getName()) > player.posY) {
				player.worldObj.getTopSolidOrLiquidBlock((int)player.posX,(int)player.posZ);
			player.setVelocity(player.motionX, gravity(player), player.motionZ);
			}
		}
		
		} while(player.isAirBorne);
		}
}
	/**
	 * 
	 * @param par1 the player
	 * @return the gravity amount
	 */
	public static double gravity(EntityPlayer par1) {
		double t = 2 * 9.8;
		double d = height.get(par1.getGameProfile().getName()) - par1.posY;
		double befores = d * t;
		System.out.print("hi");
		return Math.sqrt(befores);
	}
}
