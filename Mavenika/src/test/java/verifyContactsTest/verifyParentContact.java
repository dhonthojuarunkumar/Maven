package verifyContactsTest;

import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Contactspage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class verifyParentContact extends BaseTest{

	@Test
	public void verifyParentContactsTest() throws Throwable {
		
		ValidLoginTest vl=new ValidLoginTest ();
		vl.LoginToApp();
	
	
    HomePage hp=new HomePage();
    hp.clickContactsTab();
    
    Thread.sleep(2000);
    Contactspage cp=new Contactspage();
    cp.clicknewcontactbtn();
    
    WebDriverCommonLib wlib=new WebDriverCommonLib();
    wlib.elementDisplayed(cp.getContactsTextAddr1(), "contactspage");
    
    
	}
}
