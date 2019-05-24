package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	WebDriver driver;
	
	public AddCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement CustAddNewcustLink;
	
	@FindBy(xpath="//input[@onkeyup='validatecustomername();']")
	WebElement custName;
	@FindBy(xpath="//input[@onkeyup='validatedob();']")
	WebElement CustDOB;
	@FindBy(name="addr")
	WebElement custAddr;
	@FindBy(xpath="//input[@name='city']")
	WebElement CustCity;
	@FindBy(name="state")
	WebElement custState;
	@FindBy(name="pinno")
	WebElement custPin;
	@FindBy(name="telephoneno")
	WebElement CustTel;
	@FindBy(name="emailid")
	WebElement CustEmail;
	@FindBy(name="password")
	WebElement CustPwd;
	@FindBy(xpath="//input[@type='submit']")
	WebElement custSubmit;
	
	public void custLink()
	{
		CustAddNewcustLink.click();
	}
	
	public void custName(String cust) {
		custName.sendKeys(cust);
		}
	public void custDob(String mm, String dd, String yyyy)
	{
		CustDOB.sendKeys(mm);
		CustDOB.sendKeys(dd);
		CustDOB.sendKeys(yyyy);
	}
	public void address(String addr)
	{
		custAddr.sendKeys(addr);
	}
	public void custCity(String city)
	{
		CustCity.sendKeys(city);
	}
	public void cusState(String cstate)
	{
		custState.sendKeys(cstate);
	}
	public void custpincode(String cpin)
	{
		custPin.sendKeys(String.valueOf(cpin));
	}
	public void CustTelp(String ctel)
	{
		CustTel.sendKeys(String.valueOf(ctel));
	}
	public void custEmail(String cemail)
	{
		CustEmail.sendKeys(cemail);
	}
	public void custpwd(String cpwd)
	{
		CustPwd.sendKeys(cpwd);
	}
	public void custsubmit()
	{
		custSubmit.click();
	}

}
