package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
        
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demoqa.com/select-menu");
          Thread.sleep(1000);
          
       WebElement multiselectElement = driver.findElement(By.name("cars"));
       
       Select s=new Select(multiselectElement);
    		   
       System.out.println("Multi select status is "+s.isMultiple());
         
       s.selectByVisibleText("Volvo");
       Thread.sleep(1000);
       
       s.selectByValue("saab");
       Thread.sleep(1000);
       
       s.selectByIndex(2);
       Thread.sleep(1000);
       
       s.selectByIndex(3);
      // s.deselectAll();
       Thread.sleep(1000);
       s.deselectByIndex(3);
       Thread.sleep(1000);
       s.deselectByIndex(2);
       s.deselectByValue("saab");
       
       System.out.println(s.getFirstSelectedOption().getText());
       s.getAllSelectedOptions();
	}

}
