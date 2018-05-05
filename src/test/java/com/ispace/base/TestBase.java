package com.ispace.base;

import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	
	/*
	 * webdrive
	 * Properties
	 * Logs
	 * ExtendedReport
	 * DB
	 * Excel
	 * Mail
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static WebDriver driver;
	public static Properties config =new Properties();
	public static Properties Or =new Properties();
	public static  FileInputStream fis;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	
	
	 @BeforeSuite
	public void setup (){
		
		
		if (driver ==null){
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//Or.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			
			}
			
			if(config.getProperty("browser").equals("Firefox")){
				
				
				//System.setProperty("webdriver.gecko.driver","gecko.exe");
				driver=new FirefoxDriver();
				
		}else if(config.getProperty("browser").equals("chrome")){
					
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//executable//chromedriver.exe");
		}
			driver=new ChromeDriver();
		}
		
			
else if(config.getProperty("browser").equals("IE")){
					
					System.setProperty("webdriver.IE.driver",System.getProperty("user.dir")+"//src//test//resources//executable//IEDriverserver.exe");
				}
				driver=new InternetExplorerDriver(); 
				
 
		
	 
driver.get(config.getProperty("testsiteurl"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		
	
	}
	
	
	
	@AfterSuite
	public void teardown(){
		
		if (driver != null){
		driver.quit();
		}
		
	}
}



