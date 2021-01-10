package Announcements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class SortingListAr extends PageBase {

	public SortingListAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".visible .datatable-header-cell:nth-child(1) .datatable-header-cell-label")
	WebElement BodyColumn ; 
	
	@FindBy(css=".visible .datatable-header-cell:nth-child(2) .datatable-header-cell-label")
	WebElement DateColumn ; 
	
	@FindBy(css=".visible .datatable-header-cell:nth-child(3) .datatable-header-cell-label")
	WebElement CreatedByColumn ; 
	
	@FindBy(css=".visible .datatable-header-cell:nth-child(4) .datatable-header-cell-label")
	WebElement ImportanceColumn ; 
	
	public void SortingList() throws InterruptedException {
		
		BodyColumn.click();
		Thread.sleep(2000);
		BodyColumn.click();
		Thread.sleep(2000);
		DateColumn.click();
		Thread.sleep(2000);
		DateColumn.click();
		Thread.sleep(2000);
		CreatedByColumn.click();
		Thread.sleep(2000);
		CreatedByColumn.click();
		Thread.sleep(2000);
		ImportanceColumn.click();
		Thread.sleep(2000);
		ImportanceColumn.click();
		Thread.sleep(2000);
	}

}
