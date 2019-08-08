package com.instahmsmasters.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.testng.annotations.Test;

import com.instahms.generics.BaseClass;
import com.instahms.generics.Library;
import com.instahms.pomclasses.*;

public class TC_001_Login extends BaseClass{
	@Test
	
	public void LoginPage(){
		LoginPage l = new LoginPage(driver);
		driver.findElement(By.id("hospital")).clear();
		
		String hsp = Library.getCellValue(EXCEL_PATH,"DataSheet",1,1);
		l.setHospital(hsp);
		String un = Library.getCellValue(EXCEL_PATH, "DataSheet", 1,2);
		l.setUsername(un);
		String pwd = Library.getCellValue(EXCEL_PATH,"DataSheet",1,2);
		l.setPassword(pwd);
		l.clickLogin();
	}
}