package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class PunchInOutPage extends BaseClass{
	public PunchInOutPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")WebElement time;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")WebElement attendance;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]")WebElement punch;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")WebElement in;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")WebElement out;
	
	public void pin() {
		time.click();
		attendance.click();
		punch.click();
		in.click();
	}
	public void pout() {
		time.click();
		attendance.click();
		punch.click();
		out.click();
		
	}
	

}
