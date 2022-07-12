package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 

{
          
	//1.data member
	
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	// 2.Constructor
	
	public KitePinPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3.method
	public void sendPin()
	{
		PIN.sendKeys("982278");
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
