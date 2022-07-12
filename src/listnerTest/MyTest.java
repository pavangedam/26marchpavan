package listnerTest;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

//@Listeners(listnerTest.Listner.class )
public class MyTest {
  @Test
  public void myMethod1() 
  {
	   Reporter.log("this is Mymethod1",true);
  }
  
  @Test
  public void myMethod2() 
  {     
	  Assert.fail();
	   Reporter.log("this is Mymethod2",true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  
  public void myMethod3() 
  {
	   Reporter.log("this is Mymethod3",true);
  }
    
}
