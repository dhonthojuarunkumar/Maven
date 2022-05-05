package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class Reportspage {
	
	@FindBy(name="newReport")private WebElement createnewrptBtn;
	@FindBy(name="newReportFolder")private WebElement createnewrptfldrBtn;
	@FindBy(name="scheduleReport")private WebElement reportschedulerBtn;
	
	
	public void reportspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getCreatenewrptBtn() {
		return createnewrptBtn;
	}
	
	public WebElement getCreatenewrptfldrBtn() {
		return createnewrptfldrBtn;
	}

	public WebElement getReportschedulerBtn() {
		return reportschedulerBtn;
	}
	
	public void clickcreatenewrptBtn() {
		createnewrptBtn.click();
	}
	
	public void clickcreatenewrptfldrBtn() {
		createnewrptfldrBtn.click();
	}
	
	public void clickreportschedulerBtn() {
		reportschedulerBtn.click();
	}

	

	
	
	

}
