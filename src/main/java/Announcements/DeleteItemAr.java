package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteItemAr extends PageBase {

	public DeleteItemAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#option-b1d82624-94d8-4047-8b4f-ce1c8f7c8ff6 > svg")
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
