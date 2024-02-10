package handlingDropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownWithSelectionMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//To lauch the chrome Browser
		driver.manage().window().maximize();//To maximize the Browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//To Apply Implicit Wait
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/SingleSelectDropdown.html");//To lauhch the webApplication
		
		WebElement SingleSelectDD = driver.findElement(By.id("menu"));//To find the webelement
		Select sel = new Select(SingleSelectDD);//Creat object for select class
		
		//sel.selectByIndex(1); //slecting value by index 
		
		//sel.selectByValue("v3"); //Selecting value by value
		
		sel.selectByVisibleText("Chai"); //Selecting value by visible Text
		  
		
	    
		
		

	}

}
