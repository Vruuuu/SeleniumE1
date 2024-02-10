package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=4l76peff183kk");
		
		WebElement logTB = driver.findElement(By.id("loginButton"));
		Rectangle getrec = logTB.getRect();
		System.out.println("Height is:"+getrec.getHeight());
		System.out.println("Width is:"+getrec.getWidth());
		System.out.println("X_axis is:"+getrec.getX());
		System.out.println("Y_axis is"+getrec.getY());
	}

}
