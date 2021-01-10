package NewsTests;

import org.testng.annotations.Test;

import News.PinNewsEn;
import Pages.HomePage;
import Tests.TestBase;

public class PinItemEn extends TestBase {
	
	HomePage homeobj ; 
	PinNewsEn pinobj ; 
	
	@Test(dependsOnMethods="login")
	public void PinItem() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		pinobj = new PinNewsEn(driver);
		pinobj.PinItem();
	}

}
