package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount=3)
  public void nyTest() 
  {
	  Reporter.log("Hello",true);
  }
  
  @BeforeMethod
  public void test()
  {
	  Reporter.log("hi",true);
  }
 
}
