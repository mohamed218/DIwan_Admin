package Internal_News_Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingListEn extends TestBase {

	HomePage homeobj ; 
	Internal_News.SortingListEn sortingobj ;
	
	@Test
	public void sortinglist() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.InternalNewsNavigation();
		
		sortingobj = new Internal_News.SortingListEn(driver); 
		sortingobj.sortinglist();
	}
}
