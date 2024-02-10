package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		
		List<WebElement> searchBar = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		//for(int i=0;i< searchBar.size(); i++)
	  //	{
		
	  //    String options = searchBar.get(i).getText();
	  //     System.out.println(options);
	  //    Thread.sleep(1000);		
		//}
		for(WebElement we:searchBar)
		{
			String options = we.getText();
			System.out.println(options);
			Thread.sleep(2000);
		}
		
	}
}


