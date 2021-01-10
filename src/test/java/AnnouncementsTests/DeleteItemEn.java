package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteItemEn extends TestBase {

	HomePage homeobj ; 
	Announcements.DeleteItemEn deleteobj ;
	
	@Test
	public void DeleteItem() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		deleteobj = new Announcements.DeleteItemEn(driver);
		deleteobj.deleteItem();
	}
}
