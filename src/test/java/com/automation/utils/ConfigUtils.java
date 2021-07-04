package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
    static Properties prop = new Properties();

    public ConfigUtils() {
    	
    }
    
    public static String getPropertyByKey(String key) {
    	File file;
		FileInputStream fileInput = null;
        try {
        	file = new File(System.getProperty("user.dir") + "/config.properties");
        	fileInput = new FileInputStream(file);
        	prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
