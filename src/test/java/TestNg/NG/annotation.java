package TestNg.NG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class annotation {
	WebDriver driver;
	
	@BeforeTest
		public void mainMethod()
		{
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
			  driver = new EdgeDriver();
			driver.manage().window().maximize();		
			driver.get("http://tutorialsninja.com/demo/");
			
		}
	
	
	@Test
	public void configLogin()
	{
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("k799.karunakara@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}

	
	@Test
	public void configLogin1()
	{
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Change your password")).isDisplayed());
		
		System.out.println("hxhh");
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}