package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
          Thread.sleep(2000);
       WebElement alertBt = driver.findElement(By.id("alertBox"));
       alertBt.click();
       
       Alert Bt=driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(Bt.getText());
        driver.switchTo().alert().accept();
     
        WebElement confirmBox = driver.findElement(By.id("confirmBox"));
       confirmBox.click();
        Alert cb=driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(cb.getText());
        driver.switchTo().alert().dismiss();
        
        WebElement promptBox=driver.findElement(By.id("promptBox"));
        promptBox.click();
        Alert pb=driver.switchTo().alert();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Raje");
        pb.accept();
        
        
        WebElement abc=driver.findElement(By.id("output"));
        System.out.println(abc.getText());
        
       
	}

}
