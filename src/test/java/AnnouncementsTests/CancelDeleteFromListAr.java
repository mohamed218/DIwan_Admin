package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class CancelDeleteFromListAr extends TestBase {

	HomePage homeobj ; 
	Announcements.CancelDeleteFromListAr cancelobj ; 
	
	@Test
	public void canceldeleterequest() {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		cancelobj = new Announcements.CancelDeleteFromListAr(driver);
		cancelobj.deleteItem();
	}
}
