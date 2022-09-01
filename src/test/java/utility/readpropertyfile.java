package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class readpropertyfile {

	
	  public static String Readpropertyfile(String value) throws Exception
	  {
	 Properties prop = new Properties();
	 FileInputStream file = new FileInputStream("D:\\java programs\\Aframework\\testdata\\config.properties");
		 prop.load(file);
		return prop.getProperty(value);
	  }
}
