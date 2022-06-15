package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepage2 {

	public Actitimepage2(WebDriver Browser)
	{
		PageFactory.initElements(Browser, this);
	}

	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//FlyOutwindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//user click
	@FindBy(xpath ="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement userclick;
	public WebElement getuserclick()
	{
		return userclick;
	}
	//adduser
	@FindBy(xpath ="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	//firstname
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_firstNameField\"]")
	private WebElement ffName;
	public WebElement getfirstName()
	{
		return ffName;
	}
	//lastname
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement lName;
	public WebElement getlastName()
	{
		return lName;
	}
	//email
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_emailField\"]")
	private WebElement mail;
	public WebElement getemail()
	{
		return mail;
	}
	//username
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement UserName;
	public WebElement getuserName()
	{
		return UserName;
	}
	//password
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_passwordField\"]")
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	//passwordcopy
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_passwordCopyField\"]")
	private WebElement passwordcopy;
	public WebElement getpasswordcopy()
	{
		return passwordcopy;
	}
	//create user
	@FindBy(xpath  = "//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement createuser;
	public WebElement getcreateuser()
	{
		return createuser;
	}
	//UserName Text Field

	private WebElement username1;
	public WebElement getUserName1()
	{
		return username1;
	}
	//Password Text Field
	private WebElement pwd1;
	public WebElement getPassword1()
	{
		return pwd1;
	}
	//Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Loginuser1;
	public WebElement getLoginuser1()
	{
		return Loginuser1;
	}
	//start exploring actitime
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement startexploringactitime;
	public WebElement getstartexploringactitime()
	{
		return startexploringactitime;
	}
	//Login button field
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement Login1;
	public WebElement getLogin1()
	{
		return Login1;
	}
	//user1click
	@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement user1click;
	public WebElement getuser1click()
	{
		return user1click;
	}
	//user2click
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement user2click;
	public WebElement getuser2click()
	{
		return user2click;
	}
	//user3click
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement user3click;
	public WebElement getuser3click()
	{
		return user3click;
	}
	//savechanges
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement savechanges;
	public WebElement getsavechanges()
	{
		return savechanges;
	}
	//deleteuser
	@FindBy(xpath = "//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deleteuser;
	public WebElement getdeleteuser()
	{
		return deleteuser;
	}
	//user1click
	@FindBy(xpath = "//span[text()='user1, demo']")
	private WebElement user11click;
	public WebElement getuser11click()
	{
		return user11click;
	}
	//user2click
	@FindBy(xpath = "//span[text()='user2, demo']")
	private WebElement user22click;
	public WebElement getuser22click()
	{
		return user22click;
	}
	//user3click
	@FindBy(xpath = "//span[text()='user3, demo']")
	private WebElement user33click;
	public WebElement getuser33click()
	{
		return user33click;
	}
}
