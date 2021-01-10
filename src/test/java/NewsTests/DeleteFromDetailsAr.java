package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFromDetailsAr extends TestBase {

	HomePage homeobj ; 
	News.DeleteFromDetailsAr deleteobj ; 
	
	@Test
	public void deletefromdetails() {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		deleteobj = new News.DeleteFromDetailsAr(driver);
		deleteobj.deleteitem();
	}
}
