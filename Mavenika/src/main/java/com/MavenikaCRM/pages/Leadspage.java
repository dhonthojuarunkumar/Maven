package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class Leadspage {
	
	@FindBy(xpath="//td[contains(text(),'Leads: ')]")private WebElement leadstext;
	@FindBy(xpath= "//input[@value=\"New Lead\"]")private WebElement newleadbtn ;
	
	public Leadspage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getLeadsTextAddr()
	{
		return leadstext;
	}
	public String  getLeadTextAddr()
	{
		String ltext =leadstext.getText();
		return ltext;
	}
	public void clicknewleadbtn() {
	
		newleadbtn.click();
	}
}
