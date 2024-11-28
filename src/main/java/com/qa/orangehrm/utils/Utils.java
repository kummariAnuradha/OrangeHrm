package com.qa.orangehrm.utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.BaseClass;

public class Utils extends BaseClass{
	public Utils() {
    	if (driver == null) {
            initialization();
        }
    	PageFactory.initElements(driver, this);
	}

    public static void takeScreenshot(String filename) throws IOException {
    	TakesScreenshot screenshot=(TakesScreenshot)driver;
    	File file=screenshot.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(file, new File("./screenshots/"+filename+""));
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
