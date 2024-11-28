package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LeaveRejectPage;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;

public class LeaveReject extends BaseClass{
	WebDriver driver;
    LoginLogoutPage lp;
    LeaveRejectPage lr;;
	
	public LeaveReject() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
	   lp=new LoginLogoutPage();
	   lp.login(props.getProperty("username"),props.getProperty("password"));
	   lr=new LeaveRejectPage();
	}
	
	@Test
	public void reject() throws IOException {
		lr.cancel();
		Utils.takeScreenshot("LeaveReject.png");
	}
	

}
