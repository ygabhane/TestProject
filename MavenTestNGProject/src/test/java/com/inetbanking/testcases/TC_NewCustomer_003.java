package com.inetbanking.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import com.inetbanking.pageobjects.AddCustomer;
import com.inetbanking.pageobjects.LoginPage;

public class TC_NewCustomer_003 extends BClass {
	
	@Test
	public void addnewcustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(UserName);
		lp.setPassword(Password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		Logger.info("Login Sucessfuly");
		
		AddCustomer addcust=new AddCustomer(driver);
		addcust.custLink();
		addcust.custName("Yogesh Gabhane");
		addcust.custDob("16", "8", "1989");
		Thread.sleep(3000);
		addcust.address("Deshpande Sankul");
		Thread.sleep(2000);
		addcust.custCity("Pune");
		addcust.cusState("Maharastra");
		addcust.custpincode("411061");
		addcust.CustTelp("9403089487");
		String email=randomstring()+"@gmail.com";
		addcust.custEmail(email);
		addcust.custpwd("78745");
		addcust.custsubmit();
		
		Thread.sleep(3000);
	boolean b1=	driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(b1==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//captureScreen(driver, "TC_NewCustomer_003");
			Assert.assertTrue(false);
		}
	}
	
	
}
