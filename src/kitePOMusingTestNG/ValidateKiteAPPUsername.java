package kitePOMusingTestNG;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAPPUsername {
	
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 ChromeOptions opt=new ChromeOptions();
		 
		//opt.addArguments("--headless");
		 opt.addArguments("incognito");
		 driver= new ChromeDriver(opt);  
		  driver.manage().window().maximize();  
		  driver.get("https://kite.zerodha.com/");   
		  
	       Reporter.log("Launching browser",true);
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	       File myfile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
	      mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	       
	       login=new KiteLoginPage(driver);
	       pin=new KitePinPage(driver);
	       home=new KiteHomePage(driver);
	}
	       
	@BeforeMethod
    public void logintokiteApp()
    {
	String UN = mySheet.getRow(1).getCell(0).getStringCellValue();
    String PWS = mySheet.getRow(1).getCell(1).getStringCellValue();
    String PIN = mySheet.getRow(1).getCell(2).getStringCellValue();
		
     login.sendUserName(UN);
     Reporter.log("sending user name",true);
     login.sendPassword(PWS);
     Reporter.log("sending password",true);
     login.clickOnLoginButton();
     Reporter.log("clicking on login button",true);
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     
     
     pin.sendPin(PIN);
     Reporter.log("sending PIN",true);
     pin.clickOnContinueButton();
     Reporter.log("clicking on continue button",true);
     
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      }
	
	@Test
  public void validateUserName()

  {
			
		String expectedUN = mySheet.getRow(1).getCell(0).getStringCellValue();
		String actualUN = home.getUserName();
		  Reporter.log("validating User name",true);
		  Assert.assertEquals(actualUN,expectedUN,"actual and expected UN is not found TC is failed");
		 Reporter.log("actual and expected UN are matching TC is passed",true); 
		  
  }
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
		home.logout();
		Reporter.log("logging out",true);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("closing Browser",true);
		driver.close();
	}
	
}
