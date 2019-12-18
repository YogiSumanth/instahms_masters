package com.Settings.InstaMasters.instahmsmasters.testcases;

import org.testng.annotations.Test;

import com.instahms.generics.BaseClass;
import com.Settings.InstaMasters.instahmsmasters.pomclasses.HospitalRolesEdit;

public class TC_004_EditRolesMaster extends BaseClass{
	@Test
	public void hospitalRolesEdit(){
		HospitalRolesEdit hre = new HospitalRolesEdit(driver);
		hre.ClickHospAdmin();
		hre.ClickHospRolesMaster();
		hre.ClickCosmetology();
		hre.ClickViewOrEdit();
		hre.EditRoleName();
		hre.EditRoleStatus();
		hre.Save();
	}
}
