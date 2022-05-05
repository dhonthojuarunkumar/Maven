package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class CreateNewCampaignsPage {
	
	@FindBy(name="property(Campaign Name)")private WebElement campaignnameTextbox;
	@FindBy(name="property(Start Date)")private WebElement startTextbox;
	@FindBy(name="property(Status)")private WebElement statusDropdown;
	@FindBy(name="property(End Date)")private WebElement enddateTextbox;
	@FindBy(xpath= "//input[@name='Button'][1]")private WebElement savebtn;
	

	public CreateNewCampaignsPage(){
		PageFactory.initElements(BaseTest.driver, this);
			
	}



	public WebElement getCampaignnameTextbox() {
		return campaignnameTextbox;
	}

	public WebElement getStartTextbox() {
		return startTextbox;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getEnddateTextbox() {
		return enddateTextbox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void createNewCampaign(String ct, String st, String Status, String et){
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		campaignnameTextbox.sendKeys(ct);
		startTextbox.sendKeys(st);
		wlib.selectedOption(Status, statusDropdown);
		enddateTextbox.sendKeys(et);
		try {
			Thread.sleep(2000);
		}catch
			(InterruptedException e) {
			e.printStackTrace();
		}
		
		savebtn.click();
		
		
		
	}


	

	


	
	
}
