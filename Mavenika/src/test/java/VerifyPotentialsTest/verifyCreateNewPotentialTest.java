package VerifyPotentialsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.CreateNewPotentialpage;
import com.MavenikaCRM.pages.HomePage;
import com.MavenikaCRM.pages.Potentialspage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;

@Listeners(com.mavenika.genericLib.MyListeners.class)
public class verifyCreateNewPotentialTest extends BaseTest {
	
	@Test
	
	public void verifyCreateNewPotentialsTab() throws Throwable {
		
		ValidLoginTest vl=new  ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickPotentialsTab();
		
		Thread.sleep(2000);
		Potentialspage pp=new Potentialspage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(pp.getPotentialstextAddr(), "potentialpage");
		
		Thread.sleep(2000);
		pp.clicknewpotentialbtn();
		
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "CreatePotentialTitle"),
		wlib.getPageTitle(),
		"Create Potential page");
		
		Thread.sleep(2000);
		CreateNewPotentialpage cp=new CreateNewPotentialpage();
		String pn = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 0, 1);
		String an = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 1, 1);
		String type = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 2, 1);
		String cd = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 3, 1);
		String stage = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 4, 1);
	//	String pb = flib.readExcelData(MAVENIKAEXCEL_PATH, "Potentials", 5, 1);
		cp.createNewPotential(pn, an, type, cd, stage);
		
		
	}
	
	

}
