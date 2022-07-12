package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Isselectedmethod {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	    Thread.sleep(1000);
	    
	   WebElement Hide = driver.findElement(By.id("hide-textbox"));
	   WebElement Show = driver.findElement(By.id("show-textbox"));
	  WebElement textbox = driver.findElement(By.name("show-hide"));
	  
	  
	    if (textbox.isDisplayed())
	    {
	    	System.out.println("thank you textbox is displayed");
	    }
	    else
	    {
              System.out.println("cant find textbox");
            
              Hide.click();
              
              if (textbox.isDisplayed())
      	    {
      	    	System.out.println("thank you textbox is displayed");
      	    }
      	    else
      	    {
                    System.out.println("cant find textbox");
	}
	}
}}