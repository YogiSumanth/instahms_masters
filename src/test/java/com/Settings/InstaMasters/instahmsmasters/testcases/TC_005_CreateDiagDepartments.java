package com.Settings.InstaMasters.instahmsmasters.testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.instahms.generics.BaseClass;
import com.Settings.InstaMasters.instahmsmasters.pomclasses.DiagnosticDepartmentsMaster;

@Test
public class TC_005_CreateDiagDepartments extends BaseClass{
	
	public void createDiagMaster(){
		DiagnosticDepartmentsMaster ddm = new DiagnosticDepartmentsMaster(driver);
		ddm.ClickHospAdmin();
		ddm.clickDiagDeptLink();
		ddm.clickAddNewDiagDept();
		//ddm.newDiagDeptName();
		ddm.selectCategory();
		ddm.addDesignation();
		ddm.displayOrderBox();
		ddm.selectStatus();
		ddm.addResults();
		ddm.selectCentre();
		ddm.selectStore();
		ddm.addStoreResults();
		ddm.save();
		String gotText = driver.switchTo().alert().getText();
		//Assert.assertEquals(gotText,"we have found following error");
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(gotText, "We have found following error");
		driver.switchTo().alert().accept();
		ddm.newDiagDeptName();
		ddm.save();
	}
}
