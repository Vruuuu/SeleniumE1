package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(1000);
	    
	    WebElement searchTxt = driver.findElement(By.cssSelector("input[class='Pke_EE']"));
	    searchTxt.click();
	    Thread.sleep(1000);
	    searchTxt.sendKeys("Laptop");
	    
	    WebElement clickonsearch = driver.findElement(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg']"));
	    clickonsearch.click();
	    Thread.sleep(5000);
	    
	   WebElement clickBrd = driver.findElement(By.xpath("//div[text()='Brand']"));
	   clickBrd.click();
	   Thread.sleep(2000);
	   WebElement selectHp = driver.findElement(By.xpath("(//div[text()='HP'])[1]"));
	   selectHp.click();
	   Thread.sleep(1000);
	   
	   WebElement selectType = driver.findElement(By.xpath("//div[text()='Type']"));
	   selectType.click();
	   Thread.sleep(1000);
	   WebElement clickType = driver.findElement(By.xpath("//div[text()='Thin and Light Laptop']"));
	   clickType.click();
	   Thread.sleep(1000);
	   
	   //WebElement selectProcessor = driver.findElement(By.xpath("//div[text()='Processor']"));
	   //selectProcessor.click();
	   WebElement selectProcess = driver.findElement(By.xpath("//div[text()='Core i5']"));
	   selectProcess.click();
	   Thread.sleep(1000);
	   
	  WebElement slectOpsys = driver.findElement(By.xpath("//div[text()='Operating System']"));
	  slectOpsys.click();
	  WebElement clickOperating = driver.findElement(By.xpath("//div[text()='Windows 10']"));
	  clickOperating.click();
	  List<WebElement> laptopOp = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"));
	  List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	 Thread.sleep(1000);
	 
	  for(int i=0; i<laptopOp.size(); i++)
	  {
		 
		 String ops = laptopOp.get(i).getText(); 
		 
		  for(int j=i; j<=i; j++ )
		  {
			String price=laptopPrice.get(j).getText();
			System.out.print(ops+":"+price);
			Thread.sleep(1000);
		  }
		  
		  System.out.println();
	  }
	   
	   
	  
	   
	   
	   
	   
	    
	    
	    
	    
	    //WebElement laptopOps = driver.switchTo().activeElement();
	  //  laptopOps.sendKeys("Laptop");
	  //  Thread.sleep(1000);

	}

}
