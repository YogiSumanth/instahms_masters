package com.Settings.InstaMasters.instahmsmasters.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.instahms.generics.BaseClass;

public class DepartmentMaster{
	@FindBy(xpath = "//span[text()='Hospital Admin Masters']")
	private WebElement hospAdminLink;
	
	@FindBy(linkText = "Departments")
	private WebElement deptLink;
	
	@FindBy(linkText = "Add New Department")
	private WebElement addNewDept;
	
	@FindBy(name = "dept_name")
	private WebElement nameField;
	
	@FindBy(name = "dept_type_id")
	private WebElement deptTypeDropDown;
	
	@FindBy(name = "allowed_gender")
	private WebElement genderDropDown;
	
	@FindBy(id = "cost_center_code")
	private WebElement costCenterCode;
	
	@FindBy(xpath="//input[@value='S']")
	private WebElement examOrganCategory;
	
	@FindBy(name = "clinical_information_form")
	private WebElement clinicalInfoForm;
	
	@FindBy(name = "application_department_name")
	private WebElement appDeptName;
	
	@FindBy(xpath = "//td[text()='OHC Applicable:']")
	private WebElement oHCApplicableBox;
	
	@FindBy(name="default_first_out_consultation_haad")
	private WebElement defaultFirstOutConsultation;
	
	@FindBy(name = "default_followup_out_consultation_haad")
	private WebElement defaultFollowUpOutConsultation;
	
	@FindBy(name = "default_first_in_consultation_haad")
	private WebElement defaultFirstInPatient;
	
	@FindBy(name="default_followup_in_consultation_haad")
	private WebElement defaultFollowUpConsultation;
	
	@FindBy(name = "default_first_out_consultation_dha")
	private WebElement defaultOutConsultationDha;
	
	@FindBy(name = "default_followup_out_consultation_dha")
	private WebElement defaultFollowUpDha;
	
	@FindBy(name = "default_first_in_consultation_dha")
	private WebElement defaultInConsultationDha;
	
	@FindBy(name = "default_followup_in_consultation_dha")
	private WebElement defaultFollowUpInDha;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	
	
	
	public DepartmentMaster(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void hospAdminClick(){
		hospAdminLink.click();
	}
	public void ClickDept(){
		deptLink.click();
	}
	public void AddNewDept(){
		addNewDept.click();
	}
	public void EnterName() {
		new BaseClass();
		nameField.sendKeys(BaseClass.value());
	}
	public void selectDeptDropDown() {
		Select sdd = new Select(deptTypeDropDown);
		sdd.selectByVisibleText("Dental");
	}
	public void selectGender(){
		Select sg = new Select(genderDropDown);
		sg.selectByVisibleText("All");
	}
	public void EnterCentreCode(){
		new BaseClass();
		costCenterCode.sendKeys(BaseClass.value());
	}
	public void selectExamOrgenCategory(){
		examOrganCategory.click();
	}
	public void selectClinicalInfo() {
		Select sci = new Select(clinicalInfoForm);
		sci.selectByVisibleText("Clinical Information - Wet Mount");
	}
	public void selectAppDeptName(){
		Select sadn = new Select(appDeptName);
		sadn.selectByValue("Anaesthesiology");
	}
	public void clickAndSave() {
		saveButton.click();
	}
}	
