package Project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Datap {
	
	@DataProvider(name = "browser")
	public Object[] dpMethod()throws Exception {
		return new Object[][] { { "chrome", "Gmail" }, {"firefox", "gmail" } };
	} 
	
	@Test(dataProvider = "browser")
	public static void smaple(String choice, String data) throws Exception {
		WebDriver driver = null;
		if (choice.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (choice.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else 
			System.out.println("worng choice");
			driver.navigate().to("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement link = driver.findElement(By.className("gb_W"));
			
			Assert.assertEquals(link.getText(), data);
	}

}
