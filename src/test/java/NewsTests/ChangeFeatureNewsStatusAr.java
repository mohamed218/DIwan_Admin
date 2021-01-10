package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class ChangeFeatureNewsStatusAr extends TestBase {

	HomePage homeobj ; 
	News.ChangeFeatureNewsStatusAr changeStatusobj ; 
	
	@Test
	public void changeFeatureStatus() {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		changeStatusobj = new News.ChangeFeatureNewsStatusAr(driver);
		changeStatusobj.changefeaturestatus();
	}
}
