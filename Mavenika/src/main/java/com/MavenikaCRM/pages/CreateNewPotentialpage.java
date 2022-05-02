package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class CreateNewPotentialpage {
	
	@FindBy(name="property(Potential Name)")private WebElement potentialnameTextbox;
	@FindBy(name="property(Account Name)")private WebElement accountnameTextbox;
	@FindBy(xpath= "//select[@name='property(Type)']")private WebElement typeDropdown;
	@FindBy(name="property(Closing Date)")private WebElement  closingdateTextbox;
	@FindBy(xpath= "//select[@name=\"property(Stage)\"]")private WebElement stageDropdown;
	@FindBy(name="property(Probability)")private WebElement probabilityTextbox;
	@FindBy(xpath= "//input[@value=\"Save\"][1]")private WebElement savebtn;
	
	public CreateNewPotentialpage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPotentialnameTextbox() {
		return potentialnameTextbox;
	}

	public WebElement getAccountnameTextbox() {
		return accountnameTextbox;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public WebElement getClosingdateTextbox() {
		return closingdateTextbox;
	}

	public WebElement getStageDropdown() {
		return stageDropdown;
	}

	public WebElement getProbabilityTextbox() {
		return probabilityTextbox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void createNewPotential(String potentialName, String accountName, String type, String closingDate, String stage) {
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		potentialnameTextbox.sendKeys(potentialName);
		accountnameTextbox.sendKeys(accountName);
		wlib.selectedOption(type, typeDropdown);
		closingdateTextbox.sendKeys(closingDate);
		wlib.selectedOption(stage, stageDropdown);
		//probabilityTextbox.sendKeys(pb);
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		savebtn.click();
		
		
		
		
		
	}
}
