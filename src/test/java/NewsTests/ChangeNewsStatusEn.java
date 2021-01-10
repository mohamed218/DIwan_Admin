package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class ChangeNewsStatusEn extends TestBase {
	
	HomePage homeobj ;
	News.ChangeNewsStatusEn statusobj ; 
	
	@Test(dependsOnMethods="login")
	public void changestatus() {
		
		homeobj = new HomePage(driver); 
		homeobj.NewsNavigation();
		homeobj.ChangeLanguage();
		statusobj = new News.ChangeNewsStatusEn(driver); 
		statusobj.changestatus(); 
	}

}
