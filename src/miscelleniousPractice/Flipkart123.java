package miscelleniousPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart123 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(500);
		  
		  WebElement closebt=  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		  closebt.click();
		  System.out.println( "login PopUp window close ");
		  WebElement serach=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		  Thread.sleep(1000);
		  serach.sendKeys("Mobile");
		  System.out.println("list of serach element: ");
		  List<WebElement> suggList=driver.findElements(By.xpath("//div[contains(@class,'lrtEPN _17d0yO')]"));
		 
		
		  for(WebElement e: suggList)
		  {
			 System.out.println(e.getText());
		  }
		  
		  System.out.println(suggList.size());
		  Thread.sleep(1000);
		  
			   Thread.sleep(200);
	driver.findElement(By.xpath("//li[@class='Y5N33s'][2]")).click();
	
	   Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='_10UF8M _3LsR0e']")).click();
			 
			 
			   
			   
		   }
}


	


