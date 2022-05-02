
  package com.MavenikaCRM.pages;
  
  import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

  
  public class CreateNewLeadPage {
  
  @FindBy(xpath="//select[@name=\"property(saltName)\"]")private WebElement firstnameDropdown;
  
  @FindBy(name="property(First Name)")private WebElement firstnameTextBox;
  
  @FindBy(xpath="//input[@name='property(Company)']")private WebElement companynameTextBox;
  
  @FindBy(xpath="//input[@name='property(Last Name)']")private WebElement lastnameTextBox;
  
  @FindBy(xpath="//select[@name='property(Lead Source)']")private WebElement leadsoureDropdown;
  
  @FindBy(xpath= "//input[@value='Save'][1]")private WebElement savebtn;
  
  
  public CreateNewLeadPage()
  {
  
      PageFactory.initElements(BaseTest.driver, this); 
      
  }
  
public WebElement getFirstnameDropdown() {
	return firstnameDropdown;
}


public WebElement getFirstnameTextBox() {
	return firstnameTextBox;
}


public WebElement getCompanynameTextBox() {
	return companynameTextBox;
}


public WebElement getLastnameTextBox() {
	return lastnameTextBox;
}


public WebElement getLeadsoureDropdown() {
	return leadsoureDropdown;
}


public WebElement getSavebtn() {
	return savebtn;
}


	public void createNewLead(String salText, String fn, String company, String ln, String leadSource)
     {
    	 WebDriverCommonLib wlib= new WebDriverCommonLib();
    	 wlib.selectedOption(salText, firstnameDropdown);
    	 firstnameTextBox.sendKeys(fn);
    	 companynameTextBox.sendKeys(company);
    	 lastnameTextBox.sendKeys(ln);
    	 try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	 wlib.selectedOption(leadSource, leadsoureDropdown);
    	 savebtn.click();
    	 
     }
  
  
  }
 