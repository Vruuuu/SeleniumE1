package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder;

public class ContextClickMethod {


	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		Actions act=new Actions(driver);
		WebElement satisfiedBT = driver.findElement(By.id("btn30"));
		
		act.contextClick(satisfiedBT).perform();
		WebElement yesButton = driver.findElement(By.xpath("//div[text()='Yes']"));
		yesButton.click();																			
		
		WebElement concerBT = driver.findElement(By.id("btn31"));
		act.contextClick(concerBT).perform();
		WebElement yes1BT = driver.findElement(By.xpath("//div[text()='Yes']"));
		yes1BT.click();
		
		WebElement RatingBt = driver.findElement(By.id("btn32"));
		act.contextClick(RatingBt).perform();
		WebElement fourrating = driver.findElement(By.xpath("//div[text()='4']"));
		fourrating.click();
		Thread.sleep(5000);
		
	}

}
