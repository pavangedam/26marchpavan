package kiteUtility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProb 
{
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Admin\\Desktop\\selenium1\\screenshot1\\mysrc"+TCID+".png");
	 
	 FileHandler.copy(src, dest);
	 
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties(); //created object on properties
		FileInputStream myfile=new FileInputStream("C:\\Users\\Public\\puneSelenium\\test-output\\propertyfile");
		prop.load(myfile);
		
		 String value = prop.getProperty(key);
	      return value;
	}
}
