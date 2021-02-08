package Internal_News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class SortingListEn extends PageBase {

	public SortingListEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css=".large-table .datatable-header-cell:nth-child(2) .datatable-header-cell-label")
	WebElement titleColumn ; 
	
	@FindBy(css=".sortable:nth-child(3) .datatable-header-cell-label")
	WebElement TagsColumn ; 
	
	@FindBy(css=".sortable:nth-child(4) .datatable-header-cell-label")
	WebElement UpdatedDateColumn ; 
	
	@FindBy(css=".datatable-header-cell:nth-child(5) .datatable-header-cell-label")
	WebElement StatusColumn ; 
	
	public void sortinglist() throws InterruptedException {
		
		titleColumn.click();
		Thread.sleep(2000);
		titleColumn.click();
		Thread.sleep(2000);
		TagsColumn.click();
		Thread.sleep(2000);
		TagsColumn.click();
		Thread.sleep(2000);
		UpdatedDateColumn.click();
		Thread.sleep(2000);
		UpdatedDateColumn.click();
		Thread.sleep(2000);
		StatusColumn.click();
		Thread.sleep(2000);
		StatusColumn.click();
		Thread.sleep(2000);
	}
}
