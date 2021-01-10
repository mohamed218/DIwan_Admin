package AnnouncementsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class SortingListEn extends TestBase {

	HomePage homeobj ; 
	Announcements.SortingListEn sortingobj ; 
	
	@Test
	public void sortinglist() throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		sortingobj = new Announcements.SortingListEn(driver);
		sortingobj.SortingList();
	}

}
