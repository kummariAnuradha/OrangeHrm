package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.orangehrm.base.BaseClass;

public class ResetPasswordPage extends BaseClass{
	public ResetPasswordPage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p") WebElement forgot;
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input")WebElement Enteruser;
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")WebElement Reset;
	 
	 public void reset() {
		 forgot.click();
		 Enteruser.sendKeys("Anuradha");
		 Reset.click();	 
	 }	 

}
