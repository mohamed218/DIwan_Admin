package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteNewsEn extends PageBase {

	public DeleteNewsEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="option-3d786002-45cf-4038-a934-aa7157391da9")
	WebElement Actionlist ; 
	
	@FindBy(css=".show > .delete")
	WebElement deleteoption ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void deleteItem() {
		
		Actionlist.click();
		deleteoption.click();
		confirmation.click();
	}

}
