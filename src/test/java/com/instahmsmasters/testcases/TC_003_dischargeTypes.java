package com.instahmsmasters.testcases;

import org.testng.annotations.Test;

import com.instahms.generics.BaseClass;
import com.instahms.pomclasses.DischargeTypes;

public class TC_003_dischargeTypes extends BaseClass {
	@Test(priority=1)
	public void createDischargeType(){
		DischargeTypes dt = new DischargeTypes(driver);
		dt.clickHospAdmin();
		dt.clickDischargeTypes();
		dt.addNewDischargeType();
		dt.enterName();
		dt.encounterEndType();
		dt.clickAndSave();
	}
}
