package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(1000);
		
		WebElement usnTextBox= driver.findElement(By.id("email"));
		usnTextBox.sendKeys("email");
		Thread.sleep(1000);
		
		WebElement passTextBox= driver.findElement(By.id("pass"));
		passTextBox.sendKeys("password");
		

		WebElement loginButton= driver.findElement(By.tagName("Button"));
		loginButton.click();
		
		

	}

}
