package com.instahms.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.instahms.generics.BaseClass;

public class HomePage extends BaseClass{
	
	    public String CentreName = "NMC Royal";
	
		@FindBy(name = "modifiedCenterId")
		private WebElement hospDropDownList;
		
		public HomePage(WebDriver driver){
			PageFactory.initElements(driver,this);
		}
		public void selectCentre(){
			getHospDropDownList().click();
		}
		public WebElement getHospDropDownList() {
			return hospDropDownList;
		}
		public void setHospDropDownList(WebElement hospDropDownList) {
			this.hospDropDownList = hospDropDownList;
		}
		
		
}
