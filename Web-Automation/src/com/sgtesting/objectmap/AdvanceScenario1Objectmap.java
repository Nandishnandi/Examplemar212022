package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1Objectmap {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();createuser2(); createuser3(); logout();
		loginuser1();logout();
		loginuser2();logout();
		loginuser3();logout();
		login();
		modifyuser1();modifyuser2(); modifyuser3();logout();
		loginuser11();logout();
		loginuser22();logout();
		loginuser33();logout();
		login();
		deleteuser1(); deleteuser2(); deleteuser3();
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
	
	private static void createuser1()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserlink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusername")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserlink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("demouser2@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusername")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createuser3()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserlink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("demouser3@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusername")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser1");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("DemoUser1");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			oBrowser.findElement(objectmap.getLocator("clickonwelcomescreenbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser2");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("DemoUser2");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			oBrowser.findElement(objectmap.getLocator("clickonwelcomescreenbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser3");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("DemoUser3");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			oBrowser.findElement(objectmap.getLocator("clickonwelcomescreenbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser1()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonsavechangesbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser2()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo2")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonsavechangesbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser3()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonsavechangesbtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser1");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser1");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser33()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("demouser3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser1()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdeletebtn")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void deleteuser2()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdeletebtn")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void deleteuser3()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdemo1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonuserdeletebtn")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
}
