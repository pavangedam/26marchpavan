package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\selenium1\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com/");
	  
	  //Thread.sleep(1000);
  }
}
