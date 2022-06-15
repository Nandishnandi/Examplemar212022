package com.sgtesting.objectmap;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario4Objectmap {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			filename="D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\objectmap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickontasksbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonaddnewbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomerbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("entercustomername")).sendKeys("Customer");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickcreatecustomerbtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncustomersettingbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomeractionbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomerdeletebtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomerdeletepermanentlybtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void modifycustomer()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncustomersettingbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomernameblock")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clearcustomernameblock")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clearcustomernameblock")).sendKeys("New Customer");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickemptyspace")).click();
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	
}
