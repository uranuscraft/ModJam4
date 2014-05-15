package obesityFactor.factorHandleing;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.DimensionManager;
/**
 * 
 * @author UranusCraft
 *
 */
public class StorageHandler {
	
	
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	public static void writeFile(File file, String name, EntityPlayer player) throws IOException {
		File saveFile = new File(file, name+ ".txt");
		
	     DataOutputStream dataStream = new DataOutputStream(new FileOutputStream(saveFile));
	    
		if (!saveFile.exists())
	    {
	        saveFile.createNewFile();
	    }
		

		if(!map.containsKey(player.getDisplayName())) {
			 
			 map.put(player.getDisplayName(), "0");
			
	       
		}
		
		
		

			 dataStream.writeUTF(player.getDisplayName());
			 dataStream.writeUTF(" ");
			 dataStream.writeUTF((map.get(player.getDisplayName())));
			 dataStream.close();
	         
			
		
		
		
		
		
	}
	public static void Mapper(EntityPlayer player) {
		 if(!map.containsKey(player.getDisplayName())) {
			  try {
				readFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
		 else if(map.containsKey(player.getDisplayName())) {
			 String v = map.get(player.getDisplayName());
			 
			 
				 double h = Double.parseDouble(v) + 1;
				 map.put(player.getDisplayName(), "" + h);
			 
		 }
	}

	public static void readFile(File file, String name, EntityPlayer player) throws IOException {
		File saveFile = new File(file, name + ".txt");
		
		DataInputStream dataStream = new DataInputStream(new FileInputStream(saveFile));
		
		if (!saveFile.exists())
	    {
	        saveFile.createNewFile();
	       
	        writeFile(file, name,player);
	    }
		
		if (saveFile.exists())
	    {

		String user = dataStream.readUTF();
		
		dataStream.skip(1);
		String v = dataStream.readUTF();
		
		map.put(user, v);
		
		dataStream.close();
		
	    }



	}
}
