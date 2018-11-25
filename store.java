package gitpractice;

import java.io.*;
import java.util.HashMap;

public class store {
	
	static FileOutputStream fos = null;
	static ObjectOutputStream oos = null;
	
	public static void store_write(String Menu_file_name,HashMap<Integer,String>Map){
		
		try{
			
			
			fos = new FileOutputStream(Menu_file_name);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(Map);
			
		}catch(Exception e){
			
			e.printStackTrace();
		
		}finally{
			 
			if(fos != null) try{fos.close();}catch(IOException e){}
			if(oos != null) try{oos.close();}catch(IOException e){}	
		}

	}
	
	@SuppressWarnings({ "finally", "unchecked" })
	public HashMap<Integer,String> store_read(String Menu_file_name) throws ClassNotFoundException, IOException{ 
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			
			fis = new FileInputStream(Menu_file_name);
			ois = new ObjectInputStream(fis);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			
			if(fis != null) try{fis.close();}catch(IOException e){;}
			if(ois != null) try{ois.close();}catch(IOException e){;}
			return (HashMap<Integer, String>)ois.readObject();
		}
	}

}
