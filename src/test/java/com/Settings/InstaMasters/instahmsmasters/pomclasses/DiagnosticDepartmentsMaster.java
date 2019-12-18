package com.Settings.InstaMasters.instahmsmasters.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.instahms.generics.BaseClass;

public class DiagnosticDepartmentsMaster {
	
	@FindBy(xpath = "//span[text()='Hospital Admin Masters']")
	private WebElement hospAdminLink;
	
	@FindBy(linkText = "Diagnostic Departments")
	private WebElement DiagnosticDeparmentsLink;                           
	
	@FindBy(linkText = "Add New Department")
	private WebElement addNewDiagnosticDepartment;
	
	@FindBy(name = "ddept_name")
	private WebElement diagDeptName;
	
	@FindBy(name = "category")
	private WebElement selectCategory;
	
	@FindBy(name = "designation")
	private WebElement technicianDesignation;
	
	@FindBy(name = "display_order")
	private WebElement displayOrderBox;
	
	@FindBy(name = "status")
	private WebElement statusDropdown;
	
	@FindBy(name = "addresults")
	private WebElement addResultsButton;
	
	@FindBy(name = "centerId")
	private WebElement centreDropdown;
	
	@FindBy(name = "storeId")
	private WebElement storeDropdown;
	
	@FindBy(xpath = "//input[@value = 'Add']")
	private WebElement addButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	
	public DiagnosticDepartmentsMaster(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void ClickHospAdmin(){
		hospAdminLink.click();
	}
	public void clickDiagDeptLink(){
		DiagnosticDeparmentsLink.click();
	}
	public void clickAddNewDiagDept(){
		addNewDiagnosticDepartment.click();
	}
	public void newDiagDeptName(){
		diagDeptName.sendKeys(new BaseClass().getNames().toString());
	}
	public void selectCategory(){
		Select sc = new Select(selectCategory);
		sc.selectByValue("DEP_RAD");;
	}
	public void addDesignation(){
		technicianDesignation.sendKeys(new BaseClass().getNames());
	}
	public void displayOrderBox(){
		displayOrderBox.sendKeys(new BaseClass().getShortRandomNumbers().toString());
	}
	public void selectStatus(){
		Select ss = new Select(statusDropdown);
		ss.selectByValue("A");
	}
	public void addResults(){
		addResultsButton.click();
	}
	public void selectCentre(){
		Select scen = new Select(centreDropdown);
		scen.selectByValue("9");
	}
	public void selectStore(){
		Select ss = new Select(storeDropdown);
		ss.selectByValue("210");
	}
	public void addStoreResults(){
		addButton.click();
	}
	public void save(){
		saveButton.click();
	}
}
