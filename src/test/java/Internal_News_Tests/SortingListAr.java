package Internal_News_Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingListAr extends TestBase {

	HomePage homeobj ; 
	Internal_News.SortingListAr sortingobj ; 
	
	@Test
	public void sortinglist() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.InternalNewsNavigation();
	
		sortingobj = new Internal_News.SortingListAr(driver);
		sortingobj.sortinglist();
	}
	
}
