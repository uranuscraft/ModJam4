package obesityFactor;

import cpw.mods.fml.common.registry.GameRegistry;
import obesityFactor.item.RedstoneWand;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLoader {
public static Item redstonewand;
	public static void Loading() {
		redstonewand = new RedstoneWand().setTextureName(ObesityFactor.MODID + ":" + "redstonewand");
		GameRegistry.registerItem(redstonewand, "Redstone Wand");
		ItemStack red = new ItemStack(Items.redstone);
		ItemStack quartz = new ItemStack(Items.quartz);
		ItemStack stick = new ItemStack(Items.stick);
		
        GameRegistry.addRecipe(new ItemStack(redstonewand), "xxx", " z "," y ", 
                'x', red, 'y', quartz, 'z', stick);
}
	
}
