package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class Potentialspage {
	@FindBy(xpath= "//td[@class='title hline']")private WebElement potentialstext;
	@FindBy(xpath= "//input[@value='New Potential']")private WebElement newpotentialbtn;
	
	public Potentialspage(){
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	public WebElement getPotentialstextAddr() {
		return potentialstext;
	}

    public String getPotentialtextAddr() {
    	String ptext=potentialstext.getText();
    	return ptext;
    }
    
    public void clicknewpotentialbtn() {
    	newpotentialbtn.click();
    }

}
