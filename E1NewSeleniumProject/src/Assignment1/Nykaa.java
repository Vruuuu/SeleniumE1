package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		Thread.sleep(1000);
		
		WebElement signIn = driver.findElement(By.cssSelector("button[aria-label^='Kebab ']"));
		signIn.click();
		Thread.sleep(1000);
		
		
		WebElement signInbt = driver.findElement(By.cssSelector("button[kind='secondary']"));
		signInbt.click();
		
	}

}
