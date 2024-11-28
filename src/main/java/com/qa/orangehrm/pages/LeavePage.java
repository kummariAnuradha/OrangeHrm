package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class LeavePage extends BaseClass {
	public LeavePage() {
		if (driver == null) {
            initialization();
        }
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[normalize-space()='Leave']")
	WebElement leave;
	@FindBy(xpath="//a[normalize-space()='Apply']")
	WebElement apply;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement sel;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement from;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement to;
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement appbtn;
	public void app(String str1,String str2) {
		leave.click();
		apply.click();
		sel.click();
		from.sendKeys(str1);
		to.sendKeys(str2);
		appbtn.click();
	
	}

}