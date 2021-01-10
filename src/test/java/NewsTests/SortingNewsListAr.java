package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingNewsListAr extends TestBase {

	HomePage homeobj ; 
	News.SortingNewsListAr sortingobj ; 
	
	@Test
	public void sortingorder() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		sortingobj = new News.SortingNewsListAr(driver);
		sortingobj.sortinglist();
		
	}
}
