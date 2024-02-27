package TestNg.NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeFirefox {
	
	
	@Test
	public void invokeff() {
	
	
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.selenium.dev/");
			
	}
			
			
			

}
