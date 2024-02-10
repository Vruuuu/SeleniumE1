package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExlicitwaitMethod {

	public static void main(String[] args) {
		
		WebDriver Driver=new ChromeDriver();//To launch chromeBrowser
		Driver.manage().window().maximize();//To maximize the Browser
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//To declare implicit wait
		WebDriverWait wait=new WebDriverWait(Driver, Duration.ofSeconds(10));//To declare explicit wait
		Driver.get("https://shoppersstack.com/");//To launch the webApplication
		
		
		
		

	}
	}
