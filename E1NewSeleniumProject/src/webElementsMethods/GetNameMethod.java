package webElementsMethods;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNameMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("http://127.0.0.1/login.do;jsessionid=4l76peff183kk");
		driver.get("https://www.facebook.com/");
		
		//WebElement logTB = driver.findElement(By.id("loginButton"));
		//System.out.println(logTB.getTagName());
		
		//To check whether webelment is displayed or not
		//WebElement linktext = driver.findElement(By.xpath("//a[text()='License for using this software']"));
		//System.out.println(linktext.isDisplayed());
		
		//To chech webelement is enabled or not
	    // WebElement userTB = driver.findElement(By.name("username"));
		//System.out.println(userTB.isEnabled());
		
		//To check webelement is selected or not
		//WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
		//check.click();
		//System.out.println(check.isSelected());
		
		//To check button type is submit or not
		WebElement logBT = driver.findElement(By.id("u_0_5_Es"));
		logBT.submit();
		
		
		
		
	}

}
