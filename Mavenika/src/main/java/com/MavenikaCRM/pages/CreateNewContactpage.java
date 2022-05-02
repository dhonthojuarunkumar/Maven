package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class CreateNewContactpage {
	
	@FindBy(xpath= "//select[@name='property(saltName)']")private WebElement firstnameDropdown;
	@FindBy(name="property(First Name)")private WebElement firstnameTextbox;
	@FindBy(xpath= "//select[@name='property(Lead Source)']")private WebElement leadsourceDropdown;
	@FindBy(name="property(Lead Source)")private WebElement lastnameTextbox;
	@FindBy(name="property(Last Name)")private WebElement phoneTextbox;
	@FindBy(xpath= "//input[@value='Save'][1]")private WebElement savebtn;
	
	@FindBy(xpath = "//img[@title='Account Name Lookup']")private WebElement parentContactImage;
	@FindBy(xpath = "(//table)[4]//tr[2]//td[1]")private WebElement accountNameLink;
	
	public CreateNewContactpage(){
		PageFactory.initElements(BaseTest.driver, this);
		
		
	}

	public WebElement getFirstnameDropdown() {
		return firstnameDropdown;
	}

	public void setFirstnameDropdown(WebElement firstnameDropdown) {
		this.firstnameDropdown = firstnameDropdown;
	}

	public WebElement getFirstnameTextbox() {
		return firstnameTextbox;
	}

	
	public WebElement getLeadsourceDropdown() {
		return leadsourceDropdown;
	}

	
	public WebElement getLastnameTextbox() {
		return lastnameTextbox;
	}

	

	public WebElement getPhoneTextbox() {
		return phoneTextbox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void createNewContact(String salText, String fn, String leadSource, String ln, String phone, String expectedTitle) throws  Throwable 
	{
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		String parentWindow = BaseTest.driver.getWindowHandle();
		wlib.selectedOption(salText, firstnameDropdown);
		firstnameTextbox.sendKeys(fn);
		wlib.selectedOption(leadSource, leadsourceDropdown);
		lastnameTextbox.sendKeys(ln);
		phoneTextbox.sendKeys(phone);
		
		parentContactImage.click();
		wlib.switchToWindow(accountNameLink, expectedTitle);
		Thread.sleep(2000);
		BaseTest.driver.switchTo().window(parentWindow);
			Thread.sleep(2000);
		savebtn.click();
		
	}

	public WebElement getParentContactImage() {
		return parentContactImage;
	}
	
	public void clickparentContactImage() {
		parentContactImage.click();
	}

	
	public WebElement getAccountNameLink() {
		return accountNameLink;
	}

	
	
	

}
