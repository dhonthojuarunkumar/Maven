package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class HomePage {

 @FindBy(xpath= "//a[text()='Leads']") private WebElement LeadsTab;
 @FindBy(xpath= "//a[text()='Accounts']") private WebElement AccountsTab;
 @FindBy(xpath= "//a[contains(text(),'Contacts')]")private WebElement ContactsTab;
 @FindBy(xpath= "//a[contains(text(),'Potentials')]")private WebElement PotentialsTab;
 @FindBy(xpath= "//a[(text()='Campaigns')]")private WebElement CampaignsTab;
 public HomePage() {
	 //TODO Auto-generated constructor stub
	 PageFactory.initElements(BaseTest.driver, this);
 }

public WebElement getLeadsTab() {
	return LeadsTab;
}



 public void clickLeadsTab() {
	 LeadsTab.click();
 }

public WebElement getAccountsTab() {
	return AccountsTab;
}

public void clickAccountsTab() {
	AccountsTab.click();
}

 public WebElement getContactsTab() {
	return ContactsTab;
}

public void clickContactsTab() {
	 ContactsTab.click();
 }
 
 
public WebElement getPotentialsTab() {
	return PotentialsTab;
}


public void clickPotentialsTab() {
	PotentialsTab.click();
}

public WebElement getCampaigns() {
	return CampaignsTab;
}

public void clickCampaignsTab() {
	CampaignsTab.click();
}


 
}