package kiteBase;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtility.UtilityProb;

public class BaseNew
{
	protected WebDriver driver;
   public void openBrowser() throws IOException
	{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("disable-notifications");
			opt.addArguments("incognito");
			driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get(UtilityProb.getDataFromPropertyFile("URL"));
			Reporter.log("Launching Browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
			public void captureScreenShot(String TCID) throws IOException
			{
				 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File dest=new File("C:\\Users\\Admin\\Desktop\\selenium1\\screenshot1\\mysrc"+TCID+".png");
			 
			 FileHandler.copy(src, dest);
			 
			}
	    }

   
	
	
	
	
	
	
	
	
	
//	public void openBrowser1() throws IOException
//  {
//	Properties prop=new Properties();// create object of properties
//
//	FileInputStream myfile=new FileInputStream("C:\\Users\\Public\\puneSelenium\\test-output\\propertyfile");
//	prop.load(myfile);
//	prop.getProperty("URL");
//}}
