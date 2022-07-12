package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethodUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		
		            WebDriver driver=new ChromeDriver();
		            
		     //1.get-->to enter url in browser or to open an application.
		            
		            driver.get("http:/www.google.co.in/");
		            
		            //2.close-->to close the current tab of the browser opened by selenium tool.
		                    driver.close();
		            
		            //3.quit-->to close the all the tabs present in browser opened by selenium tool.
		            //driver.quit();
		            //4. maximize/minimize()-used to maximize/ minimize the browser
		            
		              // driver.manage().window().maximize();
		              // driver.manage().window().minimize();
		               
		            
		

	}

}
