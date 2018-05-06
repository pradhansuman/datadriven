package com.ipsace.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testrepository {
	
	
	public static void main(String[] args) throws IOException{
		
		
		System.out.println(System.getProperty("user.dir"));
		Properties config =new Properties();
		Properties Or =new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Config.properties");
		
		fis =new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Or.properties");
		
		
		
		
		
		Or.load(fis);
		
		//.tests suyman
		
		
		System.out.println(config.getProperty("browser"));
		
		System.out.println(Or.getProperty("loginregistration"));
		
		
		
	}

}
