package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement usnTB= driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement passTB= driver.findElement(By.name("Pass"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);

		WebElement loginBT= driver.findElement(By.name("login"));
		loginBT.click();
	
		
		
		
		
		
	}

}
