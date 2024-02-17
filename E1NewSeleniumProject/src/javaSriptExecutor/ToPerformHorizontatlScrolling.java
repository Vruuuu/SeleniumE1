package javaSriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontatlScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//To scroll right side
		js.executeScript("window.scrollBy(500,0)");
		
		Thread.sleep(2000);
		
		//To scroll left side
		js.executeScript("window.scrollBy(-600,0)");
		
		
		
		
		
		
		 

	}

}
