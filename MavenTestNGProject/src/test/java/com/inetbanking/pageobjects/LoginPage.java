package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement textUserName;
	@FindBy(name="password")
	WebElement textPassword;
	@FindBy(name="btnLogin")
	WebElement btnButton;
	
	@FindBy(xpath="//*[contains(text(),'Log out')]")
	WebElement lnkLogout;
	
	
	public void setUserName(String uname)
	{
		textUserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		textPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnButton.click();
		
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}
