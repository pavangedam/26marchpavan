package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestNew 
{
  @Parameters("browserName")
  @Test
  public void myMethod(String name) throws InterruptedException
  {
	  WebDriver driver=null;
	  
	if(name.equals("firefox"))  
	{
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\selenium1\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		  
		   driver=new FirefoxDriver();
		}
	else if(name.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
          driver=new ChromeDriver();
	}
	      driver.manage().window().maximize();
          driver.get("https://kite.zerodha.com/");
         Thread.sleep(2000);
          
          driver.close();
          
    }
}
