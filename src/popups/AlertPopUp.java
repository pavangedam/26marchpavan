package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");
            
            Thread.sleep(2000);
            driver.findElement(By.id("alertButton")).click();
            
          // 1.To handle the alert PopUp we need to switch selenium focus from mai
            
           Alert alt =driver.switchTo().alert();
            
           //2. Alert is an interface which contain abstract method like:
          //  1.accept(); use to click button.
          // 2.dismiss();use to click on cancel button.
          // 3. getText();use to get text present in a alert popup .
            
            System.out.println(alt.getText());
            
            alt.accept();
            
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(5000);
            alt.dismiss();
           System.out.println(alt.getText());
         
            
	}

}
