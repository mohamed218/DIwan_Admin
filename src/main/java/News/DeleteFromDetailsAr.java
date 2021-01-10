package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteFromDetailsAr extends PageBase {

	public DeleteFromDetailsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#option-43dfdfd0-1137-4e2d-8d4f-47ada9c5ec23 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(1)")
	WebElement editoption ;
	
	@FindBy(css=".delete-btn")
	WebElement deletebtn ; 
	
	@FindBy(css=".primary-gredient")
	WebElement deleteconfirmation ;
	
	public void deleteitem() {
		
		actionlist.click();
		editoption.click();
		deletebtn.click();
		deleteconfirmation.click();
	}

}
