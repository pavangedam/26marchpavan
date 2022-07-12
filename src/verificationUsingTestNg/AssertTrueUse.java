package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod()
  {
	  boolean a=true;
	  boolean b=false;
	  
	 // Assert.assertTrue(b,"TC is failed value is false"); 
	//  Reporter.log("TC is passed value is true ",true);   
	  
	 Assert.assertFalse(a,"Tc is failed value is True"); 
	 Reporter.log("TC is passed value is false",true);
  }
}
