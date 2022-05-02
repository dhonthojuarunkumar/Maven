package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class Campaignspage {
	
	@FindBy(xpath= "//td[@class='title hline']")private WebElement campaignstext;
	@FindBy(xpath= "//input[@value='New Campaign']")private WebElement newcampaignsbtn;
	
	public Campaignspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignsTextAddr() {
		return campaignstext;
	}

	public String getCampaignTextAddr() {
		
		String ctext=campaignstext.getText();
		return ctext;
	}
	public void clicknewcampaignsbtn() {
		newcampaignsbtn.click();
	}
	

	
	

	
	
   
	
	

}
