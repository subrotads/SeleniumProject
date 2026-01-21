package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weektest {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)","");
		Thread.sleep(500);
		
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		String expectedText = driver.switchTo().alert().getText();
		{
			System.out.println(expectedText);
		}

		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		String ActualTest = "Please enter a valid user name";
		
	if (expectedText.equals(ActualTest)) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[3]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[2]/button")).click();
		Thread.sleep(1000);
		
		
		String expectedtext = driver.switchTo().alert().getText();
		{
			System.out.println(expectedtext);
		}
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		String Actualtest = "Please enter your email ID";
		
		if (expectedtext.equals(Actualtest)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		driver.close();
		
		
		
		
	}
	
}
