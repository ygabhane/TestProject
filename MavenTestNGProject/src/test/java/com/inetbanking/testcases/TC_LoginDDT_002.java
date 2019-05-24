package com.inetbanking.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.utilities.XLUtils;


public class TC_LoginDDT_002 extends BClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		Logger.info("USer name is provided");
		lp.setPassword(pwd);
		Logger.info("PWD  is provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if (isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Logger.warn("Login Failed");
		}
		else
		{
			Assert.assertTrue(true);
			Logger.info("Test Pass");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defind method to check alert present or not 
	{
		try {
		driver.switchTo().alert();
		return true;
		   }
		catch (NoAlertPresentException e)
		{
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	
	String[] []getData() throws IOException
	{
		String path=System.getProperty("user.dir)+/src/test/java/com/inetbanking/testdata/LoginData.xlsx");
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String Logindata[][]=new String[rownum][colcount];
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; i++)
			{
				Logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return Logindata;
		
	}

}
