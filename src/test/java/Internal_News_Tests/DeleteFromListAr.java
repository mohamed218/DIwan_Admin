package Internal_News_Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFromListAr extends TestBase {

	HomePage homeobj ; 
	Internal_News.DeleteFromListAr deleteobj ; 
	
	@Test
	public void sortinglist() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.InternalNewsNavigation();
		
		deleteobj = new Internal_News.DeleteFromListAr(driver);
		deleteobj.deleterecord();
	
		
	}
}
