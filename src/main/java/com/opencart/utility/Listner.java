package com.opencart.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testBase.TestBase;

public class Listner extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test is start: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test is success: "+result.getName());
			excel_data.writeData("RegisterTestData", 1, 7, "Pass");
			logger.info("Data write in excel sheet");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test is fail: "+result.getName());
		
			excel_data.writeData("RegisterTestData", 1, 7, "Fail");
		
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test is Skip: "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {


	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
