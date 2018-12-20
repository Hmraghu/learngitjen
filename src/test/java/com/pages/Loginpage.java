package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small' and @type='submit' and @value='Login']")
	private WebElement loginbutton;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setpassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clicklogin()
	{
		loginbutton.click();
	}
}
