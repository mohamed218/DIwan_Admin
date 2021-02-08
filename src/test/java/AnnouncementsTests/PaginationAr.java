package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class PaginationAr extends TestBase {
	
	HomePage homeobj ; 
	Announcements.PaginationAr paginationobj ; 
	
	@Test
	public void testPagination() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		paginationobj = new Announcements.PaginationAr(driver);
		paginationobj.pagination();
	}

}
