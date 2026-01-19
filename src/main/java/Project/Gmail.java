package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String [] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		}
	
}
