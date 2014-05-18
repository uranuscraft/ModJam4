package obesityFactor.factorHandleing;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.Session;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

public class PlayerTracker extends EntityPlayerSP{

	public PlayerTracker(Minecraft par1Minecraft, World par2World,
			Session par3Session, int par4) {
		super(par1Minecraft, par2World, par3Session, par4);
		StorageHandler.Mapper(this);
		Player.Loop(this);
	}
@Override
public void onUpdate() {
	super.onUpdate();
	Player.Do(this);
}
@Override
public void onLivingUpdate() {
	super.onLivingUpdate();
	Player.Do(this);
	
}

}
