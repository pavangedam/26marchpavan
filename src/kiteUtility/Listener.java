package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
	BaseNew b=new BaseNew();
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	 Reporter.log("congratulation your TC is PASSED,passed TC name is "+result.getName(),true);
	 
	 }

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Sorry your Tc IS failed,Failed TC name is "+result.getName(),true );
		
		String name = result.getName();
		
		try {
			Utility.captureScreenShot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
