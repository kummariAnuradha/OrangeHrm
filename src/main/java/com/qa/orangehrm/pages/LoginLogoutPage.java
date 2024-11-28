package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class LoginLogoutPage extends BaseClass{
	public LoginLogoutPage() {
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement username;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement password;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement loginBtn;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p") WebElement user;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")WebElement logout;
    public void login(String un, String pass) {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginBtn.click();
    }
    public void logout() {
        user.click();
        logout.click();
    	
    }
    public void loginLower(String un, String pass) {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginBtn.click();
    }
}


