package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smartbazar {
	
	public static void main(String [] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.smartbazaar.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//*[@id='brave_popup_40336__step__0']/div[1]/div[1]/div/div/div[1]/div/div")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[3]/ul/li[3]/a/i")).click();
				
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("rice");
	}

}



/*String expectedEmail = "subrotadss";
WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
emailInputField.sendKeys(expectedEmail);

WebElement checkButton = driver.findElement(By.xpath("//input[@value='Check availability']"));
checkButton.click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Check availability']")));
String actualMessage = successMessageElement.getText();

if (actualMessage.contains(expectedEmail)) {
	System.out.println("ok");
}*/
