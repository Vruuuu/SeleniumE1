package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("HP Laptops");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//To click on Brand
		//if you store the address sometimes that page will be refresh and give the exeption
		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		 
		
	}

}
