package testRunnerPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClassPackage.TestSetupClass;
import pages.GClassHomePage;
import pages.GoogleHomePage;
import pages.SignInPage;

public class TestRunner extends TestSetupClass
{

	@Test()
	public void googleTest() throws Exception {
		driver.get("https://classroom.google.com/");
		Thread.sleep(5000);
		GoogleHomePage goglepage=new GoogleHomePage(driver);
		SignInPage sngpage=new SignInPage(driver);
		GClassHomePage gclasspage=new GClassHomePage(driver);
		goglepage.clickOnSignIn();
		goglepage.clickonGoogleClassroom();
		sngpage.getWindowHandle();
		sngpage.enterEmailId();
		sngpage.enterPassword();
		sngpage.createClassIcon();
		sngpage.clckCheckboxContinue();
		sngpage.createClassFields();
		sngpage.verifyClassName();
		gclasspage.announceTypeSomething();
		gclasspage.scheduleDatendTime();
	}
	
	
}
