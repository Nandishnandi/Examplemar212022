package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario7Demo {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		deletecustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
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
			oPage.getLogout().click();
			Thread.sleep(2000);
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
	private static void createcustomer()
	{
		try
		{
			oPage.gettaskfield().click();
			Thread.sleep(1000);
			oPage.getaddnewtask().click();
			Thread.sleep(1000);
			oPage.getaddcustomer().click();
			Thread.sleep(1000);
			oPage.getcustomernamefield().sendKeys("Google");
			Thread.sleep(1000);
			oPage.getcreatecustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			oPage.getsettingbutton().click();
			Thread.sleep(1000);
			oPage.getactionbutton().click();
			Thread.sleep(1000);
			oPage.getdeletebutton().click();
			Thread.sleep(1000);
			oPage.getdeletepermanently().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try {
			oPage.getaddnewtask().click();
			Thread.sleep(1000);
			oPage.getprojectclick().click();
			Thread.sleep(1000);
			oPage.getprojectnamefield().sendKeys("Project1");
			Thread.sleep(1000);
			oPage.getcreateprojectclick().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try {
			oPage.getprojectsettingbuttonclick().click();
			Thread.sleep(1000);
			oPage.getprojectactionbuttonclick().click();
			Thread.sleep(1000);
			oPage.getprojectdeletebuttonclick().click();
			Thread.sleep(1000);
			oPage.getprojectdeletepermanentlybuttonclick().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createtask()
	{
		try {
			oPage.getaddnewtaskbutton().click();
			Thread.sleep(1000);
			oPage.getcreatenewtaskbutton().click();
			Thread.sleep(1000);
			oPage.getentertaskname().click();
			Thread.sleep(1000);
			oPage.getentertaskname().sendKeys("TASK1");
			Thread.sleep(1000);
			oPage.getcreatetaskbuttonclick().click();
			Thread.sleep(2000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletetask()
	{
		try {
			oPage.getclickontask1().click();
			Thread.sleep(1000);
			oPage.getclickonactionbutton().click();
			Thread.sleep(1000);
			oPage.getclickondeletebutton().click();
			Thread.sleep(1000);
			oPage.getclickondeletepermanentlybutton().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
