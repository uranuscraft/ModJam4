package obesityFactor;

import obesityFactor.armor.IceSkates;
import obesityFactor.factorHandleing.Player;
import obesityFactor.factorHandleing.StorageHandler;
import obesityFactor.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/**
 * 
 * @author UranusCraft
 *
 */
@Mod(modid = ObesityFactor.MODID, version = ObesityFactor.VERSION)
public class ObesityFactor
{
    public static final String MODID = "obesityFactor";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide="obesityFactor.proxy.ClientProxy", serverSide="obesityFactor.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static int iceID;
	public static int iceEnumID;
  
     @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
 	   Configuration config = new Configuration(event.getSuggestedConfigurationFile());
      iceID = config.get(Configuration.CATEGORY_GENERAL, "iceID", 1382).getInt();
 	   iceEnumID = config.get(Configuration.CATEGORY_GENERAL, "iceEnumID", 5).getInt();
 	   
 	   
 	   
 	   config.save();
 	   config.load();
 	  ArmorLoader.Loader(iceID, iceEnumID);
  	ItemLoader.Loading();
 	   
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
       }
}
