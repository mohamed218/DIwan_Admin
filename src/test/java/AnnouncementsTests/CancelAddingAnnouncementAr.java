package AnnouncementsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ahmed.excelizer.ExcelReader;

import Announcements.CancelAddingAnnouncementsAr;
import Pages.HomePage;
import Tests.TestBase;

public class CancelAddingAnnouncementAr extends TestBase {
	
	HomePage homeobj ; 
	CancelAddingAnnouncementsAr cancelobj ;
	
	@DataProvider(name="submitannouncement")
	public Object[][] newsdata(){
		return ExcelReader.loadTestData(System.getProperty("user.dir") +"/src/test/java/Data/announcements.xlsx", "Sheet1");
	}
	
	@Test(priority=1, dataProvider="submitannouncement")
	public void canceladding(String titleEN , String titleAR) throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.AnnouncementNavigation();
		
		cancelobj = new CancelAddingAnnouncementsAr(driver);
		cancelobj.addannouncement(titleEN, titleAR);
	}
}
