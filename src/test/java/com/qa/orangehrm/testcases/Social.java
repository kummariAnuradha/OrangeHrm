package com.qa.orangehrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseClass;
import com.qa.orangehrm.pages.SocialPage;
import com.qa.orangehrm.utils.Utils;

public class Social extends BaseClass {
	WebDriver driver;
	SocialPage sp;
	
	public Social() throws IOException {
		super();
	}
	@BeforeClass
	public void setup() {
		initialization();
		sp=new SocialPage();
	}
	@Test
	public void mediaTest() throws IOException, InterruptedException {
		sp.LinkedIn();
		Utils.takeScreenshot("linkedin.png");
		sp.Facebook();
		Utils.takeScreenshot("facebook.png");
		sp.Twitter();
		Utils.takeScreenshot("twitter.png");
		sp.Youtube();
		Utils.takeScreenshot("youtube.png");
		
	}
}