package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;


public class CreateNewAccountPage {
	
	
	@FindBy(xpath= "//input[@name=\"property(Account Name)\"]")private WebElement accountnameTextbox;
	@FindBy(xpath= "//select[@name=\"property(Account Type)\"]")private WebElement accounttypeDropdown;
	@FindBy(xpath="//select[@name=\"property(Rating)\"]")private WebElement ratingDropdown;
	@FindBy(xpath= "//input[@name=\"property(Phone)\"]")private WebElement phoneTextbox;
	@FindBy(xpath= "//input[@value=\"Save\"][1]")private WebElement savebtn;
	
	public CreateNewAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccountnameTextbox() {
		return accountnameTextbox;
	}

	public WebElement getAccounttypeDropdown() {
		return accounttypeDropdown;
	}

	public WebElement getRatingDropdown() {
		return ratingDropdown;
	}

	public WebElement getPhoneTextbox() {
		return phoneTextbox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void CreateNewAccount(String an,String accountType,String rating,String phone) 
	{
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		accountnameTextbox.sendKeys(an);
		wlib.selectedOption(accountType, accounttypeDropdown);
		wlib.selectedOption(rating, ratingDropdown);
		phoneTextbox.sendKeys(phone);
		
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		savebtn.click();
		
		
		
		
		
	}
	

}
