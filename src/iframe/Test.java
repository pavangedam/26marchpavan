package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		             
			     WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("https:www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			     Thread.sleep(1000);
			     driver.switchTo().frame("iframeResult");
			     driver.findElement(By.xpath("//Button[@type='button']")).click();

	}

}
