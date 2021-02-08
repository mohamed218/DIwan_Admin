package AnnouncementsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ahmed.excelizer.ExcelReader;

import Pages.HomePage;
import Tests.TestBase;

public class AddAnnouncementEn extends TestBase {
	
	HomePage homeobj ; 
	Announcements.AddAnnouncementEn addobj ; 
	
	@DataProvider(name="submitannouncement")
	public Object[][] newsdata(){
		return ExcelReader.loadTestData(System.getProperty("user.dir") +"/src/test/java/Data/announcements.xlsx", "Sheet1");
	}
	
	@Test(priority=1, dataProvider="submitannouncement")
	public void AddAnnouncement(String titleEN , String titleAR) {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.AnnouncementNavigation();
		
		addobj = new Announcements.AddAnnouncementEn(driver);
		addobj.addannouncement(titleEN, titleAR);
	}

}
