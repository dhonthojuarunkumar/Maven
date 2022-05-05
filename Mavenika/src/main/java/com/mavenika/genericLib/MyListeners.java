package com.mavenika.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class MyListeners  implements ITestListener {

	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		//Reporter.log(result.getName()+" method started",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" is started", ExtentColor.BLUE));
	}

	public void onTestSuccess(ITestResult result) {
		//Reporter.log(result.getName()+" method passed",true);
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+" is PASSED", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		//Reporter.log(result.getName()+" method failed",true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		 wlib.getFullScreenshot("C:\\Users\\J.SANDEEP\\eclipse-workspace\\ExperienceFramework\\MavenikaCRM\\screenshots\\"+result.getName()+".jpg");
	
		test=extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName()+" is FAILED", ExtentColor.RED));
	
	}

	public void onTestSkipped(ITestResult result) {
		//Reporter.log(result.getName()+" method skipped",true);
		test=extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+" is SKIPPED", ExtentColor.ORANGE));
	}

	@Override
	public void onStart(ITestContext context) {
		 spark = new ExtentSparkReporter("C:\\Users\\J.SANDEEP\\git\\repository\\Mavenika\\extentRepo\\Myreport.html");
		 extent = new ExtentReports();
		//Give settings of report
		spark.config().setDocumentTitle("Mavenika Report");
		spark.config().setReportName("Extent Report");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

	

	

}
