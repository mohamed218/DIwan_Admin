package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class CancelAddingAnnouncementsAr extends PageBase {

	public CancelAddingAnnouncementsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css=".colored")
	WebElement addbtn ; 
	
	String file = "dummy.pdf";
	String filepath = System.getProperty("user.dir")+"/Uploads/"+ file;
	
	@FindBy(xpath="//textarea")
	WebElement englishdetails ; 
	
	@FindBy(xpath="//div[2]/div[2]/textarea")
	WebElement arabicdetails ; 
	
	@FindBy(xpath="//div[2]/div[2]/div")
	WebElement importancelevel ; 
	
	@FindBy(xpath="//*[@id=\"input\"]")
	WebElement englishuploader ; 
	
	@FindBy(xpath="//div[2]/div[2]/ijs-attachment/div/div/input")
	WebElement arabicuploader ; 
	
	@FindBy(css=".outline")
	WebElement Cancelbtn ;
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void addannouncement(String titleEN , String titleAR) throws InterruptedException {
		
		addbtn.click();
		englishdetails.click();
		englishdetails.sendKeys(titleEN);
		arabicdetails.click();
		arabicdetails.sendKeys(titleAR);
		importancelevel.click();
		englishuploader.sendKeys(filepath);
		arabicuploader.sendKeys(filepath);
		Cancelbtn.click();
		Thread.sleep(2000);
		confirmation.click();
		
	}

}
