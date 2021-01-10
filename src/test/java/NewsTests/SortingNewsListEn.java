package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingNewsListEn extends TestBase {

	HomePage homeobj ; 
	News.SortingNewsListEn sortingobj ; 
	
	@Test
	public void sortinglist () throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		
		sortingobj = new News.SortingNewsListEn(driver);
		sortingobj.sortinglist();
	}
}
