package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class PinNewsEn extends PageBase {

	public PinNewsEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#option-43dfdfd0-1137-4e2d-8d4f-47ada9c5ec23 use")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(2)")
	WebElement Pinoption ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void PinItem() throws InterruptedException {
		
		actionlist.click();
		Pinoption.click();
		confirmation.click();
		Thread.sleep(2000);
		actionlist.click();
		Pinoption.click();
		confirmation.click();
	}

}
