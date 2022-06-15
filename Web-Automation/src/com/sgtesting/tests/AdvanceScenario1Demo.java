package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1Demo {
	public static WebDriver obrowser=null; 

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		Login();
		minimizeFlyOutWindow();
		createuser1(); createuser2(); createuser3(); logout1();
		Loginuser1();  logoutuser1();
		Loginuser2();  logoutuser2();
		Loginuser3();  logoutuser3();
		Login();
		modifyuser1();  modifyuser2();  modifyuser3(); logout1();
		Loginuser11();  logoutuser11();
		Loginuser22();  logoutuser22();
		Loginuser33();  logoutuser33();
		Login();
		Deleteuser1(); Deleteuser2(); Deleteuser3(); logout1();
		closeapplication();

	}
	private static void launchbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate() {
		try {
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
	}
	private static void Login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void createuser2() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser2@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void createuser3() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser3@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void logout1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser1() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser2() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void modifyuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void modifyuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser11() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser11() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser22() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser22() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser33() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logoutuser33() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user2, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user3, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private static void closeapplication() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
