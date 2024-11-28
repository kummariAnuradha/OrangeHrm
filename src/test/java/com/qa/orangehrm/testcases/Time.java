package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.pages.TimePage;
import com.qa.orangehrm.utils.Utils;


public class Time extends BaseClass{
	WebDriver driver;
	TimePage tp;
	LoginLogoutPage lp;

	public Time() throws IOException {
		super();
	}
	@BeforeClass
	public void setup() {
		initialization();
	   lp=new LoginLogoutPage();
	   lp.login(props.getProperty("username"),props.getProperty("password"));
	   tp=new TimePage();
	}
	
	@Test
	public void t() throws IOException {
		tp.tas("Automation");
		Utils.takeScreenshot("Timesheet.png");
		
	}

}