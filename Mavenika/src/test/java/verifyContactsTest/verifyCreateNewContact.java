package verifyContactsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Contactspage;
import com.MavenikaCRM.pages.CreateNewContactpage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;

@Listeners(com.mavenika.genericLib.MyListeners.class)

public class verifyCreateNewContact extends BaseTest
{
	
	@Test
	public void vverifyCreateNewContactTab()throws Throwable {
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickContactsTab();
		
		Thread.sleep(2000);
		Contactspage cp=new Contactspage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getContactsTextAddr1(), "contactspage");
		
		Thread.sleep(2000);
		cp.clicknewcontactbtn();
		
		
		
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "CreateContactsTitle"),
		wlib.getPageTitle(),
		 "Create Contacts Page");
		
		Thread.sleep(2000);
		
		CreateNewContactpage cc=new CreateNewContactpage();
		String salText = flib.readExcelData(MAVENIKAEXCEL_PATH, "Contacts", 0, 1);
		String fn = flib.readExcelData(MAVENIKAEXCEL_PATH, "Contacts", 1, 1);
		String leadsource = flib.readExcelData(MAVENIKAEXCEL_PATH, "Contacts", 2, 1);
		String ln = flib.readExcelData(MAVENIKAEXCEL_PATH, "Contacts", 3, 1);
		String phone = flib.readExcelData(MAVENIKAEXCEL_PATH, "Contacts", 4, 1);
		cc.createNewContact(salText, fn, leadsource, ln, phone, flib.readPropertyData(PROP_PATH, "AccountNamelookup"));
		
	}

}
