package handlingDropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdownWithDeselectionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/MultipleSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.deselectByIndex(2);
		
		sel.selectByValue("v2");
		Thread.sleep(3000);
		sel.deselectByValue("v2");
		
		sel.selectByVisibleText("Wada Paav");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Wada Paav");
		sel.deselectAll();
		
		//Select and Deselect By using for loop
	    for(int i=0; i<=7; i++)
	    {
	    	sel.selectByIndex(i);
	    	Thread.sleep(1000);
	    }
	    Thread.sleep(3000);
	    for(int j=0; j<=7; j++) 
	    {
	    	sel.deselectByIndex(j);
	    	Thread.sleep(1000);
	    	}
		}
		
	}
