package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteItemEn extends PageBase {

	public DeleteItemEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-a1264a24-3b1b-4340-a57c-ae5417ea8caf > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .delete")
	WebElement deleteoption ; 
	
	@FindBy(css=".primary-gredient")
	WebElement confirmation ; 
	
	public void deleteItem() {
		
		actionlist.click();
		deleteoption.click();
		confirmation.click();
	}

}
