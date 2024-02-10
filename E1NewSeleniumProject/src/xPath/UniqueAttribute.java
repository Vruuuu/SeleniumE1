package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
		//WebElement Signinlink = driver.findElement(By.linkText("Sign In"));
		//Signinlink.click();
		
		WebElement emaiId = driver.findElement(By.xpath("//input[@name='emailId']"));
		emaiId.sendKeys("vrushaliambe254@gmail.com");
		Thread.sleep(1000);
		
		WebElement passWd = driver.findElement(By.xpath("//input[@id='mui-2']"));
		passWd.sendKeys("Vrushali254@ambe");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
