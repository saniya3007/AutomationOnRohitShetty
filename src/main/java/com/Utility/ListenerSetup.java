package com.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution is successful");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase execution is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase execution is skipped");
	}
}
