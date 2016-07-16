package Testutils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class LoadTestProperties {
	public static final String propertiesFilePath="D:\\Backup data\\Ide test cases\\ProjectAmazon\\src\\Testutils\\Testproperties.properties";
	public static Properties testproperties=new Properties();
	
	public static void loadTestDataProperties() throws IOException
	{
		FileInputStream filesrc=new FileInputStream(propertiesFilePath);
		testproperties.load(filesrc);
		
	}

	
	public static Properties getTestDataProperties()
	{
		return testproperties;
	}
}
