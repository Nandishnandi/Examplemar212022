package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancescenario2 {
	public static WebDriver Browser=null;
	public static Actitimepage2 Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1(); logout();
		loginuser1(); createuser2(); logout();
		loginuser2(); createuser3(); logout();
		loginuser3(); logout();
		loginuser22(); modifyuser3(); logout();
		loginuser33(); logout();
		loginuser11(); modifyuser2(); logout();
		loginuser222(); logout();
		login(); modifyuser1(); logout();
		loginuser111(); Deleteuser3(); Deleteuser2(); logout();
		login(); Deleteuser1(); logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			Browser=new ChromeDriver();
			Page=new Actitimepage2(Browser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			Browser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			Page.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		private static void minimizeFlyOutWindow()
		{
			try
			{
				Page.getFlyOutWindow().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	private static void createuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("demo");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user1");
			Thread.sleep(1000);
			Page.getemail().sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try
		{
			Page.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("demo");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user2");
			Thread.sleep(1000);
			Page.getemail().sendKeys("demouser2@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("demo");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user3");
			Thread.sleep(1000);
			Page.getemail().sendKeys("demouser3@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginuser3()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser3() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser33");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser33");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser33");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser2()  
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser22");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser22");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser222()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser22");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DemoUser11");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DemoUser11");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser111()
	{
		try
		{
			Page.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DemoUser11");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser3()
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser33click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser2()  
	{
		try {
			Page.getuser22click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser11click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void closeApplication()
	{
		try
		{
			Browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
