package VerifyLeadsTest;

import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.HomePage;
import com.MavenikaCRM.pages.Leadspage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class verifyLeadsTest extends BaseTest {
	
	@Test
	public void vverifyleadstest() throws Throwable{
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
	
		Thread.sleep(2000);
		Leadspage lp=new Leadspage();
		lp.clicknewleadbtn();
		
		Thread.sleep(2000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(lp.getLeadsTextAddr(), "leadspage");
		
		
	}

}
