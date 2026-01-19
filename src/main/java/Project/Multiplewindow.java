package Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)","");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[@class='tnc']/a[1]")).click();
		Thread.sleep(2000);
	
		String parentWindow = driver.getWindowHandle();
		Set<String>windows = driver.getWindowHandles();
		//Iterator<String> itr = windows.iterator();
		
		for(String window: windows) {
			if(!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/input")).click();
				break;
				}
		}
		
		driver.switchTo().window(parentWindow);
		js.executeScript("window.scrollBy(0,-5000)","");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		Thread.sleep(2000);
		
		
		
	}

}
