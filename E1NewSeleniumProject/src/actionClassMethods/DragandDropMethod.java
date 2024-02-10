package actionClassMethods;

import java.time.Duration;

import org.bouncycastle.cert.jcajce.JcaCRLStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown");//To launch the webaaplication
		
	    driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();//To find the webelement
	    driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	    driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	    
	    WebElement MobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	    WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	    WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	    WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	    
	    WebElement mobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
	    WebElement laptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
	    
	    Actions act1=new Actions(driver);
	                     
	    act1.dragAndDrop(MobileCharger, mobileAccessories).perform(); //1)Webelements which you want to drag 2)webElement where you want to drop that 
	    act1.dragAndDrop(laptopCharger, laptopAccessories).perform(); //dragged webelement
	    act1.dragAndDrop(mobileCover, mobileAccessories).perform();
	    act1.dragAndDrop(laptopCover, laptopAccessories).perform();
		
		
		
		
		
		
		}

}
