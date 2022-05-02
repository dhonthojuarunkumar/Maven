package com.MavenikaCRM.Loginpage;

import org.testng.annotations.Test;

import com.MavenikaCRM.pages.LoginPage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;

public class ValidLoginTest extends BaseTest {

	@Test
	public void LoginToApp() throws Throwable{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		
		Thread.sleep(3000);
		lp.login(flib.readPropertyData(PROP_PATH, "username"),
		         flib.readPropertyData(PROP_PATH, "password"));
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "HomepageTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "HomepageTitle"),
				wlib.getPageTitle(),
				"CRM Home");
				
	}


}
