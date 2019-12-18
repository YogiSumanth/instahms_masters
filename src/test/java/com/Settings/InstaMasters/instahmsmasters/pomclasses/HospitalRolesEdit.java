package com.Settings.InstaMasters.instahmsmasters.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HospitalRolesEdit {
	
	@FindBy(xpath = "//span[text()='Hospital Admin Masters']")
	private WebElement hospAdminLink;

	@FindBy(linkText = "Hospital Roles Master")
	private WebElement HospRolesMaster;
	
	@FindBy(xpath = "//div[text() = 'View/Edit']")
	private WebElement ViewAndEditButton;
	
	@FindBy(xpath = "//*[@id='toolbarRow0']/td[3]/label")
	private WebElement CosmetologyLink;
	
	@FindBy(id = "hosp_role_name")
	private WebElement HospitalRoleName;
	
	@FindBy(id = "status")
	private WebElement RoleStatus;
	
	@FindBy(linkText = "Nurse")
	private WebElement NurseLink;
	
	@FindBy(linkText = "Occupational Therapist")
	private WebElement OcTherapistLink;
	
	@FindBy(linkText = "Pharmacist")
	private WebElement PharmacistLink;

	@FindBy(linkText = "Physiotherapist")
	private WebElement PhysioLink;
	
	@FindBy(linkText = "Radiology Technician")	
	private WebElement RadTechLink;
	
	@FindBy(linkText = "Respiratory Therapist")
	private WebElement RespTherapistLink;
	
	@FindBy(linkText = "Speech Therapist")
	private WebElement SpeechTherapistLink; 
	
	@FindBy(id = "hosp_role_name")
	private WebElement hospRoleName;
	
	@FindBy(id = "status")
	private WebElement statusDropDown;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	
	
	public HospitalRolesEdit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickHospAdmin(){
		hospAdminLink.click();
	}
	public void ClickHospRolesMaster() {
		HospRolesMaster.click();
	}
	public void ClickCosmetology(){
		CosmetologyLink.click();
		}
	public void ClickViewOrEdit() {
		ViewAndEditButton.click();
		}
	public void EditRoleName(){
		HospitalRoleName.sendKeys("Edit");
	}
	public void EditRoleStatus(){
		Select ern = new Select(RoleStatus);
		ern.selectByValue("I");
	}
	public void Save(){
			saveButton.submit();
	}
}
