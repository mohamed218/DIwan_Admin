package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class PaginationAr extends TestBase {

	HomePage homeobj ; 
	News.PaginationAr paginationobj ; 
	
	@Test
	public void pagination() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		paginationobj = new News.PaginationAr(driver);
		paginationobj.pagination(); 
	}
	 
}
