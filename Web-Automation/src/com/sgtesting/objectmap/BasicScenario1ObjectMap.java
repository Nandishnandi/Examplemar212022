package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario1ObjectMap {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		deleteuser();
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
	private static void createuser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserlink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("user");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("demouser@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusername")).sendKeys("admin123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("admin123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("admin123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdeletebtn")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
