package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
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

	//Create user field
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement oCreateuser;
	public WebElement getcreateuser()
	{
		return oCreateuser;

	}

	//add user field
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAdduser;
	public WebElement getadduser()
	{
		return oAdduser;

	}

	//FirstName field
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}


	//LastName field
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}

	//Email field
	private WebElement userDataLightBox_emailField;
	public WebElement getemail()
	{
		return userDataLightBox_emailField;
	}

	//Login field
	private WebElement userDataLightBox_usernameField;
	public WebElement getloginusername()
	{
		return userDataLightBox_usernameField;
	}

	//Password field
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	//Retype Password field
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getpasswordcopy()
	{
		return userDataLightBox_passwordCopyField;
	}	

	//add user button field
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oAdduserbutton;
	public WebElement getadduserbutton()
	{
		return oAdduserbutton;

	}

	//demoUser field
	@FindBy(xpath="//span[text()='user, demo']")
	private WebElement oDemouser;
	public WebElement getdemouser()
	{
		return oDemouser;

	}	

	//Delete field
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelete()
	{
		return userDataLightBox_deleteBtn;
	}	

	//Rename  field
	private WebElement firstName;
	public WebElement getrename()
	{
		return firstName;
	}	

	//Clear UserName field
	@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
	private WebElement oClearusername;
	public WebElement getclearusername()
	{
		return oClearusername;

	}	
	//Enter Name field
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSavechanges;
	public WebElement getsavechanges()
	{
		return oSavechanges;

	}

	//demoName field
	@FindBy(xpath="//span[text()='user, name']")
	private WebElement oDemoname;
	public WebElement getdemoname()
	{
		return oDemoname;

	}	


	//Task field
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement otask;
	public WebElement gettaskfield()
	{
		return otask;

	}	

	//ADd New task field
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement oaddnewtask;
	public WebElement getaddnewtask()
	{
		return oaddnewtask;

	}	

	//ADd New task field
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement oaddcustomer;
	public WebElement getaddcustomer()
	{
		return oaddcustomer;

	}

	//Customer Name 	field
	private WebElement customerLightBox_nameField;
	public WebElement getcustomernamefield()
	{
		return customerLightBox_nameField;
	}	

	//create customer button  field
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement oCreatecustomer;
	public WebElement getcreatecustomer()
	{
		return oCreatecustomer;

	}

	//Setting Button field
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement osettingbutton;
	public WebElement getsettingbutton()
	{
		return osettingbutton;

	}	

	//Action Button field
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement oAction;
	public WebElement getactionbutton()
	{
		return oAction;

	}

	//Delete Button field
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement oDelete;
	public WebElement getdeletebutton()
	{
		return oDelete;

	}	

	//delete permanently  field
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement odeletepermanently;
	public WebElement getdeletepermanently()
	{
		return odeletepermanently;

	}

	//customer click  field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement ocustomerclick;
	public WebElement getcustomerclick()
	{
		return ocustomerclick;

	}	

	//rename customer click  field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement orenamecustomerclick;
	public WebElement getrenamecustomerclick()
	{
		return orenamecustomerclick;

	}	
	//Close Button field
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div")
	private WebElement oClosebutton;
	public WebElement getclosebutton()
	{
		return oClosebutton;

	}	

	//project click  field
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement oprojectclick;
	public WebElement getprojectclick()
	{
		return oprojectclick;

	}	

	//project Name 	field
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectnamefield()
	{
		return projectPopup_projectNameField;
	}	

	//Create project button field
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement ocreateprojectclick;
	public WebElement getcreateprojectclick()
	{
		return ocreateprojectclick;

	}	

	//project setting button field
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oprojectsettingbutton;
	public WebElement getprojectsettingbuttonclick()
	{
		return oprojectsettingbutton;

	}

	//Create project action button field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oprojectactionbuttonclick;
	public WebElement getprojectactionbuttonclick()
	{
		return oprojectactionbuttonclick;

	}		

	//Create project delete button field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement oprojectdeletebuttonclick;
	public WebElement getprojectdeletebuttonclick()
	{
		return oprojectdeletebuttonclick;
	}	

	//Create project delete permanently button field
	@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	private WebElement oprojectdeletepermanentlybuttonclick;
	public WebElement getprojectdeletepermanentlybuttonclick()
	{
		return oprojectdeletepermanentlybuttonclick;
	}	

	//Create project edit button field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement oprojecteditbuttonclick;
	public WebElement getprojecteditbuttonclick()
	{
		return oprojecteditbuttonclick;
	}	

	//Rename project name field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement orenameprojectname;
	public WebElement getprojectrename()
	{
		return orenameprojectname;
	}

	//Re enter project name field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement oreenterprojectname;
	public WebElement getreenterprojectrename()
	{
		return oreenterprojectname;
	}		

	//add new task field
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement oaddnewtaskbutton;
	public WebElement getaddnewtaskbutton()
	{
		return oaddnewtaskbutton;
	}	

	//create new task field
	@FindBy(xpath="//div[text()='Create new tasks']")
	private WebElement ocreatenewtaskbutton;
	public WebElement getcreatenewtaskbutton()
	{
		return ocreatenewtaskbutton;
	}		

	//enter new task name field
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement oentertaskname;
	public WebElement getentertaskname()
	{
		return oentertaskname;
	}		

	//create task button field
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement ocreatetaskbuttonclick;
	public WebElement getcreatetaskbuttonclick()
	{
		return ocreatetaskbuttonclick;
	}	

	//click on task1  field
	@FindBy(xpath="//div[text()='TASK1']")
	private WebElement oclickontask1;
	public WebElement getclickontask1()
	{
		return oclickontask1;
	}	

	//click on action  field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement oclickonactionbutton;
	public WebElement getclickonactionbutton()
	{
		return oclickonactionbutton;
	}	

	//click on delete  field
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement oclickondeletebutton;
	public WebElement getclickondeletebutton()
	{
		return oclickondeletebutton;
	}		

	//click on delete permanently  field
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement oclickondeletepermanentlybutton;
	public WebElement getclickondeletepermanentlybutton()
	{
		return oclickondeletepermanentlybutton;
	}		

}

