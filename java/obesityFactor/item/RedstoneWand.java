package obesityFactor.item;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class RedstoneWand extends Item{
	public RedstoneWand()
    {
          super();
          this.setCreativeTab(CreativeTabs.tabMaterials);
          setUnlocalizedName("redstoneWand");
            }
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		float f = 1.0F;
        float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
        float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
        double d = player.prevPosX + (player.posX - player.prevPosX) * (double)f;
        double d1 = (player.prevPosY + (player.posY - player.prevPosY) * (double)f + 1.6200000000000001D) - (double)player.yOffset;
        double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)f;
        Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5000D;
        Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d1, false);
        if (movingobjectposition == null)
        {
         return itemstack;
        }
         if (movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
        {
         int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                int k = movingobjectposition.blockZ;
                
                Block b = world.getBlock(i, j, k);
                if(player.capabilities.isCreativeMode||player.inventory.consumeInventoryItem(Items.redstone)) {
                	
                	double m = player.motionY + 1;
                	world.spawnParticle("fireworksSpark", i, j - 0.3D, k, rand.nextGaussian() * 0.05D, -  m* 0.5D, rand.nextGaussian() * 0.05D);
                     b.setLightLevel(10);
                }
        }
		return itemstack;
	
	}
	  public static Random rand = new Random();
	  
}
