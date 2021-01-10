package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class PaginationEn extends TestBase {

	HomePage homeobj ; 
	News.PaginationEn paginationobj ; 
	
	@Test
	public void pagination() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		
		paginationobj = new News.PaginationEn(driver);
		paginationobj.pagination();
		
	}
}
