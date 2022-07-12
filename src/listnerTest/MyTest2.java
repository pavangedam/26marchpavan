package listnerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnerTest.Listner.class )
public class MyTest2 {
  @Test
  public void myMethod4() 
  {
	   Reporter.log("this is Mymethod4",true);
  }
  
  @Test
  public void myMethod5() 
  {     
	  Assert.fail();
	   Reporter.log("this is Mymethod5",true);
  }
  
  @Test(dependsOnMethods = {"myMethod5"})
  
  public void myMethod6() 
  {
	   Reporter.log("this is Mymethod6",true);
  }
    
}
