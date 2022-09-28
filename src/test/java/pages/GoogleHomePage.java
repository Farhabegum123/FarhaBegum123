package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	 public static WebDriver driver;
		
	public GoogleHomePage(WebDriver rdriver) {
		 this.driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Go']")
	WebElement btngo;
	
	@FindBy(xpath="//span[text()='Stay here']")
	WebElement btnStay;
	
	@FindBy(xpath="(//a[contains(@class,'header__menu')])[1]")
	WebElement logobtn;
	
	@FindBy(xpath="(//span[text()='Google Classroom'])[1]")
	//@FindBy(xpath="(//span[contains(@class,'gfe-header')])[1]")
	WebElement gogleClssLnk;
	
	 
	
	  public void clickOnSignIn() throws Exception {
		 
		  btngo.click();
		Thread.sleep(5000);
		  logobtn.click();
			Thread.sleep(2000);
		  
	   }
	  
	  public void clickonGoogleClassroom()  throws Exception{
		  Actions a=new Actions(driver);
		  a.doubleClick(gogleClssLnk).build().perform();
		 // a.moveToElement(gogleClssLnk).build().perform();
			Thread.sleep(5000);

	  }
	  
	  
}
