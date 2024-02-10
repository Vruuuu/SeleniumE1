package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To launch the browser
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//To maximize the browser window
		
		Thread.sleep(1000);
		
		Dimension targetsize =new Dimension(500, 600);//To pass width and height to Dimension class
		
		driver.manage().window().setSize(targetsize);//To pass the dimension to setsize Method
		
		
	}

}
