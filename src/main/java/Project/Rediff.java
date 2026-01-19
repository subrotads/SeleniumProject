package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	
	public static void main(String [] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-box-input")).sendKeys("perfumes",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("sort-selected")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='content_wrapper']/div[7]/div[5]/div[3]/div[1]/div/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
		
				
	}

}
