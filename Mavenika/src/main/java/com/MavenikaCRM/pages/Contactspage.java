package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class Contactspage {
	
	@FindBy(xpath= "//td[@class='title hline']")private WebElement contactstext;
    @FindBy(xpath= "//input[@value=\"New Contact\"]")private WebElement newcontactbtn;
    
    public Contactspage(){
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getContactsTextAddr1() {
    	return contactstext;
    }
    
    public String getContactsTextAddr() {
    	
    	String ctext = contactstext.getText();
    	return ctext;
    }
    
    public void clicknewcontactbtn() {
    	newcontactbtn.click();
    }
	}