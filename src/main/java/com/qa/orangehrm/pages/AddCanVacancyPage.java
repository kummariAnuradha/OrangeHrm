package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class AddCanVacancyPage extends BaseClass{
	public AddCanVacancyPage() {
		if (driver == null) {
        initialization();
        }
	    PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	WebElement recruitment;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")WebElement add;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")WebElement first;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")WebElement last;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")WebElement email;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")WebElement save;
	
    public void Can(String fn,String ln,String en) {
    	recruitment.click();
    	add.click();
    	first.sendKeys(fn);
    	last.sendKeys(ln);
    	email.sendKeys(en);
    	save.click();
    }

}
