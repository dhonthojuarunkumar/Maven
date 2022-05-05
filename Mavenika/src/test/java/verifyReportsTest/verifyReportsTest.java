package verifyReportsTest;

import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.HomePage;
import com.MavenikaCRM.pages.Reportspage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class verifyReportsTest extends BaseTest {
	
	@Test
	
	public void verifyreport() throws Throwable {
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickReportsTab();
		
		Thread.sleep(2000);
		Reportspage rp=new Reportspage();
		//rp.clickcreatenewrptBtn();
		rp.clickcreatenewrptfldrBtn();
		
		Thread.sleep(2000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		//wlib.elementDisplayed(rp.getCreatenewrptBtn(), "Reportspage");
		wlib.elementDisplayed(rp.getCreatenewrptfldrBtn(), "Reportspage");
	}

}
