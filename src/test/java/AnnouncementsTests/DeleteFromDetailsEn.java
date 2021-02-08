package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteFromDetailsEn extends TestBase {

	HomePage homeobj ; 
	Announcements.DeleteFromDetailsEn deleteobj ; 
	
	@Test
	public void deleteitem() {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		deleteobj = new Announcements.DeleteFromDetailsEn(driver);
		deleteobj.deleteitem();
		
	}
}
