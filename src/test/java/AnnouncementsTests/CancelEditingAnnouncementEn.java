package AnnouncementsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ahmed.excelizer.ExcelReader;

import Pages.HomePage;
import Tests.TestBase;

public class CancelEditingAnnouncementEn extends TestBase {

	HomePage homeobj ; 
	Announcements.CancelEditingAnnouncementEn cancelobj ; 
	
	@DataProvider(name="submitannouncement")
	public Object[][] newsdata(){
		return ExcelReader.loadTestData(System.getProperty("user.dir") +"/src/test/java/Data/announcements.xlsx", "Sheet1");
	}
	
	@Test(priority=1, dataProvider="submitannouncement")
	public void canceledit(String titleAR, String titleEN) {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		cancelobj = new Announcements.CancelEditingAnnouncementEn(driver);
		cancelobj.editAnnouncement(titleEN, titleAR);
	}
}
