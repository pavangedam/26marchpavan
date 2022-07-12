package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	 // Assert.assertEquals(a,b,"a and b values are not matching TC failed");
	 // Reporter.log("a and b values are matching Tc PASSES",true);
	  
	  Assert.assertNotEquals(a, b,"a and b is values are not matching tc failed");
	  Reporter.log("a and b values are not matching tc passed",true);
	  
  }
}
