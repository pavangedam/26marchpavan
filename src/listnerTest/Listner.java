package listnerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("Screenshot taken,please check TC",true);	
		Reporter.log("my method name is "+result.getName(),true);
	}
    @Override
    public void onTestSuccess(ITestResult result)
    {
    	
      Reporter.log("TC is passed",true);
      System.out.println("The name of the testcase passed is" +result.getName());
    }
	
    @Override
    public void onTestSkipped(ITestResult result)
    {
      Reporter.log("Tc is skipped then check dependant Method",true);	
    }
	
}
