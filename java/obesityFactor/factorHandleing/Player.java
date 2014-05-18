package obesityFactor.factorHandleing;

import com.mojang.authlib.GameProfile;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.Session;
import net.minecraft.world.World;

public class Player {

	public static void Do(EntityPlayer player) {
		Minecraft mine = Minecraft.getMinecraft();
		
		if(mine.isSingleplayer() && !mine.isGamePaused() && !mine.currentScreen.doesGuiPauseGame()) {
			
			StorageHandler.Mapper(player);
		
				if(mine.isSingleplayer() && !mine.isGamePaused() && !mine.currentScreen.doesGuiPauseGame()) {
					StorageHandler.Mapper(player);
					Handler.Event(player);
					Fatten(player);
				}
				
				

		
		}
		else if (!mine.theWorld.isRemote && !mine.currentScreen.equals(mine.loadingScreen)){

			StorageHandler.Mapper(player);
		
				if(mine.isSingleplayer() && !mine.isGamePaused() && !mine.currentScreen.doesGuiPauseGame()) {
					StorageHandler.Mapper(player);
					Handler.Event(player);
					Fatten(player);
				}
		}

	}
	public static void Loop(EntityPlayer player) {
		Minecraft mine = Minecraft.getMinecraft();
		do {
		
		if (mine.theWorld.isRemote && !mine.currentScreen.equals(mine.loadingScreen)){

			
		
					StorageHandler.Mapper(player);
					Handler.Event(player);
					Fatten(player);
				
		}
		} while(con);
	}
	
	
    public static boolean con = true;
	public static void Fatten(EntityPlayer player) {
		
			if(player.getItemInUse() == new ItemStack(Items.chicken)) {
				if(player.isEating()) {
				StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), 4));
			Handler.Event(player);	
				}
			}
			if(player.getItemInUse() == new ItemStack(Items.porkchop)) {
				if(player.isEating()) {
				StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), 4));
				Handler.Event(player);	
				}
		}
		if(player.getItemInUse() == new ItemStack(Items.cake)) {
			
			if(player.isEating()) {
			StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), 4));
			
			Handler.Event(player);	
			}
			}
		if(player.getItemInUse() == new ItemStack(Items.carrot)) {
			if(player.isEating()) {
			StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), -1));
			Handler.Event(player);	
			}
			}
		if(player.getItemInUse() == new ItemStack(Items.beef)) {
			if(player.isEating()) {
			StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), 2));
			
			Handler.Event(player);	
			}
			}
if(player.getItemInUse() == new ItemStack(Items.potato)) {
	if(player.isEating()) {
	StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), -1));
	Handler.Event(player);	
	}
			}
if(player.getItemInUse() == new ItemStack(Items.cookie)) {
	if(player.isEating()) {
	StorageHandler.map.put(player.getGameProfile().getName(), "" + Equations.weight(Double.parseDouble(StorageHandler.map.get(player.getDisplayName())), 10));
	Handler.Event(player);	
	
	}
	}

	}
	

}
