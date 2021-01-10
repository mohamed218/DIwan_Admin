package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class PaginationEn extends PageBase {

	public PaginationEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css=".page-item:nth-child(3) > .ijs-text-light")
	WebElement Nextbtn ; 
	
	@FindBy(css=".pagination-btn:nth-child(1) > .ijs-text-light")
	WebElement backbtn ; 
	
	@FindBy(css=".page-item:nth-child(2) > .ijs-text-light")
	WebElement randompage ; 
	
	public void pagination() throws InterruptedException {
		
		Thread.sleep(2000);
		Nextbtn.click();
		Thread.sleep(5000);
		backbtn.click();
		Thread.sleep(2000);
		randompage.click();
	}
}
