package TakesScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/loginbutton.jpg");
		
		
		
	
		}

}
