package Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement creatAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		creatAcc.click();
		
		WebElement Daydropdown = driver.findElement(By.id("day"));
		WebElement MonthDropdown = driver.findElement(By.id("month"));
		WebElement YearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect=new Select(Daydropdown);
		System.out.println("Is DayDropDown Multiple?:"+daySelect.isMultiple());
		
		List<WebElement> dayOptions = daySelect.getOptions();
		for(int day=0; day<dayOptions.size(); day++) 
		{
			String getdayoptions = dayOptions.get(day).getText();
			System.out.println(getdayoptions);
		}
		
		daySelect.selectByIndex(24);
		Thread.sleep(2000);
		
		Select monthSelect=new Select(MonthDropdown);
		System.out.println("Is MothDropdown Multiple?:"+monthSelect.isMultiple());
		
		List<WebElement> monthoptions = monthSelect.getOptions();
		for(int month=0; month<monthoptions.size(); month++) 
		{
			String getmonthoptions = monthoptions.get(month).getText();
			System.out.println(getmonthoptions);
		}
		monthSelect.selectByValue("4");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
