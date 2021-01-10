package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteFromDetailsEn extends PageBase {

	public DeleteFromDetailsEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#option-6a27d099-ed27-4ab4-8c3f-a36d6af70a7b > svg")
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
