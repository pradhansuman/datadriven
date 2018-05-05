package com.ispace.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

import com.ispace.base.TestBase;

public class LoginTest  extends TestBase {
	

	
	@Test
	
	public void loginAsBankManager() throws InterruptedException{
		
		driver.findElement(By.xpath(Or.getProperty("loginregistration"))).click();
	 	Thread.sleep(2000);
	 	
	 	Assert.assertTrue(condition);
		
	}
	
}
