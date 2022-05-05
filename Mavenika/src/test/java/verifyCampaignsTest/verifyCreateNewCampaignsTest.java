package verifyCampaignsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Campaignspage;
import com.MavenikaCRM.pages.CreateNewCampaignsPage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;

@Listeners(com.mavenika.genericLib.MyListeners.class)

public class verifyCreateNewCampaignsTest extends BaseTest{
	
	@Test
	public void verifyCreateCampaign() throws Throwable{
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickCampaignsTab();
		
		Thread.sleep(2000);
		Campaignspage cp=new Campaignspage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getCampaignsTextAddr(), "campaignspage");
		
		Thread.sleep(2000);
		cp.clicknewcampaignsbtn();
		
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "CreateCampaignsTitle"),
				wlib.getPageTitle(),"create campaign page");
		
		CreateNewCampaignsPage cc=new CreateNewCampaignsPage();
		String campaignname=flib.readExcelData(MAVENIKAEXCEL_PATH, "Campaigns", 0, 1);
		String startdate=flib.readExcelData(MAVENIKAEXCEL_PATH, "Campaigns", 1, 1);
		String status=flib.readExcelData(MAVENIKAEXCEL_PATH, "Campaigns", 2, 1);
		String enddate=flib.readExcelData(MAVENIKAEXCEL_PATH, "Campaigns", 3, 1);
		cc.createNewCampaign(campaignname, startdate, status, enddate);
	}
	
	
	

}
