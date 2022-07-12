package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicwaitIORImlicitwait {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.close();
		
		
	}

}
