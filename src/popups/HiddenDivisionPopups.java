package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  // PopUp windows close
	 
	 driver.findElement(By.name("q")).sendKeys("sunglasses");
     Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();// search button is click.
 
	 
     
	 

	}

}
