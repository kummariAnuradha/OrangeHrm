package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class LeaveRejectPage extends BaseClass{
	public LeaveRejectPage() {
		if (driver == null) {
        initialization();
        }
	    PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")WebElement Leave;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a")WebElement LList;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[9]/div/li/button/i")WebElement sel;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[9]/div/li/ul/li[4]/p")WebElement can;
    
	public void cancel() {
		Leave.click();
		LList.click();
		sel.click();
		can.click();
		
	}

}
