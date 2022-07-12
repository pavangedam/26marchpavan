package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
		    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
               
		  String UN = mysheet.getRow(4).getCell(0).getStringCellValue();  //sendkey declare on excel sheet
		  String PWS = mysheet.getRow(4).getCell(1).getStringCellValue();
		  String PIN = mysheet.getRow(4).getCell(2).getStringCellValue();
		  
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
		           WebDriver driver=new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.get("https://kite.zerodha.com/");
		           Thread.sleep(1000);
		           
		         WebElement userid = driver.findElement(By.id("userid"));
		        WebElement password = driver.findElement(By.id("password"));
		      WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		      
		               userid.sendKeys(UN);
		               password.sendKeys(PWS);
		               loginbutton.click();
		               
		               Thread.sleep(1000);
		               
		         WebElement pin = driver.findElement(By.id("pin"));
		       WebElement continuebutton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		                  
		             pin.sendKeys(PIN); 
		             continuebutton.click();
		            
		             Thread.sleep(2000);
		     WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));        
		            
		   String actualuserid = username.getText();
		            String expecteduserid = UN;
		            
		            if(actualuserid.equals(expecteduserid))
		            {
		            	System.out.println("User id is matching TC csea is pass");
		            }
		            else {
		            	System.out.println("User id is not matching TC is failed");
		            }
		            
		            username.click();
		            Thread.sleep(1000);
		            driver.findElement(By.xpath("//a[@target='_self']")).click();
		            Thread.sleep(3000);
		            driver.close();
		            
	}
	

}
