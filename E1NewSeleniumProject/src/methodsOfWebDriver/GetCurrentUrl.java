package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
	}

}
