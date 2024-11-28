package com.qa.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class BuzzPage extends BaseClass{
	public BuzzPage() {
		PageFactory.initElements(driver,this);
	}
   
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a/span") WebElement Buzz;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/textarea")WebElement Content;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/div/button")WebElement Post;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[2]")WebElement MostLikedPosts;
    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[3]")WebElement MostCommented;
    
    public void buz(String un) {
    	Buzz.click();
    	Content.sendKeys(un);
    	Post.click();
    }
    
    public void mostlik() {
    	MostLikedPosts.click();
    }
    public void mostcomment() {
    	MostCommented.click();
    }

}
