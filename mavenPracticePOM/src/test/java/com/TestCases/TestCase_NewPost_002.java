package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.PageObject.NewPost;

public class TestCase_NewPost_002 {
	@Test
	public void TcPost()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/DHANVI/eclipse-workspace/mavenPracticePOM/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		LoginPage objlogin=new LoginPage(driver);
		objlogin.LoginPagedetails("admin", "demo123");
		NewPost objpost=new NewPost(driver);
		objpost.newPostPage("Yogesh Gabhane");
		/*post.newPostPage();
		post.newPostPage("Yogesh Gabhane");
		post.newPostPage();*/
		driver.quit();
	}

}
