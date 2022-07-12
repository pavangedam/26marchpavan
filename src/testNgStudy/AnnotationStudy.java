package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  
  public void ValidateUsreid() 
  {
    Reporter.log("user ID validated",true);
  }
  
  @BeforeMethod
  public void logintokiteapp()
  { 
	  Reporter.log("login success",true);
  }
  
  @BeforeClass
  public void launchbrowser()
  {
	  Reporter.log("browser is launched",true);
  }
  
     @AfterMethod 
     public void logoutFromKiteapp()
     {
    	 Reporter.log("log out kite app",true);
     }
     
     @AfterClass
     public void closebrowser()
     {
    	 Reporter.log("browser close",true);
     }
     
     
     
}
