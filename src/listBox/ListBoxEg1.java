package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
    Thread.sleep(1000);
    
    //1. identify list box to the handle and store to the reference variable
    
    WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
    
    //2. create an object of select class which will accept webElement as argument
    
       Select s=new Select(listBox);
       
       //3. By using one of the select class methods we can select
    
	   s.selectByVisibleText("Option2");
	   s.selectByValue("option1");
	    
	   Thread.sleep(1000);
	   s.selectByIndex(3);

	}

}
