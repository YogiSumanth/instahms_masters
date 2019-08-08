package com.instahms.generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements IAutoConstant{
	public static WebDriver driver;
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void OpenApp(){
		driver = new ChromeDriver();
		String url = Library.getProperty(CONFIG_PATH,"URL");
		driver.get(url);
		String ITO = Library.getProperty(CONFIG_PATH,"ImplicitTimeOut");
		int timeOut = Integer.parseInt(ITO);
		driver.manage().timeouts().implicitlyWait(timeOut,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(){
		driver.close();
	}
	public void takeScreenshot(String testname){
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":", "_");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/ubuntu/workspace_nmc/instahms_masters/screenshots"+currentdate+"\\"+testname+"_screenshot.png");
		try {
		FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
}

