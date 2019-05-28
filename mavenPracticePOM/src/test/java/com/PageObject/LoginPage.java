package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.name("log");
	By userpwd=By.xpath("//*[@type='password']");
	By clickbutton=By.id("wp-submit");
	
	public void LoginPagedetails(String uname, String pwd)
	{
		driver.findElement(username).sendKeys(uname);;
		driver.findElement(userpwd).sendKeys(pwd);
		driver.findElement(clickbutton).click();
	}
	
	
	
	
	
	/*public void EnterUname(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void EnterPwd(String pwd)
	{
		driver.findElement(userpwd).sendKeys(pwd);
	}
	public void SubmitButton()
	{
		driver.findElement(clickbutton).click();
	}*/

}
