package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
	
	
	public WebDriver driver;
	public DashBoard(WebDriver driver)
	{
		this.driver=driver;
	}
	
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
	
	
	public void ausers()
	{
		driver.findElement(users).click();
		driver.findElement(addnewUsers).click();
	}
	public void nUserDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(nusername).sendKeys("Ygabhane");
		driver.findElement(nemail).sendKeys("gabhane.yogesh45@gmail.com");
		driver.findElement(nFname).sendKeys("Yogesh");
		driver.findElement(nLname).sendKeys("Gabhane");
		driver.findElement(nWebsite).sendKeys("WWW.yogeshgabhane.com");
		driver.findElement(nshowpwd).click();
		driver.findElement(nenterPwd).sendKeys("Yogurocks65");
		Thread.sleep(3000);
		driver.findElement(nrole).click();
		Thread.sleep(3000);
		driver.findElement(naddNewBtn).click();
		Thread.sleep(3000);
		driver.findElement(nEdituser).click();
		Thread.sleep(3000);
		driver.findElement(nClickEditUser).click();
	}
	
	

}
