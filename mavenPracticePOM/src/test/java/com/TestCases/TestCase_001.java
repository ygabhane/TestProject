package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

public class TestCase_001 {
	@Test
	public void Tclogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/DHANVI/eclipse-workspace/mavenPracticePOM/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		LoginPage objlogin=new LoginPage(driver);
		objlogin.LoginPagedetails("admin", "demo123");
		
		
		/*objlogin.EnterUname("admin");
		objlogin.EnterPwd("demo123");
		objlogin.SubmitButton();*/
		driver.quit();
	}

}
