package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
	
	static WebDriver driver;
public static void main(String[]args)throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/DHANVI/eclipse-workspace/mavenPracticePOM/Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	
	takeScreenshot("WordPress_Home");
	driver.quit();
}

//Write one method to take 

public static void takeScreenshot(String fileName) throws IOException//on the basis of file name screenshot will be generated
{
	//Take screenshot and store it as a file format
	//TakeScreenshot is a interface available in selenium
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Copy the screenshot to desired location using copyfile method
	FileUtils.copyFile(file, new File("C:/Users/DHANVI/eclipse-workspace/mavenPracticePOM/"
			+ "src/test/java/ScreenShots/"+fileName+".jpg"));
	
}
}
