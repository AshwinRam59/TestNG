package TestNg.NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertionTest {

    @Test
    public void softAssertionTest() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Orange";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatch");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        // Perform more assertions if needed

        softAssert.assertAll();
        driver.close();
    }
}
