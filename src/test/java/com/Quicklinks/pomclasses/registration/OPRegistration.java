package com.Quicklinks.pomclasses.registration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.instahms.generics.BaseClass;
import com.instahms.generics.Library;

public class OPRegistration extends Library{
	@FindBy(id="salutation")
	private WebElement salutationValue;
	
	@FindBy(id= "patient_name")
	private WebElement patientFirstNameField;
	
	@FindBy(id = "middle_name")
	private WebElement patientMidNameField;
	
	@FindBy(id= "last_name")
	private WebElement patientLastNameField;
	
	@FindBy(id = "patient_phone")
	private WebElement patientPhone;
	
	@FindBy(id = "age")
	private WebElement patientAge;
	
	@FindBy(id = "ageIn")
	private WebElement ageInParameter;
	
	@FindBy(id = "patient_gender")
	private WebElement genderDropDown;
	
	@FindBy(id = "patient_phone2")
	private WebElement additionalPhoneNum;
	
	@FindBy(id = "patient_address")
	private WebElement addressTextBox;
	
	@FindBy(id = "custom_list1_value")
	private WebElement nationality;
	
	@FindBy(id = "custom_list7_value")
	private WebElement consentCollected;
	
	@FindBy(id = "identifier_id")
	private WebElement identifierId;
	
	@FindBy(id = "dept_name")
	private WebElement deptName;
	
	@FindBy(id = "doctor_name")
	private WebElement docNameTextField;
	
	@FindBy(id = "op_type")
	private WebElement opType;
	
	@FindBy(id = "doctorCharge")
	private WebElement consultType;
	
	@FindBy(id = "ailment")
	private WebElement complaintTextBox;
	
	
	public OPRegistration(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void selSalutation(){
		Select ssv = new Select(salutationValue);
		ssv.selectByValue("SALU0002");
	}
	public void selFirstName(){
		patientFirstNameField.sendKeys(new BaseClass().getNames());
	}
	public void selSecondName(){
		patientMidNameField.sendKeys(new BaseClass().getNames());
	}
	public void selLastname(){
		patientLastNameField.sendKeys(new BaseClass().getNames());
	}
	@SuppressWarnings("static-access")
	public void addPatPhone() throws IOException{
		patientPhone.sendKeys(new Library().getCellValue(EXCEL_PATH,"Sheet1",2,0));
	}
	
	
}
