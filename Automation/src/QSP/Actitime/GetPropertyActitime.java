package QSP.Actitime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyActitime {

	public static String GetPropertyURL() throws IOException {
		  FileInputStream fis = new FileInputStream("./data/login.property");
		  Properties p = new Properties();
		  p.load(fis);
		  String url = p.getProperty("url");
		  
		return url;
	}
	public static String GetPropertyUN() throws IOException {
		  FileInputStream fis = new FileInputStream("./data/login.property");
		  Properties p = new Properties();
		  p.load(fis);
		  String un = p.getProperty("username");
		  
		return un;
	}
	
	public static String GetPropertyPW() throws IOException {
		  FileInputStream fis = new FileInputStream("./data/login.property");
		  Properties p = new Properties();
		  p.load(fis);
		  String pw = p.getProperty("password");
		  
		return pw;
	}
	
}
