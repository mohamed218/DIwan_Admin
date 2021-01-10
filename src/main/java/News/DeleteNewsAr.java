package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteNewsAr extends PageBase {

	public DeleteNewsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#option-37eb912b-36eb-4f00-ac43-608ba3945194 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .delete")
	WebElement deleteoption ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement Confirmation ; 
	
	public void deleteItem() {
		
		actionlist.click();
		deleteoption.click();
		Confirmation.click();
	}

}
