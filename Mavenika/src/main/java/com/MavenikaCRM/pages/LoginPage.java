package com.MavenikaCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenika.genericLib.BaseTest;

public class LoginPage {

	
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath = "//input[@title='Sign In']") private WebElement SigninBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void login(String username,String password) {
		untb.sendKeys(username);
		pwtb.sendKeys(password);
		SigninBtn.click();
	}
	
	
	public WebElement getuntb()
	{
		return untb;
	}
	
	public WebElement getpwtb()
	{
		return pwtb;
	}
	
	public WebElement getSigininBtn()
	{
		return SigninBtn;
	}
	
	
	
	
}
