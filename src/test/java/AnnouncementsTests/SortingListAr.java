package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingListAr extends TestBase {

	HomePage homeobj ; 
	Announcements.SortingListAr sortingobj ; 
	
	@Test
	public void sortinglist() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		sortingobj = new Announcements.SortingListAr(driver);
		sortingobj.SortingList();
	}
}
