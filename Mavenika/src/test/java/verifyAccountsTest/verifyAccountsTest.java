package verifyAccountsTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MavenikaCRM.Loginpage.ValidLoginTest;
import com.MavenikaCRM.pages.Accountspage;
import com.MavenikaCRM.pages.HomePage;
import com.mavenika.genericLib.BaseTest;
import com.mavenika.genericLib.WebDriverCommonLib;

public class verifyAccountsTest extends BaseTest{
	
	@Test
	public void verifyaccountstest()throws Throwable {
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.LoginToApp();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		Thread.sleep(2000);
		
		
		
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		Accountspage ap=new Accountspage();
		//ap.clicknewaccountbtn();
		wlib.elementDisplayed(ap.getAccountsTextAddr(), "accountspage");
				
		 List<WebElement> a1 = ap.getAllAccountNames();
		 for(int i=1;i<=3;i++) {
			 System.out.println(a1.get(i).getText());
		 }
		  
		  
	}

}
