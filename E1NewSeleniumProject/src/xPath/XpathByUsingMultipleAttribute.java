package xPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingMultipleAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=13uub34yfww1j");
	}

}
