package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver(); //To lauch the WebBrowser
		driver.manage().window().maximize(); //To maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //To add implicit wait
		driver.get("https://www.bewakoof.com/");//To launch the WebApplication
		
		WebElement clickonlogin = driver.findElement(By.id("loginLink")); //To find the webelement using id locator
		clickonlogin.click(); //To click on loignLink
		
		WebElement clickonEmail = driver.findElement(By.id("web_email_login")); //To find the webelement using id locator
		clickonEmail.click(); //To click on email textBox
		
		WebElement enteremail = driver.findElement(By.id("email_input")); //To find the webelement using id locator
		enteremail.sendKeys("Shatavari"); //To send keys into email textbox
		
		WebElement passwordTB = driver.findElement(By.id("mob_password")); //To find the webelement using id locator
		passwordTB.sendKeys("shatavari@123"); //To sendkeys into password textfield
		
		
		
	}

}
