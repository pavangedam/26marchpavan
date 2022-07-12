package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutOne {
	
  @Test(timeOut=1000)
  public void d() 
  {
	Reporter.log("d is runing",true);  
	  
  }

  @Test
  public void a()
  {
	  Reporter.log("a is runing",true); 
	  
  }
  
  @Test
  public void v()
  {
	  Reporter.log("v is runing",true); 
  }
  
  
  
  
  
  
}
