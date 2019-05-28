package com.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {
	
	public WebDriver driver;
	public DashBoard(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By users=By.xpath("//div[@class='wp-menu-name' and text()='Users']");
	By addnewUsers=By.xpath("//a[@class='page-title-action' and text()='Add New']");
	By nusername=By.id("user_login");
	By nemail=By.id("email");
	By nFname=By.id("first_name");
	By nLname=By.id("last_name");
	By nWebsite=By.xpath("//input[contains(@name,'url')]");
	By nshowpwd= By.xpath("//button[contains(@type,'button') and contains(@class,'button wp-generate-pw hide-if-no-js')]");
	//By nenterPwd=By.id("pass1-text");
	By nenterPwd=By.cssSelector("input.regular-text strong[name=pass1-text]");
	By nrole=By.id("role");
	By naddNewBtn=By.id("createusersub");
	
	By nEdituser=By.xpath("//input[@name='users[]']");
	By nClickEditUser=By.xpath(" //span[@class='edit' ] //a[contains(text(),'Edit')]");
	
	
	public void ausers()
	{
		driver.findElement(users).click();
		driver.findElement(addnewUsers).click();
	}
	public void nUserDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(nusername).sendKeys("kgabhane");
		driver.findElement(nemail).sendKeys("yogesgablhane45@gmail.com");
		driver.findElement(nFname).sendKeys("Nami");
		driver.findElement(nLname).sendKeys("Gabhane");
		driver.findElement(nWebsite).sendKeys("WWW.yolgr445gshs.com");
		driver.findElement(nshowpwd).click();
	//	driver.findElement(nenterPwd).click();
      //  driver.findElement(By.name("pass1-text")).sendKeys("Yogurockss454 ");
		
		
		driver.findElement(nenterPwd).sendKeys("Yogurood@147");
		driver.findElement(nrole).click();
		driver.findElement(naddNewBtn).click();
		
	}
	/*public void Editdetails()
	{
		WebDriverWait wobj3=new WebDriverWait(driver, 20);
		ArrayList<WebElement> element=(ArrayList<WebElement>) driver.findElements(nEdituser); 
		int size=element.size();
		System.out.println("List of element on page="+size);
		
	
		String checkubox="user_2";
		for(int i=0; i<element.size(); i++)
		{
			if(element.get(i).getAttribute("for").equalsIgnoreCase(checkubox))
			{
				element.get(i).click();
			}
		}
		//driver.findElement(nClickEditUser).click();
	}*/
	
	

}
