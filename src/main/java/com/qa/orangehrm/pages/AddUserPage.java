package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.orangehrm.base.BaseClass;

public class AddUserPage extends BaseClass{
	public AddUserPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") WebElement Admin;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button") WebElement Add;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")WebElement select;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")WebElement adn;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")WebElement empname;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")WebElement status;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")WebElement Username;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")WebElement pass;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")WebElement Confirm;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")WebElement save;
	
	public void add(String en,String un,String pd) {
		Admin.click();
		Add.click();
		select.click();
		empname.sendKeys(en);
		status.click();
		Username.sendKeys(un);
		pass.sendKeys(pd);
		Confirm.sendKeys(pd);
		save.click();
			
	}
}
