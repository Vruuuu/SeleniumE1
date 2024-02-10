package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-e6gkmt9/login.do");
		Thread.sleep(2000);
		
		//WebElement logButton = driver.findElement(By.xpath("//a[text()='Login']"));
		//logButton.click();
		
		WebElement logButton = driver.findElement(By.xpath("//a[.='Login']"));
		logButton.click();
		
		
	}

}
