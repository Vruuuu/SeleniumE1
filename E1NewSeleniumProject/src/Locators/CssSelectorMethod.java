package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To lauch chormeBrowser
		
		driver.manage().window().maximize();//To maximize the browser
		
		driver.get("https://www.instagram.com/");//To launch the webapplication
		
		Thread.sleep(2000);
		
		//To find or locate username textbox and pass the inputs
		//WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		usnTB.sendKeys("Qspider");
		Thread.sleep(2000);	
		
		//To find or locate password textBox and pass the inputs
		//WebElement passTB=driver.findElement(By.cssSelector("input[type='password']"));
		WebElement passTB=driver.findElement(By.cssSelector("input[type$='word']"));
	    passTB.sendKeys("Qspiders@123");
		Thread.sleep(2000);
		
		//To click on login button
		//WebElement loginButton=driver.findElement(By.cssSelector("button[type='submit']"));
		WebElement loginButton=driver.findElement(By.cssSelector("button[type*='bm']"));
		loginButton.click();
		
		
		}

}
