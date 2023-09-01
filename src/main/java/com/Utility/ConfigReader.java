package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public String readConfig(String valuetoread) throws IOException
	{
        String path = System.getProperty("user.dir")+"//src//main//java//com//Utility//Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(valuetoread);
		
		System.out.println(value);
		
		return value;
	}

}
