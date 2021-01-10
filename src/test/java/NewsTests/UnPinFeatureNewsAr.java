package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class UnPinFeatureNewsAr extends TestBase {

	HomePage homeobj ; 
	News.UnPinFeatureNewsAr unpinobj ; 
	
	@Test
	public void unpinfeature() {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		unpinobj = new News.UnPinFeatureNewsAr(driver);
		unpinobj.unpinfeature();
	}
}
