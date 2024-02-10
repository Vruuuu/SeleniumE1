package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlix {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		
		WebElement signinButton = driver.findElement(By.cssSelector("a[role*='button']"));
		signinButton.click();
		Thread.sleep(2000);
		
		WebElement emaiId = driver.findElement(By.id("id_userLoginId"));
		emaiId.sendKeys("Vrushaliambe254@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector("input[data-uia='password-field']"));
		password.sendKeys("Vrushali@123");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']"));
		loginButton.click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
