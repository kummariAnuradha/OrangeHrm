package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.AddCanVacancyPage;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.utils.Utils;

public class AddCanVacancy extends BaseClass{
	WebDriver driver;
    LoginLogoutPage lp;
    AddCanVacancyPage ap;
	
	public AddCanVacancy() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
	   lp=new LoginLogoutPage();
	   lp.login(props.getProperty("username"),props.getProperty("password"));
	   ap=new AddCanVacancyPage();
	}
	
	@Test(priority=1)
	public void cand() throws InterruptedException, IOException {
		ap.Can("Anu", "Kummari", "anu@gmail.com");
		Utils.takeScreenshot("AddCandidate.png");
		
	}

}
