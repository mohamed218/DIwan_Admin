package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DeleteFeatureNewsAr extends PageBase {

	public DeleteFeatureNewsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".Feature")
	WebElement Featurebtn ; 
	
	@FindBy(css="#option-3da4d932-e4fc-4ad3-ad6b-73bf531d14af > svg")
	WebElement actionlist ; 
	
	@FindBy(xpath="//button[3]")
	WebElement deleteoption ; 
	
	@FindBy(css=".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void deleteFeatureNews() {
		
		Featurebtn.click();
		actionlist.click();
		deleteoption.click();
		confirmation.click();
	}

}
