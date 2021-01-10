package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFeatureNewsEn extends TestBase {

	HomePage homeobj ; 
	News.DeleteFeatureNewsEn featureobj ;
	
	@Test
	public void deletefeaturenew() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		
		
		featureobj = new News.DeleteFeatureNewsEn(driver);
		featureobj.deleteFeatureNews();
	}
}
