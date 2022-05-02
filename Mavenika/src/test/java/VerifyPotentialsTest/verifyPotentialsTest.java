package VerifyPotentialsTest;

import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.HomePage;
import com.MavenikaCRM.pages.Potentialspage;
import com.mavenika.genericLib.BaseTest;

public class verifyPotentialsTest extends BaseTest{
	
	@Test
	public void verifypotentialtest()throws Throwable {
		
	ValidLoginTest vl=new ValidLoginTest();
	vl.LoginToApp();
	
	HomePage hp=new HomePage();
	hp.clickPotentialsTab();
	
	Potentialspage pp=new Potentialspage();
	pp.clicknewpotentialbtn();
	}

}
