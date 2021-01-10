package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class UnPinFeatureNewsEn extends PageBase {

	public UnPinFeatureNewsEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".Feature")
	WebElement Featurebtn ; 
	
	@FindBy(css = "#option-d4390a0c-963b-4467-b24b-4dd7a7df7df7 > svg")
	WebElement acionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(2)")
	WebElement UnpinOption ; 
	
	@FindBy(css = ".confirmation-btn:nth-child(2)")
	WebElement confirmation ; 
	
	public void unpinfeature() {
		
		Featurebtn.click();
		acionlist.click();
		UnpinOption.click();
		confirmation.click();
	}


}
