package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BClass{
	@Test
	public void loginTest() throws InterruptedException
	{
		
		//driver.get(url);
		//System.out.println("Url is:"+url);
		

		Logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		//Thread.sleep(5000);
		lp.setUserName(UserName);
		Logger.info("Entered UserName");
		lp.setPassword(Password);
		Logger.info("Enter Password");
		lp.clickSubmit();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		
	}
	
	
}
