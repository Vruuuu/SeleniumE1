package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//Launch the browser
		driver.manage().window().maximize();//To maximize the browser
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/Username.html");//to launch the web application
		Thread.sleep(1000);
        
          WebElement textbox= driver.findElement(By.tagName("input"));//Find password Textfield on the webpage
          
          textbox.sendKeys("Admin");//To pass the inputs to password textfield
          
          Thread.sleep(2000);
          //Note-Inputs are passed to Username Textfield because it is the 1st element designed with input tag.
	}

}
