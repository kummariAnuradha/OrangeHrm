package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.LoginLogoutPage;
import com.qa.orangehrm.pages.VacancyPage;
import com.qa.orangehrm.utils.Utils;

public class Vacancy extends BaseClass {
	WebDriver driver;
	VacancyPage vp;
	LoginLogoutPage lp;
	
	public Vacancy() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
	   lp=new LoginLogoutPage();
	   lp.login(props.getProperty("username"),props.getProperty("password"));
	   vp=new VacancyPage();
	}

	
	@Test(priority=1)
	public void vaca() throws InterruptedException, IOException {
		vp.vacancy();
		vp.jobs("Automation", "Orange Test");
		Utils.takeScreenshot("Vacancy.png");
	}

}