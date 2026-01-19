package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Subrota Das");
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']")).sendKeys("subrotadss");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		Thread.sleep(1000);
		
		String actualdata = driver.findElement(By.className("msgSucc")).getText();
		String expecteddata = "Yippie! The ID you've chosen is available.";
		if (actualdata.equals(expecteddata))  {
			System.out.println("Result Match");
		} else {
			System.out.println("Result Not Matched ");
		}
	}

}
