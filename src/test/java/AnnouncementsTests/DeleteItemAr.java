package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteItemAr extends TestBase {
	
	HomePage homeobj ; 
	Announcements.DeleteItemAr deleteobj ;
	
	@Test
	public void deleteitem() {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		deleteobj = new Announcements.DeleteItemAr(driver);
		deleteobj.deleteItem();
	}

}
