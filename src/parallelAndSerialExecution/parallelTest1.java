package parallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTest1 {
  @Test
  public void getTitle() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//Thread.sleep(100);
		System.out.println(driver.getTitle());
		
			//Thread.sleep(1000);  
  }
}
