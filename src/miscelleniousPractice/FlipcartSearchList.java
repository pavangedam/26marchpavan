package miscelleniousPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSearchList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     
	     Thread.sleep(200);
         WebElement closebt = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
         closebt.click();
         System.out.println("login popup window close");
         driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile phone");
          WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
           search.click();
           
           System.out.println("list of search mobile");
           
           List<WebElement> list = driver.findElements(By.xpath("//div[@class='col-12-12 _2oO9oE']"));
           for(WebElement p:list)
           {
         	  System.out.println(p.getText());
           }
           System.out.println(list.size());
           
          Thread.sleep(200);
      //   driver.findElement(By.xpath("//div[@class='_10UF8M'][3]")).click();
         
         WebElement pp = driver.findElement(By.xpath("//div[@class='_10UF8M'][3]]"));
          pp.click();
         
     //  WebElement ss = driver.findElement(By.xpath("//div[@class='_10UF8M'][3]"));
      //  ss.click();
             
      //li[@class='Y5N33s'][1]
			
              
	}

}
