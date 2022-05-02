package com.MavenikaCRM.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;


public class Accountspage {
	
	@FindBy(xpath= "//td[@class=\"title hline\"]")private WebElement accountstext;
	@FindBy(xpath= "//input[@value=\'New Account\']")private WebElement newaccountbtn;
	
	@FindBy(xpath= "//table[@class='secContent']//tr[*]//td[3]")private List<WebElement> allAccountNames;
	
	

	public Accountspage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccountsTextAddr()
	{
		return accountstext;
	}
    
	public String getAccountTextAddr()
	{
	
	String atext=accountstext.getText();
	return atext;
	
	}
	public void clicknewaccountbtn()
	{
		newaccountbtn.click();
	}

	public List<WebElement> getAllAccountNames() {
		return allAccountNames;
	}

	
	
	
 
}
