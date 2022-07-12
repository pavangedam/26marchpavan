package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
         // driver.manage().window().maximize();
          driver.get("https://vctcpune.com/selenium/practice.html");
          
          Thread.sleep(1000);
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
                 File destination=new File("C:\\Users\\Admin\\Desktop\\selenium1\\screenshot1\\myscreenshot2.png");
                    FileHandler.copy(source, destination);
	}

}
