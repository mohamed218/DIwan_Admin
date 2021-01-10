package News;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class EditNewsAr extends PageBase {

	public EditNewsAr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String maincover = "maincover.jpg";
	String imagepath = System.getProperty("user.dir")+"/Uploads/"+ maincover;
	
	@FindBy(xpath="//ijs-badge/div/div")
	WebElement deleteimage ; 
	
	@FindBy(css=".primary-gredient")
	WebElement confirmation ; 
	
	@FindBy(css="#option-43dfdfd0-1137-4e2d-8d4f-47ada9c5ec23 > svg")
	WebElement actionlist ; 
	
	@FindBy(css=".show > .dropdown-item:nth-child(1)")
	WebElement editoption ;
	
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
	
	@FindBy(xpath="//button[contains(.,'نشر')]")
	WebElement submitbtn ;
	 
	
	public void updateNews(String titleEN , String titleAR , String DescEN , String DescAR) throws InterruptedException {
		
		actionlist.click();
		editoption.click();
		titleENtxt.click();
		titleENtxt.clear();
		titleENtxt.sendKeys(titleEN);
		titleARtxt.click();
		titleARtxt.clear();
		titleARtxt.sendKeys(titleAR);
		englishDescTxt.click();
		englishDescTxt.clear();
		englishDescTxt.sendKeys(DescEN);
		arabicDescTxt.click();
		arabicDescTxt.clear();
		arabicDescTxt.sendKeys(DescAR);
		deleteimage.click();
		confirmation.click();
		imageuploader.sendKeys(imagepath);
		Thread.sleep(4000);
		submitbtn.click();
		
		
	}


}
