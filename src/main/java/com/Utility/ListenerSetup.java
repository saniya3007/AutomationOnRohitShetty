package com.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution is started");
		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution is successful");
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase execution is failed");
		UtilClass.takeScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase execution is skipped");
		System.out.println(result.getName());
	}
}
