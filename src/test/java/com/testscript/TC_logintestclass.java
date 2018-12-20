package com.testscript;

import org.testng.annotations.Test;
import com.generic.Basetest;
import com.pages.Loginpage;

public class TC_logintestclass extends Basetest
{
	

	@Test
	public void logintest() throws InterruptedException
	{
		driver.get(baseurl);
		logger.info("url is open");
		Loginpage login=new Loginpage(driver);
		Thread.sleep(10000);
		login.setusername(username);
		logger.info("enter username");
		login.setpassword(password);
		logger.info("enter password");
		login.clicklogin();
		logger.info("click on submit");
	}
}
