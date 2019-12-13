package com.instahms.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.instahms.generics.BaseClass;

public class DischargeTypes {
	
	@FindBy(xpath = "//span[text()='Hospital Admin Masters']")
	private WebElement hospAdminLink;
	
	@FindBy(linkText="Discharge Types")
	private WebElement dischargeTypes;
	
	@FindBy(linkText="Add Discharge Type")
	private WebElement newDischargeType;
	
	@FindBy(id="discharge_type")
	private WebElement enterName;
	
	@FindBy(name="encounter_end_type_code")
	private WebElement encounterEndType;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	
	public DischargeTypes(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickHospAdmin(){
		hospAdminLink.click();
	}
	public void clickDischargeTypes(){
		dischargeTypes.click();
	}
	public void addNewDischargeType(){
		newDischargeType.click();
	}
	public void enterName(){
		enterName.sendKeys(new BaseClass().value());
	}
	public void encounterEndType(){
		Select seet = new Select(encounterEndType);
		seet.selectByVisibleText("Discharged with approval");
	}
	public void clickAndSave() {
		saveButton.click();
	}
}
