package AnnouncementsTests;

import org.testng.annotations.Test;

import Announcements.DeleteFromDetailsAr;
import Pages.HomePage;
import Tests.TestBase;

public class DeleteFromDetailAr extends TestBase {

	HomePage homeobj ; 
	DeleteFromDetailsAr deleteobj ; 
	
	@Test
	public void deleteItem() {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		deleteobj = new DeleteFromDetailsAr(driver);
		deleteobj.deleteitem();
	}
}
