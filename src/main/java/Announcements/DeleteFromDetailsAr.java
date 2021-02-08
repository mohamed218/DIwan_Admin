package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteFromDetailsAr extends PageBase {

	public DeleteFromDetailsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#option-c6b28337-2d55-4401-8a8f-a398d62c9c47 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(1)")
	WebElement editoption ; 
	
	@FindBy(xpath="//ijs-add-edit-announcements/div/div[2]")
	WebElement deleteicon ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ;
	
	public void deleteitem() {
		
		actionlist.click();
		editoption.click();
		deleteicon.click();
		confirmation.click();
	}
}
