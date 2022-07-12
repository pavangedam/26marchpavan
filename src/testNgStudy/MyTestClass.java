package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
     public void myMethod() throws InterruptedException 
     {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://kite.zerodha.com/");
      System.out.println("hi method is running this is printing statement");
      Reporter.log("Hi method is running this is reporter output");
      Reporter.log("Hi method is running this is reporter output true",true);
      Thread.sleep(3000);
}
  @Test
  public void myMethod1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://vctcpune.com/");
   Thread.sleep(3000);
  
  }
  
   
}
