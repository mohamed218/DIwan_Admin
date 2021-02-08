package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class CancelDeleteFromListEn extends PageBase {

	public CancelDeleteFromListEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-b50c386d-d2ed-423f-8083-29721240b9f8 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .delete")
	WebElement deleteoption ; 
	
	@FindBy(css=".outline")
	WebElement CancelRequest ; 
	
	public void deleteItem() {
		
		actionlist.click();
		deleteoption.click();
		CancelRequest.click();
	}

}
