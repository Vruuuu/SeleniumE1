package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		
		//To generate alert popup
		WebElement clickonalertpop = driver.findElement(By.id("alert1"));
		clickonalertpop.click();
		Thread.sleep(2000);
		
		//To switch the control to alert popup
	     Alert alertpop = driver.switchTo().alert();
	     
	     //To click on ok button
	     alertpop.accept();
	     //To click on ok button
	     //alertpop.dismiss();
		
		

	}

}
