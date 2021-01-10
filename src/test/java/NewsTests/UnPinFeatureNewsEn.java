package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class UnPinFeatureNewsEn extends TestBase {

	HomePage homeobj ; 
	News.UnPinFeatureNewsEn unpinobj; 
	
	@Test
	public void unpinfeature() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigation();
		
		unpinobj = new News.UnPinFeatureNewsEn(driver);
		unpinobj.unpinfeature();
	}
}
