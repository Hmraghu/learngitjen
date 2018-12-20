package com.generic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	
//	PropertFile prfile= new PropertFile();
	public static WebDriver driver;
	public String baseurl="https://www.crmpro.com/index.html";
	public String username="rajmohan";
	public String password="Raj@123";
	public static Logger logger;
	
	
	@BeforeSuite
	public void setup()
	{
        WebDriverManager.chromedriver().setup();
        
	}
	
	@BeforeMethod
	public void openapp()
	{ 
		logger=Logger.getLogger("Learnjen");
		PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
