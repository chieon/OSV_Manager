package kr.co.vodacom.config;

import java.io.IOException;
import java.util.Properties;

public class OSVProperties {
	public boolean init_done=false;
	public Properties config=null;
	
	public boolean init(String path){
		ReadProperties prop=new ReadProperties();
		try {
			prop.read(path);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			init_done=false;
			return false;
		}
		config=prop.getProp();
		init_done=true;
		return true;
	}//end of method : init
}//end of class : OSVProperties
