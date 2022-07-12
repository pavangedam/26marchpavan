package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
	  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://skpatro.github.io/demo/links/");
	     
	     Thread.sleep(2000);
	     
	   String mainPageID = driver.getWindowHandle(); //id of main page
	     System.out.println("mainPageID");
	     System.out.println("====================================");
	     
	     // to open child window
	     driver.findElement(By.name("NewWindow")).click();
	     Thread.sleep(2000);
	     
	     //to handle multiple windows /to get multiple ids
	   Set<String> allPageIDs = driver.getWindowHandles();
	                  
	   Iterator<String> it = allPageIDs.iterator();
           
	   
	 //  {
	//	   System.out.println(it.next());
		   
	//   }
	      String mainPageld = it.next(); //will return main page id
	      driver.switchTo().window(mainPageld);
	      String childPageld = it.next();//will return child page id
	     
	      // to switch focus to child window
	      driver.switchTo().window(childPageld);// changing focus pain page to child page
	      
	         driver.manage().window().maximize();
	        // driver.findElement(By.xpath("")))
	      
	}

}
