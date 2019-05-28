package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPost {
	WebDriver driver;
	
	public NewPost(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By allPost=By.xpath("//*[@id=\"menu-posts\"]/a/div[3]");
	By addNew=By.linkText("Add New");
	By texther=By.xpath("//input[@name='post_title']");
	//By enterText=By.xpath("/html/body");
	By clickpulish=By.xpath("//input[@name='publish']");
	
	/*public void linkAllPost()
	{
		driver.findElement(allPost).click();
	}
	public void linkAddNew()
	{
		driver.findElement(addNew).click();;
	}*/
	public void newPostPage(String titlename)
	{
		driver.findElement(allPost).click();
		driver.findElement(addNew).click();
		driver.findElement(texther).sendKeys(titlename);
		driver.findElement(clickpulish).click();
		
	}
	/*public void publishpost()
	{
		driver.findElement(clickpulish).click();;
	}*/
}
