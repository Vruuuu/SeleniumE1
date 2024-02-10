package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver(); //To lauch the Browser 
		driver.manage().window().maximize(); //To maximize the Browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //To add implicit wait
		driver.get("https://www.bewakoof.com/"); //To launch the webapplication
		
		WebElement loginclick = driver.findElement(By.id("loginLink"));
		loginclick.click();
		WebElement clickonEmail = driver.findElement(By.id("web_email_login"));
		clickonEmail.click();
		WebElement enteremail = driver.findElement(By.id("email_input"));
		enteremail.sendKeys("Shatavari");
		WebElement passwordTB = driver.findElement(By.id("mob_password"));
		passwordTB.sendKeys("shatavari@123");
		enteremail.clear();
		Thread.sleep(2);
		passwordTB.clear();
		
	}

}
