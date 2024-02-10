package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		
		Thread.sleep(3000);
		
		File src = event.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/SeleniumDev.jpg");
		
		Files.copy(src, dest);
	}

}
