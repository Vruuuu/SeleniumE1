package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To launch the Browser
		
		driver.manage().window().maximize();//To maximize Browser
		
	    driver.get("https://www.facebook.com/");//To launch the web Application
	    
	    Thread.sleep(1000);
	    
	       WebElement partoflink =driver.findElement(By.partialLinkText("?"));//To Locate forgotten password?Link
	       partoflink.click();//To click on Fogotten Password
	       
	       
	    
	    
	    
		

	}

}
