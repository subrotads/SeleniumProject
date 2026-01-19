package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		driver.switchTo().defaultContent();
		driver.close();
		
		
/*String testEmail = "subrotadss@rediffmail.com";
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement messageArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("availabiltyMessage")));
		String displayedMessage = messageArea.getText();
		System.out.println("Message displayed: " + displayedMessage);
		boolean emailmatches = displayedMessage.contains(testEmail);
		if (emailmatches) {
			System.out.println("Yes");
		}*/
		
		
	}

}
