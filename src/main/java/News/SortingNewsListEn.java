package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class SortingNewsListEn extends PageBase {

	public SortingNewsListEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css=".visible .datatable-header-cell:nth-child(2) .datatable-header-cell-label")
	WebElement titlecolumn ; 
	
	@FindBy(css=".sortable:nth-child(4) .datatable-header-cell-label")
	WebElement updatedDateColumn ; 
	
	@FindBy(css=".datatable-header-cell:nth-child(5) .datatable-header-cell-label")
	WebElement statusColumn ; 
	
	public void sortinglist() throws InterruptedException {
		
		titlecolumn.click();
		Thread.sleep(2000);
		titlecolumn.click();
		Thread.sleep(2000);
		updatedDateColumn.click();
		Thread.sleep(2000);
		updatedDateColumn.click();
		Thread.sleep(2000);
		statusColumn.click();
		Thread.sleep(2000);
		statusColumn.click();
	}

}
