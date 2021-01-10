package NewsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ahmed.excelizer.ExcelReader;

import Pages.HomePage;
import Tests.TestBase;

public class CancelEditingNewsAr extends TestBase {

	HomePage homeobj ; 
	News.CancelEditingNewsAr cancelobj ; 
	
	@DataProvider(name="submitnews")
	public Object[][] newsdata(){
		return ExcelReader.loadTestData(System.getProperty("user.dir") +"/src/test/java/Data/news.xlsx", "Sheet1");
	}

	@Test(priority=1, dataProvider="submitnews")
	public void Newsform(String titleEN , String titleAR , String DescEN , String DescAR) throws InterruptedException {
		
		homeobj = new HomePage(driver);
		homeobj.NewsNavigation();
		
		cancelobj = new News.CancelEditingNewsAr(driver);
		cancelobj.updateNews(titleEN, titleAR, DescEN, DescAR);
	}
}
