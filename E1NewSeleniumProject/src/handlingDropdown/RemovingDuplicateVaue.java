package handlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicateVaue {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/SingleSelectDropdown.html");
		
	      WebElement singleselectDD = driver.findElement(By.id("menu"));
	      Select sel=new Select(singleselectDD);//To create the object of select
	      TreeSet<String> ts=new TreeSet<String>();//To create the object of treeset
	       List<WebElement> optio = sel.getOptions();//To get list of all the options
	       
	       for(WebElement we:optio) {
	    	   
	    	   String textToInsert = we.getText();
	    	   ts.add(textToInsert);
	       }
	       
	       for(String text:ts) {
	    	   System.out.println(text);
	       }
	}

}
