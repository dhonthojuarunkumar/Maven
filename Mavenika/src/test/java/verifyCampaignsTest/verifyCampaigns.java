package verifyCampaignsTest;


import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Campaignspage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class verifyCampaigns extends BaseTest {
	
	
		@Test
		public void verifycampaignspage() throws Throwable {
			
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickCampaignsTab();
		
		Thread.sleep(2000);
		Campaignspage cp=new Campaignspage();
		cp.clicknewcampaignsbtn();
		
		Thread.sleep(2000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getCampaignsTextAddr(), "campaignspage");
		
		
		

	

	}

}
