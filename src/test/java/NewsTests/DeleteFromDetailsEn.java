package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFromDetailsEn extends TestBase {

	HomePage homeobj ; 
	News.DeleteFromDetailsEn deleteobj ;
	
	@Test
	public void deleteitem() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		
		deleteobj = new News.DeleteFromDetailsEn(driver);
		deleteobj.deleteitem();
	}
}
