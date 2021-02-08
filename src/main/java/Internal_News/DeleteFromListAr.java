package Internal_News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteFromListAr extends PageBase {

	public DeleteFromListAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-ff106d7e-7ef7-4e3f-8449-cf75d0880fc4 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".delete:nth-child(2)")
	WebElement deleteoption ;
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void deleterecord() {
		
		actionlist.click();
		deleteoption.click();
		confirmation.click();
	}
}
