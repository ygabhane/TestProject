package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.DashBoard;
import com.pages.LoginPage;

public class VerifyHomeAddNewUsers {
	@Test
	public void addNewUsers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/DHANVI/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		LoginPage login=new LoginPage(driver);
		
		login.typeUname();
		login.typePwd();
		login.clickButton();
		
		DashBoard dboard=new DashBoard(driver) ;
		dboard.ausers();
		dboard.nUserDetails();
	}

}
