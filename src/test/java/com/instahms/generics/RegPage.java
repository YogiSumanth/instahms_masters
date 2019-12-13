package com.instahms.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class RegPage extends BaseClass{
	@Test
	public void Registration() throws InterruptedException, AWTException{
		WebElement regDropDown = driver.findElement(By.xpath("//span[text()='Registration']"));
		regDropDown.click();
		WebElement opRegLink = driver.findElement(By.linkText("OP Registration"));
		opRegLink.click();
		
		
		Thread.sleep(15000);
		WebElement deptName = driver.findElement(By.id("dept_name"));
		Select sdn = new Select(deptName);
		sdn.selectByVisibleText("Cardiology");
		
		WebElement Doctor= driver.findElement(By.id("doctor_name"));
		Doctor.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(3000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
	}
}
