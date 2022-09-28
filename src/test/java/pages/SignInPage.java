package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SignInPage {
	
	 public static WebDriver driver;
		
		public SignInPage(WebDriver driver) {
			 this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="identifier")
		WebElement emailId;
		
		@FindBy(xpath="//*[text()='Next']")
		WebElement emailNext;

		//@FindBy(name="Passwd")
		@FindBy(xpath="//*[@name='Passwd']")
		WebElement psdfld;
		
		@FindBy(xpath="//*[text()='Next']")
		WebElement pswrdNext;

		//@FindBy(xpath="(//span[@class='VfPpkd-kBDsod'])[2]")
		@FindBy(xpath="(//*[@class=' NMm5M'])[2]")
		WebElement plusIcon;
		
		//@FindBy(xpath="//*[text()='Create class']")
		@FindBy(xpath="(//*[text()='Create class'])[2]")
		WebElement createClass;

		@FindBy(xpath="//*[contains(text(),'understand the above')]")
		WebElement clckcheckbox;
		
		@FindBy(xpath="(//*[text()='Continue'])[2]")
		WebElement btnContinue;
		
		//@FindBy(xpath="//span[contains(text(),'Class name')]")
	//@FindBy(xpath="//input[@id='c17']")
		@FindBy(xpath="(//input[@type='text'])[1]")
		WebElement fieldClassname;
		
		//@FindBy(xpath="//span[contains(text(),'Section')]")
		//@FindBy(xpath="//input[@id='c19']")
		@FindBy(xpath="(//input[@type='text'])[2]")
		WebElement fieldsection;
		
		//@FindBy(xpath="//span[contains(text(),'Subject')]")
	@FindBy(xpath="(//input[@type='text'])[3]")
	//	@FindBy(xpath="//input[@id='c22']")
		WebElement fldSubject;
		
		//@FindBy(xpath="//input[@id='c24']")
		//@FindBy(xpath="(//input[@type='text'])[3]")
	@FindBy(xpath="(//span[contains(text(),'Create')])[4]")
	WebElement btnCreate;
		
		//@FindBy(xpath="//span[contains(text(),'Room')]")
		@FindBy(xpath="(//input[@type='text'])[4]")
		WebElement fldRoom;
		
		public void enterEmailId() throws Exception {
			emailId.sendKeys("farhabegum666@gmail.com");
			Thread.sleep(1000);
			emailNext.click();
			Thread.sleep(1000);
		}
		
		public void enterPassword()throws Exception {
			Thread.sleep(1000);
			psdfld.sendKeys("Afsha@786");
			Thread.sleep(5000);
			pswrdNext.click();
		}
		
	   public void getWindowHandle() throws Exception {
			Set<String> windowsIds=driver.getWindowHandles();
           Iterator<String> it=windowsIds.iterator();
          String parentId= it.next();
          String childId=it.next();
          driver.switchTo().window(parentId);
          System.out.println("Parent window title: "+driver.getTitle());    
          driver.switchTo().window(childId);
          System.out.println("Child window title: "+driver.getTitle());
             driver.switchTo().window(childId);
             Thread.sleep(3000);
	   }
	   
	   public void createClassIcon() throws Exception {
		   Thread.sleep(3000);
		//	 plusIcon.click();
		 //  Actions a=new Actions(driver);
		// a.doubleClick(plusIcon).build().perform();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", createClass);
			   Thread.sleep(5000);
			   
	   }
	   public void clckCheckboxContinue() throws Exception{
		     Thread.sleep(1000);
			   //Actions a=new Actions(driver);
		     //a.doubleClick(clckcheckbox).build().perform();
			  // clckcheckbox.click();
	       boolean isElmntDisabled=driver.findElement(By.xpath("(//*[text()='Continue'])[2]")).isEnabled();
	       Assert.assertTrue(isElmntDisabled);
	      // assertFalse(isElmntDisabled);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", clckcheckbox);
			  boolean isElmntEnabled=driver.findElement(By.xpath("(//*[text()='Continue'])[2]")).isEnabled();
		       Assert.assertTrue(isElmntEnabled);
			   Thread.sleep(3000);
			 btnContinue.click();
	   }
	  
	   public void createClassFields() throws Exception{
		   fieldClassname.sendKeys("ABCDS");
		   Thread.sleep(1000);
		   fieldsection.sendKeys("ABCDS DNBCK");
		   Thread.sleep(1000);
		   fldSubject.sendKeys("dabdja");
		   Thread.sleep(1000);
		   fldRoom.sendKeys("5B");
		   Thread.sleep(1000);
		   btnCreate.click();
		   Thread.sleep(5000);

	   }
	   
	   public void verifyClassName() throws Exception{
		   Thread.sleep(5000);
		  // String actualText="ABCDS";
		   //System.out.println("Text on the Page is: "+actualText);
		   String title=driver.findElement(By.xpath("//h1[contains(@class,'tNGpbb')]")).getText();
		   System.out.println(title);
		   boolean isElmtDisplayeed=driver.findElement(By.xpath("//h1[contains(@class,'tNGpbb')]")).isDisplayed();
	       Assert.assertTrue(isElmtDisplayeed);
	   }
}
