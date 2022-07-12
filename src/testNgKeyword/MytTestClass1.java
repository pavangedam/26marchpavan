package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MytTestClass1 {
  @Test
  public void a() 
  {
	  //Assert.fail();
	  Reporter.log("a is running",true);
  }
  
  @Test(groups= {"regression"})
  
  public void b()
  {
	  Reporter.log("b is running regression",true);
  }
  @Test(groups= {"sanity"})
  
  public void c()
  {
	  Reporter.log("c is running,SANITY",true);
  }
  
  @Test(groups= {"regression"})
  public void d()
  {
	  Reporter.log("d is running,REGRESSION",true);
  }

  
  
  
  
  
  
  
  
  
  
  
}
