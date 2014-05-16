package obesityFactor.factorHandleing;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.DimensionManager;

public class Handler {
public static void Event(EntityPlayer player) {
	try {
		player.addPotionEffect(new PotionEffect(2, (int)Float.POSITIVE_INFINITY, Integer.parseInt(StorageHandler.readFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player))));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
