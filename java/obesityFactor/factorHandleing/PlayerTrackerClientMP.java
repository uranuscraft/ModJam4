package obesityFactor.factorHandleing;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.Session;
import net.minecraft.world.World;

public class PlayerTrackerClientMP extends EntityClientPlayerMP{

	public PlayerTrackerClientMP(Minecraft p_i45064_1_, World p_i45064_2_,
			Session p_i45064_3_, NetHandlerPlayClient p_i45064_4_,
			StatFileWriter p_i45064_5_) {
		super(p_i45064_1_, p_i45064_2_, p_i45064_3_, p_i45064_4_, p_i45064_5_);
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
