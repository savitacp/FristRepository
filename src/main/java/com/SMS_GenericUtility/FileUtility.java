package com.SMS_GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		  FileInputStream fis = new FileInputStream(IPConstants.propertyfilepath);
		  Properties pobj = new Properties();
		  pobj.load(fis);
		  String value = pobj.getProperty(key);
		  return value;
		
	}

}
