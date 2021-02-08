package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class CancelEditingAnnouncementEn extends PageBase {

	public CancelEditingAnnouncementEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-0b66e461-79f0-4211-aabe-1fc851168a1c > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(1)")
	WebElement editoption ;
	
	String file = "dummy.pdf";
	String filepath = System.getProperty("user.dir")+"/Uploads/"+ file;
	
	@FindBy(xpath="//textarea")
	WebElement englishdetails ; 
	
	@FindBy(xpath="//div[2]/div[2]/textarea")
	WebElement arabicdetails ; 
	
	@FindBy(xpath="//div[2]/div[3]")
	WebElement importancelevel ; 
	
	@FindBy(xpath="//*[@id=\"input\"]")
	WebElement englishuploader ; 
	
	@FindBy(xpath="//div[2]/div[2]/ijs-attachment/div/div/input")
	WebElement arabicuploader ; 

	@FindBy(css=".outline")
	WebElement Cancelbtn ;
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
public void editAnnouncement(String titleEN , String titleAR) {
		
		actionlist.click();
		editoption.click();
		englishdetails.click();
		englishdetails.clear();
		englishdetails.sendKeys(titleEN);
		arabicdetails.click();
		arabicdetails.clear();
		arabicdetails.sendKeys(titleAR);
		importancelevel.click();
		//englishuploader.sendKeys(filepath);
		//arabicuploader.sendKeys(filepath);
		Cancelbtn.click();
		confirmation.click();
		
	}
}
