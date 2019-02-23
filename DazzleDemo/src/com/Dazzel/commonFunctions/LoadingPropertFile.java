package com.Dazzel.commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadingPropertFile {

	public Properties  getDatafromPropertefile() throws IOException {
		//creating properties file object
		Properties prop = new Properties();
		//reading properties file by using properties location
		FileInputStream fi = new FileInputStream("C:\\Users\\lokeshgx\\Documents\\DazzleProject\\DazzleDemo\\resource\\config.properties");
		//loading properties file
		prop.load(fi);	
		System.out.println(prop.getProperty("UserName"));
		return prop;
	}
	
	/*public static void main(String[] orgs) throws IOException {
		LoadingPropertFile obj = new LoadingPropertFile();
		obj.getDatafromPropertefile();
	}*/
}
