package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bewakoof.com/");
		WebElement clickOnLog = driver.findElement(By.id("loginLink"));
		clickOnLog.click();
		
		WebElement clickonEmail = driver.findElement(By.id("web_email_login"));
		clickonEmail.sendKeys("Shatavari");
		
		WebElement clickOnPwd = driver.findElement(By.id("mob_password"));
		clickOnPwd.sendKeys("Shatavari@123");
		
		Dimension size = clickonEmail.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Hieght is:"+height);
		System.out.println("width is:"+width);
		driver.close();
	}

}
