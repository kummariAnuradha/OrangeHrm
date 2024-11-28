package com.qa.orangehrm.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.BuzzPage;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;


public class Buzz extends BaseClass {
	WebDriver driver;
	LoginLogoutPage lp;
	BuzzPage Bu;
	
	public Buzz() throws IOException {
		super();
	}
	@BeforeClass
	public void setup(){
	    initialization();
	    lp=new LoginLogoutPage();
	   Bu=new BuzzPage();
	}
	@Test(priority=1)
	public void loginTest() throws IOException {
		lp.login(props.getProperty("username"),props.getProperty("password"));
		Utils.takeScreenshot("Login.png");
		
	}
	
	@Test(priority=2)
	public void postcon() throws IOException {
		Bu.buz("I am Happy today");
		Utils.takeScreenshot("Post.png");
		
	}
	@Test(priority=3)
	public void mostliked() throws IOException {
		Bu.mostlik();
		Utils.takeScreenshot("mostliked.png");
	}
	
	@Test(priority=3)
	public void mostcom() throws IOException {
		Bu.mostcomment();
		Utils.takeScreenshot("mostcommented.png");
		
	}

}
