package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig(){
	
	File src=new File("./Configuration/Config.properties");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e)
	{
		System.out.println("Exception is"+e.getMessage());
	}
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String Uname=pro.getProperty("UserName");
		return Uname;
	}
	public String getpassword()
	{
		String pwd=pro.getProperty("Password");
		return pwd;
	}
	
	public String getChromePath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getfirefoxPath()
	{
		String firefox=pro.getProperty("Firefoxpath");
		return firefox;
	}
	public String getiePath()
	{
		String ie=pro.getProperty("iepath");
		return ie;
	}
	
}

