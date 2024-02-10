package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		Actions act=new Actions(driver);
		WebElement Button1 = driver.findElement(By.id("btn20"));
		act.doubleClick(Button1).perform();
		
		WebElement Button2 = driver.findElement(By.id("btn23"));
		act.doubleClick(Button2).perform();
		
		WebElement Button3 = driver.findElement(By.id("btn27"));
		act.doubleClick(Button3).perform();

	}

}
