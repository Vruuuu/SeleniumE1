package handlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdownWlithOperationalMethods {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/MultipleSelectDropdown.html");
		
	     WebElement MultiselectDD = driver.findElement(By.id("menu"));
		//Select multi=new Select(ismulti);
		//System.out.println(multi.isMultiple());
		Select sel=new Select(MultiselectDD);
		
		 List<WebElement> opss = sel.getOptions();
		for(int i=0; i<= opss.size(); i++) 
		{
		   String op = opss.get(i).getText();
		   System.out.println(op);
			
		}
		
		
	}
	}
		
       


