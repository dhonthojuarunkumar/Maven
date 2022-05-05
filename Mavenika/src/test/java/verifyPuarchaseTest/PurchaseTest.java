package verifyPuarchaseTest;

import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;

public class PurchaseTest extends BaseTest{
	
	@Test
	public void purchasetest() throws Throwable {
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickForwardbtn();
	}
	
	

}
