package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException
	{
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
                 
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://kite.zerodha.com/");
	     Thread.sleep(2000);
	     
	   WebElement userId = driver.findElement(By.id("userid"));
	   WebElement password = driver.findElement(By.id("password"));
	    WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	                
	    userId.sendKeys("ELR321");
	    password.sendKeys("Dhana1111");
	    loginbutton.click();
	    Thread.sleep(1000);
	    WebElement pin = driver.findElement(By.id("pin"));
	  WebElement continuebutton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	        pin.sendKeys("982278");
	        continuebutton.click();
	        Thread.sleep(1000);
	     WebElement userId1 = driver.findElement(By.xpath("//span[@class='user-id']"));
	    String actualuserid = userId1.getText();
	    String expecteduserid = "ELR32";
	    
	    if(actualuserid.equals(expecteduserid))
	    {
	    	System.out.println("user id is matching then Tc case is pass");
	    	
	    }
	    else {
	    	System.out.println("user id is not matching then tc is failed");
	    	
	    }
	    userId1.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    Thread.sleep(1000);
	    driver.close();
	}

}
