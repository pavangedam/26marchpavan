package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysUse {

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		       WebDriver driver=new ChromeDriver();
		       
		       driver.get("https://flipkart.com/");
		       
		    // driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("pavan gedam");
		     // Thread.sleep(3000);
		   //   userName.sendKeys(Keys.RETURN);     
               
        // driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).clear();
       
   
               
	}

}
