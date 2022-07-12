package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException  
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		             
			     WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
    driver.get("https://skpatro.github.io/demo/iframes/");
          
            Thread.sleep(5000);
       String text=driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
             System.out.println(text);
             String text2=driver.findElement(By.linkText("Pavilion")).getText();
             System.out.println(text2);
             
            // driver.switchTo().frame("Frame1");//changing focus from main page to frame1
             Thread.sleep(500);
             driver.switchTo().frame(0);
             String text1=driver.findElement(By.id("frametext")).getText();
             System.out.println(text1);
            driver.switchTo().parentFrame();
       
             driver.switchTo().frame(1);
            String text3 = driver.findElement(By.linkText("Category3")).getText();
             
              System.out.println(text3);
             
            		 System.out.println("this is 1st commit");
                 
	}

}
