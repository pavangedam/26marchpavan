package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationTest {
  @Test
  public void Rechargephone()
  {
	  Reporter.log("Recharge done",true);
  }
  @BeforeMethod
  public void loginRechargeportal()
  {
	  Reporter.log("login done",true);
  }

  @AfterMethod
  public void closeRechargeportal()
  {
	  Reporter.log("recharge poratl close",true);
  }
  @BeforeClass
  public void openbrowser() 
  {
	  Reporter.log("browser open",true);  
  }

  @AfterClass
  public void closebrowser() 
  {
	  Reporter.log(" browser is close",true); 
  }

}
