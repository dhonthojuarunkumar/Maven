package VerifyLeadsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.CreateNewLeadPage;
import com.MavenikaCRM.pages.HomePage;
import com.MavenikaCRM.pages.Leadspage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;


	@Listeners(com.mavenika.genericLib.MyListeners.class)
	public class verifyNewLeadTest extends BaseTest {

	@Test
	public void vverifyNewLeadTest() throws Throwable
	{
		ValidLoginTest vl=new ValidLoginTest();
		 vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
	
		Thread.sleep(2000);
		Leadspage lp=new Leadspage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(lp.getLeadsTextAddr(), "leadspage");
		
		Thread.sleep(2000);
		lp.clicknewleadbtn();
		
		
		
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "CreateLeadTitle"),
				wlib.getPageTitle(),
				"Create Leads page");
		Thread.sleep(2000);
		
		CreateNewLeadPage cl=new CreateNewLeadPage();
		String salText = flib.readExcelData(MAVENIKAEXCEL_PATH, "Leads", 0,1);
		String fn = flib.readExcelData(MAVENIKAEXCEL_PATH, "Leads", 1,1);
		String company = flib.readExcelData(MAVENIKAEXCEL_PATH, "Leads", 2,1);
		String ln = flib.readExcelData(MAVENIKAEXCEL_PATH, "Leads", 3,1);
		String leadsource = flib.readExcelData(MAVENIKAEXCEL_PATH, "Leads", 4,1);
		cl.createNewLead(salText, fn, company, ln, leadsource);
	}
	
	
	

}
