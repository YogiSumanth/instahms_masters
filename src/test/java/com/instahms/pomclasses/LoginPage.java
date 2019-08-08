package com.instahms.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "hospital")
	private WebElement hospTextBox;
	
	@FindBy(id = "userId")
	private WebElement userNameTB;
	
	@FindBy(id = "password")
	private WebElement pwdTB;
	
	@FindBy(id = "button")
	private WebElement loginBtn;
	
	@FindBy(id = "forgot_password")
	private WebElement forgotPassword;
	
	//Initialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void setHospital(String hsp){
		hospTextBox.sendKeys(hsp);
	}
	public void setUsername(String un){
		userNameTB.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBtn.click();
	}
}