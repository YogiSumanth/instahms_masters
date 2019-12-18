package com.Settings.InstaMasters.instahmsmasters.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.instahms.generics.BaseClass;

public class HospitalRolesMaster{
	
	@FindBy(linkText = "Add New Hospital Role")
	private WebElement AddNewHospRole;

	@FindBy(xpath = "//span[text()='Hospital Admin Masters']")
	private WebElement hospAdminLink;

	@FindBy(linkText = "Hospital Roles Master")
	private WebElement HospRolesMaster;
	
	@FindBy(id = "hosp_role_name")
		private WebElement hospRoleName;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	
	public HospitalRolesMaster (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void ClickHospAdmin(){
		hospAdminLink.click();
	}
	public void ClickHospRolesMaster() {
		HospRolesMaster.click();
	}
	public void ClickAddNewRole(){
		AddNewHospRole.click();
	}
	public void EnterText(){
		hospRoleName.sendKeys(new BaseClass().getNames());
		}
	public void Save(){
		saveButton.submit();
	}
}
