package com.qa.orangehrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class SocialPage extends BaseClass {
	public SocialPage() {
		if (driver == null) {
            initialization();
        }
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	WebElement linkedIn;
	@FindBy(xpath="//a[@href='https://www.facebook.com/OrangeHRM/']")
	WebElement facebook;
	@FindBy(xpath="//a[@href='https://twitter.com/orangehrm?lang=en']")
	WebElement twitter;
	@FindBy(xpath="//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
	WebElement youtube;

	public void LinkedIn() {
		linkedIn.click();
		System.out.println("This is linkedIn page.");
	}
	public void Facebook() {
		facebook.click();
		System.out.println("This is facebook page.");
	}
	public void Twitter() {
		twitter.click();
		System.out.println("This is twitter page.");
	}
	public void Youtube() {
		youtube.click();
		System.out.println("This is youtube chanel.");
		
	}	
}