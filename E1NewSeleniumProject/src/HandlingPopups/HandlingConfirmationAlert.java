package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		
		Alert confiramtionalert = driver.switchTo().alert();//to switch the control to alert
		confiramtionalert.accept();
		//confiramtionalert.dismiss();
		
	}

}
