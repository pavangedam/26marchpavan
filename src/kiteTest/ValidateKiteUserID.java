package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import kiteBase.Base;
import kitePOMusingTestNG.KiteHomePage;
import kitePOMusingTestNG.KiteLoginPage;
import kitePOMusingTestNG.KitePinPage;
import kiteUtility.Utility;


public class ValidateKiteUserID extends Base
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID ="6666";
	
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	  login.sendUserName(Utility.readDataFromExcel(1,0));
	  login.sendPassword(Utility.readDataFromExcel(1,1));
	  login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(1,2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getUserName(),Utility.readDataFromExcel(1, 0),"Actual and Expected are not matching TC is failed");
		Utility.captureScreenShot(driver, TCID);
		}
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.logout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();

  }
}
