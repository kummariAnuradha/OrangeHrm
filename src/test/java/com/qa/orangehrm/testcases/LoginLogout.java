package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;

public class LoginLogout extends BaseClass {
	WebDriver driver;
	LoginLogoutPage lp;
	
	public LoginLogout() throws IOException {
		super();
	}
	@BeforeClass
	public void setup(){
	    initialization();
	   lp=new LoginLogoutPage();
	}

	@Test(priority=1)
	public void loginTest() throws IOException {
		lp.login(props.getProperty("username"),props.getProperty("password"));
		Utils.takeScreenshot("Login.png");
		
	}
	@Test(priority=2)
	public void logouttestcase() throws IOException {
		lp.logout();
		Utils.takeScreenshot("Logout.png");
		
	}
	@Test(priority=3)
	public void userlower() throws IOException {
		lp.login(props.getProperty("Usernamelower"),props.getProperty("password"));
		Utils.takeScreenshot("Login.png");	
	}

}

