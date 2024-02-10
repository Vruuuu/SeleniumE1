package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To Launch the chromebrowser
		
		driver.navigate().to("https://www.myntra.com/");//To Launch the web Application
		
		driver.navigate().back();//To navigat backward
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		
	}

}
