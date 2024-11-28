package com.qa.orangehrm.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.ResetPasswordPage;
import com.qa.orangehrm.utils.Utils;


public class ResetPassword extends BaseClass{
	WebDriver driver;
	ResetPasswordPage password;
	
	public ResetPassword() throws IOException {
		super();
	}
	@BeforeClass
	public void setup(){
	    initialization();
	   password=new ResetPasswordPage();
	}
	
	@Test
	public void pass() throws IOException {
		password.reset();
		Utils.takeScreenshot("Reset.png");
		
	}

}
