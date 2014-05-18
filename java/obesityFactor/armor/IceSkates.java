package obesityFactor.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class IceSkates extends ItemArmor {

	

	

	 public IceSkates(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, 3);
		this.setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("iceSkates");
	}

	@Override
	    public void registerIcons (IIconRegister par1IconRegister)//Registers texture
	    {
	        this.itemIcon = par1IconRegister.registerIcon("obesityfactor:armor/" + textureName + "_"
	                + (this.armorType == 0 ? "helmet" : this.armorType == 1 ? "chestplate" : this.armorType == 2 ? "leggings" : this.armorType == 3 ? "boots" : "helmet"));
	    
	    }

	    @Override
	    public String getArmorTexture (ItemStack stack, Entity entity, int slot, String type)//Registers the model texture
	    {
	    	
	    	return "obesityfactor:textures/armor/ice_1.png";
	    	}
	    	
	   @Override
	    public void onArmorTick(World world,EntityPlayer player,ItemStack itemStack) {
		
		  if(world.getBlock((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Blocks.ice){
			  player.setVelocity(player.motionX * 1.5, player.motionY * 1.5, player.motionZ * 1.5);
		  }
	   	
	    }
	   
	   public String textureName = "ice";
	

@Override
public void onUpdate(ItemStack stack,World world,Entity entity, int par4, boolean par5) {
	 EntityPlayer player = (EntityPlayer) entity;
	   
}




}
