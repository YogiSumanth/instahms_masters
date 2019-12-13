package com.instahms.generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	BaseClass b = new BaseClass();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test case started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
	String testmethodName = result.getName();
	b.takeScreenshot(testmethodName);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}
	@Override
	public void onStart(ITestContext context) {
	
	}
	@Override
	public void onFinish(ITestContext context) {
	
	}
	
}
