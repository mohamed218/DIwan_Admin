package NewsTests;

import org.testng.annotations.Test;

import News.PinNewsAr;
import Pages.HomePage;
import Tests.TestBase;

public class PinItemAr extends TestBase {
	
	HomePage homeobj ; 
	PinNewsAr pinobj ; 
	
	@Test(dependsOnMethods="login")
	public void PinItem() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		pinobj = new PinNewsAr(driver);
		pinobj.PinItem();
	}

}
