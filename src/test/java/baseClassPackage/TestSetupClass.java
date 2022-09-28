package baseClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSetupClass {
	
	public static WebDriver driver;
	   
	 @BeforeSuite
	 public void openBrowser() {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\farhana.begum\\pip_workSpace\\com.AutomationFrameworkAssesmnt\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().window();
	 }
	 
	 

	 @AfterSuite
	 public void closeBrowser() {
		// driver.close();
	 }

}
