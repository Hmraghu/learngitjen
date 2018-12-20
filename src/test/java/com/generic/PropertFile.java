package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertFile  {
	Properties pro;
	
	public  PropertFile() 
	{
		File src=new File ("./configuration/config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


  public String getappurl()
  {
	  String baseurl=pro.getProperty("baseurl");
	  return baseurl;
	  
  }
  
  public String getusername()
  {
	String username  =  pro.getProperty("username");
	  return username;
  }
  public String getpassword()
  {
	  String password=pro.getProperty("password");
	  return password;
	  
  }
}