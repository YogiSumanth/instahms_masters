package com.instahms.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	
}
