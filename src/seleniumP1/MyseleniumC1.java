package seleniumP1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyseleniumC1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		        WebDriver driver=new ChromeDriver();

		       // driver.get("http://vctcpune.com/selenium/practice.html#serviceid.com/");
		        driver.get("http://facebook.com/");
		      //  driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).click();
		        
		        
		       // System.out.println("browser is open");
		        
		      //  String Title=driver.getTitle();
		     //   System.out.println("Title is "+Title);
		        
		     //   String currentURL =driver.getCurrentUrl();
		      //  System.out.println("currentURL "+currentURL);
		     //   driver.manage().window().maximize();
		        
		     //   WebElement uname=driver.findElement(By.id("email"));
		      //  uname.sendKeys("gedam@gmail.com");
		       // driver.manage().window().minimize();
		     //   driver.quit();
		      
		      //  WebElement password=driver.findElement(By.id("pass"));
		       // password.sendKeys("543210");

		      //  WebElement login=driver.findElement(By.name("login"));
		      // login.click();
		        
		        driver.navigate().back();
		        driver.navigate().forward();
		      driver.navigate().refresh();
	}

}
