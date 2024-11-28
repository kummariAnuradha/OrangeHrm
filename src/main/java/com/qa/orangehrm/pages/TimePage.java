package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class TimePage extends BaseClass {
	public TimePage() {
		if (driver == null) {
        initialization();
        }
	    PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	WebElement time;
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item']")
	WebElement timesheets;
	@FindBy(xpath="//a[normalize-space()='My Timesheets']")
	WebElement mysheet;
	@FindBy(xpath="//button[normalize-space()='Edit']")
	WebElement edit;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement project;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement activity;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	public void tas(String str) {
		time.click();
		timesheets.click();
		mysheet.click();
		edit.click();
		project.sendKeys(str);
		activity.click();
		save.click();
	}
 
}