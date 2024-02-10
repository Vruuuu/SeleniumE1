package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import methodsOfWebDriver.FindElementsMethod;

public class TrelloWebsite {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://trello.com/home");
		
		driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("vrushaliambe254@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Vrushali@254");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("(//div[@title='MyBoard'])[1]")).click();
		
		WebElement sqlMockSrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement corejavaMockSrc = driver.findElement(By.xpath("//a[text()='Core Java']"));
		WebElement manualMockSrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement apiMockSrc = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement seleniumMockSrc = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement pythonMockSrc = driver.findElement(By.xpath("//a[text()='Python']"));
		
		WebElement MockGivenTarget = driver.findElement(By.xpath("//h2[text()='Mock Given'])"));
        WebElement MockPendingTarget = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
        WebElement MockScheduledTarget = driver.findElement(By.xpath("//h2[text()='Mock Scheduled']"));
        
       Actions act= new Actions(driver);
       act.dragAndDrop(sqlMockSrc, MockGivenTarget).perform();
	}

}
