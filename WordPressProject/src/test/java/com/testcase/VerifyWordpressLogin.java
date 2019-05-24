package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class VerifyWordpressLogin {
	
	@Test
	public void verifyValidLogin()
	{
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/DHANVI/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		LoginPage login=new LoginPage(driver);
		login.typeUname();
		login.typePwd();
		login.clickButton();
		//driver.quit();
	}

}
