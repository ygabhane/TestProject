package com.inetbanking.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BClass  {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String url=readconfig.getApplicationURL();
	public String UserName=readconfig.getUserName();
	public String Password=readconfig.getpassword();
	public static WebDriver driver;
	public static  Logger Logger;
	
	
	@Parameters("browser")
	
	@BeforeClass
	public void Setup(String br)
	{
		//driver.manage().window().maximize();
		
		
		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxPath());
			driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", readconfig.getiePath());
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();

	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomstring()
	{
	String generatedString=	RandomStringUtils.randomAlphabetic(8);
	return (generatedString);
	}
	public String randomNumber()
	{
	String generatedNumber=	RandomStringUtils.randomNumeric(4);
	return (generatedNumber);
	}
	
	

}
