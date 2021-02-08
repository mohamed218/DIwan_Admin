package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class EditAnnouncementAr extends PageBase {

	public EditAnnouncementAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-c6b28337-2d55-4401-8a8f-a398d62c9c47 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(1)")
	WebElement editoption ; 
	
	String file = "dummy.pdf";
	String filepath = System.getProperty("user.dir")+"/Uploads/"+ file;
	
	@FindBy(xpath="//textarea")
	WebElement englishdetails ; 
	
	@FindBy(xpath="//div[2]/div[2]/textarea")
	WebElement arabicdetails ; 
	
	@FindBy(xpath="//div[2]/div[2]/div[2]")
	WebElement importancelevel ; 
	
	@FindBy(xpath="//*[@id=\"input\"]")
	WebElement englishuploader ; 
	
	@FindBy(xpath="//div[2]/div[2]/ijs-attachment/div/div/input")
	WebElement arabicuploader ; 
	
	@FindBy(css=".jsr-more")
	WebElement deleteattachment ; 
	
	@FindBy(css=".ijs-text-error")
	WebElement deleteconfirmation ; 
	
	@FindBy(xpath="//button[2]")
	WebElement savebutton ; 
	
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
		deleteattachment.click();
		deleteconfirmation.click();
		//englishuploader.sendKeys(filepath);
		//arabicuploader.sendKeys(filepath);
		savebutton.click();
		
	}

}
