package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class ChangeFeatureNewsStatusEn extends TestBase{

	HomePage homeobj ; 
	News.ChangeFeatureNewsStatusEn changeStatusobj ; 
	
	@Test
	public void changeFeatureStatus() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		changeStatusobj = new News.ChangeFeatureNewsStatusEn(driver);
		changeStatusobj.changefeaturestatus();
	}
}
