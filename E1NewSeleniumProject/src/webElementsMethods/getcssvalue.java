package webElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=4l76peff183kk");
		WebElement userTB = driver.findElement(By.name("username"));
		//String colour = userTB.getCssValue("background");//To get css colour value
		//System.out.println(colour);
		
		Point get1= userTB.getLocation();//To get the location of the webelement
		System.out.println(get1.getX());//To get and print xaxis
		System.out.println(get1.getY());//To get and print yaxis
		
	}

}
