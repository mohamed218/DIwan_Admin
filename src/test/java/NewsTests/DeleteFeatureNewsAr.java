package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFeatureNewsAr extends TestBase {
	
	HomePage homeobj ; 
	News.DeleteFeatureNewsAr featureobj ; 
	
	@Test
	public void deletefeaturenew() {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		featureobj = new News.DeleteFeatureNewsAr(driver);
		featureobj.deleteFeatureNews();
	}

}
