package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class CancelAddingNewsEn extends PageBase {

	public CancelAddingNewsEn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String maincover = "maincover.jpg";
	String imagepath = System.getProperty("user.dir")+"/Uploads/"+ maincover;
	
	@FindBy(xpath="//button[contains(.,' News')]")
	WebElement addbutton ;
	
	@FindBy(css=".toggle")
	WebElement itemStatus ; 
	
	@FindBy(css=".solid-light")
	WebElement pinItem ; 
	
	@FindBy(css=".primary-gredient")
	WebElement confirmation ; 
	
	@FindBy(id="articleNameEn")
	WebElement titleENtxt ; 
	
	@FindBy(id="articleNameAr")
	WebElement titleARtxt ;
	
	@FindBy(xpath="//quill-editor/div[2]/div")
	WebElement englishDescTxt ;
	
	@FindBy(xpath="//div[2]/div/div[2]/ijs-rich-text/quill-editor/div[2]/div")
	WebElement arabicDescTxt ; 
	
	@FindBy(id="input")
	WebElement imageuploader ;
	
	@FindBy(xpath="//button[contains(.,'Cancel')]")
	WebElement cancel ;
	
	@FindBy(xpath="//button[contains(.,'Continue')]")
	WebElement cancelconfirmation ; 
	 
	
	public void cancelSubmitNews(String titleEN , String titleAR , String DescEN , String DescAR) throws InterruptedException {
		
		addbutton.click();
		itemStatus.click();
		pinItem.click();
		confirmation.click();
		titleENtxt.click();
		titleENtxt.sendKeys(titleEN);
		titleARtxt.click();
		titleARtxt.sendKeys(titleAR);
		englishDescTxt.click();
		englishDescTxt.sendKeys(DescEN);
		arabicDescTxt.click();
		arabicDescTxt.sendKeys(DescAR);
		imageuploader.sendKeys(imagepath);
		Thread.sleep(7000);
		cancel.click();
		confirmation.click();
		
		
	}

}
