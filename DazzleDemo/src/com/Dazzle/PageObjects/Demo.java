package com.Dazzle.PageObjects;

import java.io.IOException;
import java.util.Properties;

import com.Dazzel.commonFunctions.LoadingPropertFile;

public class Demo {

	static LoadingPropertFile obj  = new LoadingPropertFile();
	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		System.out.println("Hellow Lokesh, How are you?");
		
		prop = obj.getDatafromPropertefile();
		System.out.println(prop.getProperty("Password"));
		
	}

}
