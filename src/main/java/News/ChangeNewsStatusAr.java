package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class ChangeNewsStatusAr extends PageBase {

	public ChangeNewsStatusAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".active .toggle")
	WebElement togglebtn ; 
	
	public void ChangeStatus() {
		
		togglebtn.click();
	}

}
