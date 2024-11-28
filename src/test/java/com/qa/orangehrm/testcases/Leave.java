package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LeavePage;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;

public class Leave extends BaseClass {
	WebDriver driver;
    LeavePage le;
    LoginLogoutPage lp;
    public Leave() throws IOException {
    	super();
    }
    @BeforeClass
	public void setup(){
	    initialization();
	   lp=new LoginLogoutPage();
	   lp.login(props.getProperty("username"),props.getProperty("password"));
	   le=new LeavePage();
    }
    
   
    @Test(priority=1)
    public void leapp() throws InterruptedException, IOException {
    	le.app("11-07-2024", "11-07-2024");
    	Utils.takeScreenshot("Leave.png");
    	
    }
   

}
