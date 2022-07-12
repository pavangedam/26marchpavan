package kiteTest;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBase.Base;
import kiteBase.BaseNew;
import kitePOMusingTestNG.KiteHomePage;
import kitePOMusingTestNG.KiteLoginPage;
import kitePOMusingTestNG.KitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityProb;
@Listeners(kiteUtility.Listener.class)
public class ValidateKiteUserIDUsingProperty extends BaseNew
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	//String TCID ="666";
	
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	  login.sendUserName(UtilityProb.getDataFromPropertyFile("UN"));
	  login.sendPassword(UtilityProb.getDataFromPropertyFile("PWD"));
	  login.clickOnLoginButton();
	  pin.sendPin(UtilityProb.getDataFromPropertyFile("PIN"));
	  pin.clickOnContinueButton();
	  
	}
	
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getUserName(),UtilityProb.getDataFromPropertyFile("UN"));
		//Utility.captureScreenShot(driver, TCID);
		Assert.fail();
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
