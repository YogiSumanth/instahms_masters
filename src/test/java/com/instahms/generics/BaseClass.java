package com.instahms.generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.instahms.pomclasses.HomePage;
import com.instahms.pomclasses.LoginPage;

public class BaseClass implements IAutoConstant{
	public static WebDriver driver;
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void OpenAppAndLogin() throws IOException, InterruptedException{
		driver = new ChromeDriver();
		String url = Library.getProperty(CONFIG_PATH,"URL");
		driver.get(url);
		String ITO = Library.getProperty(CONFIG_PATH,"ImplicitTimeOut");
		int timeOut = Integer.parseInt(ITO);
		driver.manage().timeouts().implicitlyWait(timeOut,TimeUnit.SECONDS);
		
		LoginPage l = new LoginPage(driver);
		driver.findElement(By.id("hospital")).clear();
		
		System.out.println("Row index : "+Library.getRowCount(EXCEL_PATH, "Sheet1"));
		
		String hsp = Library.getCellValue(EXCEL_PATH,"Sheet1",1,0);
		System.out.println("value 1: "+hsp);
		l.setHospital(hsp);
		//Thread.sleep(5000);
		String un = Library.getCellValue(EXCEL_PATH,"Sheet1",1,1);
		System.out.println("value 2: "+un);

		l.setUsername(un);
		//Thread.sleep(5000);
		String pwd = Library.getCellValue(EXCEL_PATH,"Sheet1",1,2);
		System.out.println("value 3: "+pwd);
		
		l.setPassword(pwd);
		//Thread.sleep(5000);
		l.clickLogin();
		//Thread.sleep(2000);
		
		l.remindMeLater();
		//Thread.sleep(3000);
		
		HomePage homePage = new HomePage(driver);
		
		homePage.selectCentre();
		//Thread.sleep(4000);
		Select sc = new Select(homePage.getHospDropDownList());
		sc.selectByVisibleText(homePage.CentreName);
		//Thread.sleep(2000);
		
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
		
	    // function to generate a random string of length n 
	    static String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "KLOHJSIKSS"
	                                    + "56789"
	                                    + "hskkalss"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	 public String getRandomValue(){
		 return BaseClass.getAlphaNumericString(7);
	 }
}


