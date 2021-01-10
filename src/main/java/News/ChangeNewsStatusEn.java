package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class ChangeNewsStatusEn extends PageBase {

	public ChangeNewsStatusEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".datatable-row-wrapper:nth-child(1) .toggle")
	WebElement togglebtn ; 
	
	public void changestatus() {
		
		togglebtn.click();
	}

}
