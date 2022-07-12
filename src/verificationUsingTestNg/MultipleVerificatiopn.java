package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerificatiopn {
  @Test
  public void myMethod() 
  {
	  String a="pune1";
	  String b=null;
	  
	  //Assert.assertNotEquals(a,b,"TC is failed values are equal");
	  
	  Assert.assertNotNull(b,"Tc is failed value is null");
	   
  }
}
