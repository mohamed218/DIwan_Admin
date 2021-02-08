package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class CancelDeleteFromListEn extends TestBase {

	HomePage homeobj ;
	Announcements.CancelDeleteFromListEn cancelobj ;
	
	@Test
	public void cancelDelete() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		cancelobj = new Announcements.CancelDeleteFromListEn(driver);
		cancelobj.deleteItem();
	}
}
