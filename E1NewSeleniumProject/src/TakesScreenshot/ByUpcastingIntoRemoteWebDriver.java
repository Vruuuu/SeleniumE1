package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteWebDriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./screenshots/Amazon.png");
		
		Files.copy(src, dest);
		
	}

}
