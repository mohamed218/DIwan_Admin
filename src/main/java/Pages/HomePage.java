package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Change app language 
	
	@FindBy(css=".nav-item:nth-child(1) svg")
	WebElement LanguageButton ;
	
	public void ChangeLanguage() {
		
		LanguageButton.click();
	}
	
	//News navigation in arabic language 
	@FindBy(xpath="/html/body/app-root/div[1]/ijs-layout/div/main/div/section/div/ijs-home/div/div/div[2]/div/div/div/div[1]/gzt-main-navigation/div/div[2]")
	WebElement NewsCardArabic ; 
	
	public void NewsNavigation() {
		
		NewsCardArabic.click();
	}
	//News navigation in english 
	@FindBy(xpath="/html/body/app-root/div[1]/ijs-layout/div/main/div/section/div/ijs-home/div/div/div[2]/div/div/div/div[1]/gzt-main-navigation/div/div[2]")
	WebElement NewsCardEn ; 
	
	public void NewsNavigationEn() {
		
		NewsCardEn.click();
	}
	
	// Announcements nanigation in arabic language
	@FindBy(css=".HomeListItem:nth-child(2) .main-nav-container")
	WebElement AnnouncementCardArabic ;
	
	public void AnnouncementNavigation() {
		
		AnnouncementCardArabic.click();
	}
	
	
	//internal news navigation 
	@FindBy(css=".HomeListItem:nth-child(3) .main-nav-container")
	WebElement internalNewsCard ; 
	
	public void InternalNewsNavigation() {
		
		internalNewsCard.click();
	}
	
	
	

	
}
