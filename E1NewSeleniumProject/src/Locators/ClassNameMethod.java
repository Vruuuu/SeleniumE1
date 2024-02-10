package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/Username.html");//To launch the web application
		
		Thread.sleep(2000);
		
		WebElement passTextBox= driver.findElement(By.className("pwd-txt"));
		
		passTextBox.sendKeys("Password@123");
		

	}

}
