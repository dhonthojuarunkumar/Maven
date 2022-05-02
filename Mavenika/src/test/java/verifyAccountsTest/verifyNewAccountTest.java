package verifyAccountsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Accountspage;
import com.MavenikaCRM.pages.CreateNewAccountPage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.FileLib;
import com.mavenika.genericLib.WebDriverCommonLib;

@Listeners(com.mavenika.genericLib.MyListeners.class)
public class verifyNewAccountTest extends BaseTest
{
	@Test
	public void vverifyNewAccountTest() throws Throwable
	{
		ValidLoginTest vl=new ValidLoginTest();
		 vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
	
		Thread.sleep(2000);
		Accountspage ap=new Accountspage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ap.getAccountsTextAddr(), "accountspage");
		
		Thread.sleep(2000);
		ap.clicknewaccountbtn();
		
		
		
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "CreateAccountsTitle"),
				wlib.getPageTitle(),
				"Create Accounts page");
		Thread.sleep(2000);
		
		CreateNewAccountPage ca=new CreateNewAccountPage();

		String an=flib.readExcelData(ACCOUNTDATAEXCEL_PATH, "Accounts", 0, 1);
		String accountType=flib.readExcelData(ACCOUNTDATAEXCEL_PATH, "Accounts", 1, 1);
		String rating=flib.readExcelData(ACCOUNTDATAEXCEL_PATH, "Accounts", 2, 1);
		String phone=flib.readExcelData(ACCOUNTDATAEXCEL_PATH, "Accounts", 3, 1);
		ca.CreateNewAccount(an, accountType,rating,phone );

}

	
}