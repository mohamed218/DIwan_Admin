package NewsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ahmed.excelizer.ExcelReader;

import Pages.HomePage;
import Tests.TestBase;

public class CancelAddingNewsEn extends TestBase {

	HomePage homeobj ; 
	News.CancelAddingNewsEn cancelobj ; 
	
	@DataProvider(name="submitnews")
	public Object[][] newsdata(){
		return ExcelReader.loadTestData(System.getProperty("user.dir") +"/src/test/java/Data/news.xlsx", "Sheet1");
	}

	@Test(priority=1, dataProvider="submitnews")
	public void Newsform(String titleEN , String titleAR , String DescEN , String DescAR) throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		
		cancelobj = new News.CancelAddingNewsEn(driver);
		cancelobj.cancelSubmitNews(titleEN, titleAR, DescEN, DescAR);
	}
}
