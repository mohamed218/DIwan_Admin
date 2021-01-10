package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;


public class TestBase {

	public static WebDriver driver ; 	
	LoginPage loginobj ; 
	
	
	@BeforeSuite
	public void startdriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://40.114.214.132:90/home");
		loginobj = new LoginPage(driver);
		loginobj.usercanlogin("admin", "diwan@gazt");
	}
}