package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class PaginationEn extends TestBase {

	HomePage homeobj ;
	Announcements.PaginationEn paginationobj ; 
	
	@Test
	public void testPagination() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		paginationobj = new Announcements.PaginationEn(driver);
		paginationobj.pagination();
	}
}
