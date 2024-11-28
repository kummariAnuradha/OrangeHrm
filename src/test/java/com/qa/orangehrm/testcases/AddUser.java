package com.qa.orangehrm.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.AddUserPage;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;

public class AddUser extends BaseClass{
	WebDriver driver;
	LoginLogoutPage lp;
	AddUserPage addU;
	
	public AddUser() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	    lp=new LoginLogoutPage();
	    addU=new AddUserPage();
	}
	
	@Test(priority=1)
	public void loginfunc() {
		lp.login(props.getProperty("username"),props.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void addfunc() throws IOException, InterruptedException {
		addU.add("Test Selenium Automation","Anuradha","Anu@2124");
		Utils.takeScreenshot("Adduser.png");	
	}
}
