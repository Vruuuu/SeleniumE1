package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();//To store the reference with chromedriver class
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(5000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/Ajio.jpg");
		
		Files.copy(src, dest);
	}

}
