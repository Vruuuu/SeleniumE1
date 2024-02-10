package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.flipkart.com/");
	    
	     WebElement HomeandFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));//To find Webelement
	     Actions act=new Actions(driver);//Object creation of Action class
	     act.moveToElement(HomeandFurniture).perform();//To MouseOver on Home&Furniture Option
	
	}

}
