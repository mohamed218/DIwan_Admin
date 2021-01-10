package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class PinNewsAr extends PageBase {

	public PinNewsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\'option-43dfdfd0-1137-4e2d-8d4f-47ada9c5ec23\']")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(2)")
	WebElement pinoption ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void PinItem() throws InterruptedException {
		
		actionlist.click();
		pinoption.click();
		confirmation.click();
		Thread.sleep(2000);
		actionlist.click();
		pinoption.click();
		confirmation.click();
	}

}
