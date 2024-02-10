package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.id("loginAjio"));
		logIn.click();
        Thread.sleep(2000);
        
        WebElement emailId = driver.findElement(By.cssSelector("input[class^='username']"));
        emailId.sendKeys("8668769252");
        Thread.sleep(1000);
        
        WebElement nextBT = driver.findElement(By.cssSelector("input[class^='login-btn']"));
        nextBT.click();
        Thread.sleep(2000);
        driver.close();
        
        
        
	}

}
