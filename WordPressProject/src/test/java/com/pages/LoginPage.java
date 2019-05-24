package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class will store all locators and methods of login page
public class LoginPage {
	
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath("//input[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	By users=By.xpath("//div[@class='wp-menu-name' and text()='Users']");
	//By addnewUsers=By.xpath("//a[@class='current' and text()='Add New']");
	By addnewUsers=By.xpath("//a[@class='page-title-action' and text()='Add New']");
	By nusername=By.id("user_login");
	By nemail=By.id("email");
	By nFname=By.id("first_name");
	By nLname=By.id("last_name");
	By nWebsite=By.xpath("//input[contains(@name,'url')]");
	By nshowpwd= By.xpath("//button[contains(@type,'button') and contains(@class,'button wp-generate-pw hide-if-no-js')]");
	By nenterPwd=By.id("pass1-text");
	By nrole=By.id("role");
	By naddNewBtn=By.id("createusersub");
	By nEdituser=By.id("user_2");
	By nClickEditUser=By.xpath(" //span[@class='edit' ] //a[contains(text(),'Edit')]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUname()
	{
		driver.findElement(username).sendKeys("admin");;
	}
	public void typePwd()
	{
		driver.findElement(password).sendKeys("demo123");;
	}
	public void clickButton()
	{
		driver.findElement(loginbutton).click();;
	}
}
