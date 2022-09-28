package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GClassHomePage 
{
	 public static WebDriver driver;
		
		public GClassHomePage(WebDriver rdriver) {
			 this.driver=rdriver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//div[contains(text(),'Announce')]")
		WebElement lnkAnnouceClasss;
		
		//@FindBy(xpath="(//div[contains(text(),'Announce')])[3]")
		@FindBy(xpath="//div[contains(@class,'cnOaDb ')]")
		WebElement txtAnnouceClasss;
		
		@FindBy(xpath="//div[@id='ow131']")
		WebElement btpostdropdown;
		
		@FindBy(xpath="//div[text()='Schedule']")
		WebElement btnSchedule;
		
		@FindBy(xpath="//span[text()='']")
		WebElement btnforClander;
		
		@FindBy(xpath="//button[@title='Next month']")
		WebElement btnNxtMont;
		
		@FindBy(xpath="//tbody[@role='grid']/tr[4]/td[7]")
		WebElement slectDate;
		
		@FindBy(xpath="//input[@placeholder='Scheduled time']")
		WebElement slectTime;
		
		@FindBy(xpath="(//span[text()='Schedule'])[2]")
		WebElement slectSchedulebtn;
		
		public void announceTypeSomething() throws Exception {
			lnkAnnouceClasss.click();
			Thread.sleep(2000);
			//JavascriptExecutor js = (JavascriptExecutor)driver;
		//	js.executeScript(“arguments[0].value=’hi Team Hope you are doing well ’;”, txtAnnouceClasss);
			//txtAnnouceClasss.sendKeys("hi Team, Hope you are doing well");
			Thread.sleep(2000);
			btpostdropdown.click();
			Thread.sleep(1000);
			btnSchedule.click();
			Thread.sleep(2000);	
		}
		
		public void scheduleDatendTime() throws Exception {
			btnforClander.click();
			Thread.sleep(2000);
			btnNxtMont.click();
			Thread.sleep(2000);
			slectDate.click();
			Thread.sleep(2000);
			slectTime.click();
			Thread.sleep(2000);
			slectSchedulebtn.click();
			
		}
		
		
		


}
