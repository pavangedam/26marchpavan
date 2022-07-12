package testNgKeyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
  
public class PriorityUse{
	
    @Test(priority =-9)
     public void d()   
     {
    	
	Reporter.log("d is running",true); 
	
    }
    
    @Test (priority=0)
    public void a()
    {
    	Assert.fail();
    	Reporter.log("a is running",true);
    }
    
    @Test(priority=-8)
    public void v()
    {
    	Reporter.log("v is running");
    	
    }
}