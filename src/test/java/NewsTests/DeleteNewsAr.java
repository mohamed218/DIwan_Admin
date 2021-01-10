package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteNewsAr extends TestBase {
	
	HomePage homeobj ; 
	News.DeleteNewsAr deleteobj ; 
	
	@Test(dependsOnMethods="login")
	public void deleteRecord() {
		
		homeobj = new HomePage(driver); 
		homeobj.NewsNavigation();
		deleteobj = new News.DeleteNewsAr(driver);
		deleteobj.deleteItem();
	}

}
