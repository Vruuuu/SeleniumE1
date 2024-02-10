package handlingDropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingMethodHashSet {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/MyHtmlCodes/SingleSelectDropdown.html");
		
		WebElement selectsingleDD = driver.findElement(By.id("menu"));
		Select sel=new Select(selectsingleDD);
		
        HashSet<String> hs=new HashSet<String>();
        
        List<WebElement> options = sel.getOptions();
        
        for(int i=0; i< options.size(); i++)
        {
           String ops = options.get(i).getText();
           hs.add(ops);
        }
        for(String text:hs) {
        	System.out.println(text);
        }
	}

}
