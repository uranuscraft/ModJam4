package obesityFactor.factorHandleing;


import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.world.WorldServer;

public class PlayerTrackerMP extends EntityPlayerMP{

	public PlayerTrackerMP(MinecraftServer p_i45285_1_,
			WorldServer p_i45285_2_, GameProfile p_i45285_3_,
			ItemInWorldManager p_i45285_4_) {
		super(p_i45285_1_, p_i45285_2_, p_i45285_3_, p_i45285_4_);
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
