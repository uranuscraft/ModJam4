package obesityFactor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import obesityFactor.armor.IceSkates;

public class ArmorLoader {
	 public static int iceID;
		public static int iceEnumID;
	  
	   
	   public static void Loader(int par1, int par2) {
		   iceID = par1;
		   iceEnumID = par2;
		   GameRegistry.registerItem(ice,"Ice skates");
		   ItemStack leather = new ItemStack(Items.leather);
			ItemStack iron = new ItemStack(Items.iron_ingot);
			
			
	        GameRegistry.addRecipe(new ItemStack(ice), "x x", "y y", 
	                'x', leather, 'y', iron);
		   }
	   public static ItemArmor ice = (ItemArmor) new IceSkates(EnumHelper.addArmorMaterial("ice", 20, new int[] { 2, 6, 5, -1 }, 50),3,iceID).setTextureName(ObesityFactor.MODID + ":" + "iceboots");
	   
}
