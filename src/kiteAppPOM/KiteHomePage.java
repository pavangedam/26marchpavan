package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
     // 1.data member
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logOutButton;
	
	// 2.Constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//3. method
	public void validateUsername()
	{
		String expectedUserName="ELR321";
		String actualUserName =userName.getText();
	
	
	if(expectedUserName.equals(actualUserName))
			
	{
		System.out.println("Actual and Expected User Id are matching then test case is pass ");
	}
	else
	{ 
		System.out.println("actual and expected user id is not matcing then test case is failed");
	}
	}
    public void logout() throws InterruptedException
    {
    	userName.click();
    	Thread.sleep(1000);
    	logOutButton.click();
    }
	
	
	
	
	
}
