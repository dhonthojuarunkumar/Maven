package com.mavenika.genericLib;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public  class MyListeners  implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method passed",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method failed",true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		 wlib.getFullScreenshot("C:\\Users\\J.SANDEEP\\eclipse-workspace\\ExperienceFramework\\MavenikaCRM\\screenshots\\"+result.getName()+".jpg");
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method skipped",true);
	}

	

	

}
