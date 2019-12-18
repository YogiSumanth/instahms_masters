package com.Settings.InstaMasters.instahmsmasters.testcases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Settings.InstaMasters.instahmsmasters.pomclasses.HospitalRolesMaster;
import com.instahms.generics.BaseClass;
import com.instahms.generics.TestListener;

@Listeners(TestListener.class)
public class TC_001_CreatingHospitalRolesMasters extends BaseClass
	{
		@Test
		public void HospitalRoles() throws InterruptedException{
			HospitalRolesMaster hrm = new HospitalRolesMaster(driver);
			hrm.ClickHospAdmin();
			Thread.sleep(1000);
			hrm.ClickHospRolesMaster();
			Thread.sleep(3000);
			/*hrm.ClickViewOrEdit();
			Thread.sleep(3000);*/
		    hrm.ClickAddNewRole();
		    hrm.EnterText();
		    hrm.Save();
		    
		    }
	}
