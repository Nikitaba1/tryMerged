package fileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	
	public String readDataFromPropertyFile(String key) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\commendata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
