
package com.mavenika.genericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReportConcept {

	public static void main(String[] args) {
		//set path of report
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\J.SANDEEP\\git\\repository\\Mavenika\\extentRepo\\Myreport.html");
		ExtentReports extent = new ExtentReports();
		//Give settings of report
		spark.config().setDocumentTitle("Mavenika Report");
		spark.config().setReportName("Extent Report");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		
		
		//Create test into reports
		ExtentTest test = extent.createTest("Verify Third Party is Clickable");
		//Give various status of test steps
		test.info(MarkupHelper.createLabel("Login page is Displayed ", ExtentColor.BLUE));
		test.pass(MarkupHelper.createLabel("Element is Displayed ", ExtentColor.GREEN));
		//test.fail(MarkupHelper.createLabel("Third Party Button is not Clickable", ExtentColor.RED));
	
	
		//Save the report
		extent.flush();
	
	}
}
