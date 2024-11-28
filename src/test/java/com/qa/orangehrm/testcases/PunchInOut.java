package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.pages.PunchInOutPage;
import com.qa.orangehrm.utils.Utils;

public class PunchInOut extends BaseClass{
	WebDriver driver;
	LoginLogoutPage lp;
	PunchInOutPage p;
	
	public PunchInOut() throws IOException {
		super();
	}
	@BeforeClass
	public void setup(){
	    initialization();
	   lp=new LoginLogoutPage();
	   p=new PunchInOutPage();
	}

	@Test(priority=1)
	public void loginTest() throws IOException {
		lp.login(props.getProperty("username"),props.getProperty("password"));
		Utils.takeScreenshot("Login.png");
		
	}
	@Test(priority=2)
	public void time() throws IOException {
		p.pin();
		Utils.takeScreenshot("punchInOut.png");
		
	}
	@Test(priority=3)
	public void tout() throws IOException {
		p.pout();
		Utils.takeScreenshot("punch.png");
	}

}
