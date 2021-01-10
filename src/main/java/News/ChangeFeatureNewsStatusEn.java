package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class ChangeFeatureNewsStatusEn extends PageBase {

	public ChangeFeatureNewsStatusEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".Feature")
	WebElement Featurebtn ; 
	
	@FindBy(css=".toggle")
	WebElement togglebtn ; 
	
	public void changefeaturestatus() {
		
		Featurebtn.click();
		togglebtn.click();
	}

}
