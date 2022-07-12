package parallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest2 {
  @Test
  public void getURL() throws InterruptedException
  
	
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);  
			driver.get("https://vctcpune.com/");
			System.out.println(driver.getTitle());
			
				Thread.sleep(100);  
  }
}
