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
		
if(!map.isEmpty()){
		if(!map.containsKey(player.getGameProfile().getName())) {
			 
			 map.put(player.getGameProfile().getName(), "0");
			
	       
		}
		
		
		

		dataStream.writeUTF(player.getGameProfile().getName());
		 dataStream.writeUTF(" ");
		 dataStream.writeUTF((map.get(player.getGameProfile().getName())));
		 dataStream.close();		 
	         
			
		
		
		
}
else {
	 map.put(player.getDisplayName(), "0");
	dataStream.writeUTF(player.getDisplayName());
	 dataStream.writeUTF(" ");
	 dataStream.writeUTF((map.get(player.getGameProfile().getName())));
	 dataStream.close();
}
	
	
}
		
	
	public static void Mapper(EntityPlayer player) {
		if(!map.isEmpty()){
		if(!map.containsKey(player.getGameProfile().getName())) {
			  try {
				readFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				try {
					writeFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
				
			}
			
		 }
		 else if(map.containsKey(player.getGameProfile().getName())) {
			 String v = map.get(player.getGameProfile().getName());
			 
			 
				 double h = Double.parseDouble(v) + 1;
				 map.put(player.getGameProfile().getName(), "" + h);
				 try {
					writeFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
		 }
		}
		else {
			try {
				readFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				try {
					writeFile(DimensionManager.getCurrentSaveRootDirectory(), "obesityFactor", player);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
				
			}
		}
	}

	public static String readFile(File file, String name, EntityPlayer player) throws IOException {
		File saveFile = new File(file, name + ".txt");
		
		DataInputStream dataStream = new DataInputStream(new FileInputStream(saveFile));
		String v = "";
		if (!saveFile.exists())
	    {
	        saveFile.createNewFile();
	       
	        writeFile(file, name,player);
	    }
		
		if (saveFile.exists())
	    {

		String user = dataStream.readUTF();
		
		dataStream.skip(1);
		v = dataStream.readUTF();
		
		map.put(user, v);
		
		dataStream.close();
		
	    }

		return v;

	}
}
