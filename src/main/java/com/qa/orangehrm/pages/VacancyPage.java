package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class VacancyPage extends BaseClass {
	public VacancyPage() {
		if (driver == null) {
        initialization();
        }
	    PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	WebElement recruitment;
	
	@FindBy(linkText="Vacancies")
	WebElement vacancy;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement add;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
	WebElement vacname;
	
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement job;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement hm;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	public void vacancy() {
		recruitment.click();
		vacancy.click();
		add.click();
	}
	public void jobs(String str,String hire) {
		vacname.click();
		vacname.sendKeys(str);
		job.click();;
		hm.sendKeys(hire);
		save.click();
		
	}
	
	
}
