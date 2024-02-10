package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://open.spotify.com/");
		
		WebElement signup = driver.findElement(By.cssSelector("button[class='Button-sc-1dqy6lx-0 eOxaqu sibxBMlr_oxWTfBrEz2G']"));
		signup.click();
		Thread.sleep(1000);
		
		WebElement enterEmail = driver.findElement(By.cssSelector("input[name='username']"));
		enterEmail.sendKeys("Vrushaliambe254@gmail.com");
		Thread.sleep(2000);
		
		WebElement nextButton = driver.findElement(By.cssSelector("span[class^='ButtonInner-sc-14ud5tc-0 dIiEaI encore-bright-accent-set']"));
		nextButton.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
	}

}
