package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//To launch the webBrowser
		driver.manage().window().maximize();//To maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//add implicit wait
		driver.get("https://www.bewakoof.com/");//To launch the WebApplication
		
	    WebElement profileClick = driver.findElement(By.id("loginLink"));//To find the Webelement usind id locator
	    profileClick.click();//To click on login element
	    WebElement withEmail = driver.findElement(By.id("web_email_login"));//To find the webelement using id locator
	    withEmail.click();//To click on Password element
	    driver.close();//To close the Browser
		
		
	}

}
