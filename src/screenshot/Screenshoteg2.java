package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshoteg2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
             
	     WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
	     Thread.sleep(1000);
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        String str=RandomString.make(6);
	         
	        File destination=new File("C:\\Users\\Admin\\Desktop\\selenium1\\screenshot1\\testscreenshot"+str+".jpg");
	        FileHandler.copy(source, destination);
	    
	}

}
    