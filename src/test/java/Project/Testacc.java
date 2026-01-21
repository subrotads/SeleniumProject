package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testacc {
	
	


	public class RediffCreateAccountTest {

	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://register.rediff.com/register/register.php");
	    }

	    @Test
	    public void verifyCreateAccountPageTitle() {
	        String title = driver.getTitle();
	        Assert.assertTrue(title.contains("Rediffmail"));
	    }

	    @Test
	    public void fillCreateAccountForm() {

	        driver.findElement(By.xpath("//input[placeholder='Enter your full name']")).sendKeys("Test User");

	        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("testuser12345");

	        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Test@1234");

	        driver.findElement(By.xpath("//input[@name='confirm_passwd']")).sendKeys("Test@1234");

	        driver.findElement(By.xpath("//input[@name='mobno']")).sendKeys("9999999999");

	        // Select gender (example: male)
	        WebElement maleRadio =
	                driver.findElement(By.xpath("//input[@value='m']"));
	        maleRadio.click();

	        // Select country (India)
	        driver.findElement(By.id("country")).sendKeys("India");

	        // Note: Not clicking Create Account to avoid real submission
	    }

	    
	}


}
