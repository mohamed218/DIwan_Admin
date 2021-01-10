package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class ChangeNewsStatusAr extends TestBase {

	HomePage homeobj ; 
	News.ChangeNewsStatusAr statusobj ; 
	
	@Test(priority=2)
	public void changestatus() {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		statusobj = new News.ChangeNewsStatusAr(driver);
		statusobj.ChangeStatus();
	}
}
