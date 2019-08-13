package com.instahmsmasters.testcases;


import org.testng.annotations.Test;
import com.instahms.generics.BaseClass;
import com.instahms.pomclasses.HospitalRolesMaster;

public class TC_001 extends BaseClass
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
