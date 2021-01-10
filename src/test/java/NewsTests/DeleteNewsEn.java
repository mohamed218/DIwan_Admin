package NewsTests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Tests.TestBase;

public class DeleteNewsEn extends TestBase {
	
	HomePage homeobj ; 
	News.DeleteNewsEn deleteobj ; 
	
	@Test(dependsOnMethods="login")
	public void deleteItem() throws InterruptedException {
		
		homeobj = new HomePage(driver); 
		homeobj.ChangeLanguage();
		homeobj.NewsNavigationEn();
		deleteobj = new News.DeleteNewsEn(driver);
		deleteobj.deleteItem();
	}

}
