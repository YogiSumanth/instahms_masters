package com.Settings.InstaMasters.instahmsmasters.testcases;

import org.testng.annotations.Test;

import com.Settings.InstaMasters.instahmsmasters.pomclasses.DepartmentMaster;
import com.instahms.generics.BaseClass;

public class TC_002_departmentMaster extends BaseClass{
	@Test
	public void department() {
		DepartmentMaster dm = new DepartmentMaster(driver);
		dm.hospAdminClick();
		dm.ClickDept();
		dm.AddNewDept();
		dm.EnterName();
		dm.selectDeptDropDown();;
		dm.selectGender();
		dm.EnterCentreCode();
		dm.selectExamOrgenCategory();
		dm.selectClinicalInfo();
		dm.selectAppDeptName();
		dm.clickAndSave();
	}
}
