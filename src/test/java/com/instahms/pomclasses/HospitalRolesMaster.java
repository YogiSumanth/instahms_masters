package com.instahms.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HospitalRolesMaster {
	@FindBy(linkText = "Hospital Admin Masters")
	private WebElement hospAdminLink;
	
	@FindBy(linkText = "Hospital Roles Master")
	private WebElement HospRolesMaster;
	
	@FindBy(id = "toolbarAction_defaultEdit")
	private WebElement ViewAndEditButton;
	
	@FindBy(linkText="Cosmetology")
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
	
	public HospitalRolesMaster (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void ClickHospAdminMasters() {
		hospAdminLink.click();
	}
	public void ClickHospRolesMaster() {
		HospRolesMaster.click();
	}
	public void ClickViewOrEdit() {
		ViewAndEditButton.click();
	}
}
