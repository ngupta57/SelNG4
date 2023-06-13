package testnglistenerexample;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgListnerExample1 {	
	
  @Test(priority=1)
  public void testWeb1() {
	  System.out.println("THIS TEST IS GOING TO PASS : TEST WEB-1");
	  Assert.assertEquals(1,1);
  }
  @Test(priority=2)
  public void testWeb2() {
	  System.out.println("THIS TEST IS GOING TO fail : TEST WEB-2");
	  Assert.assertEquals(1,2);
  }
  @Test(priority=3, dependsOnMethods ={"testWeb2"})
  public void testWeb3() {
	  System.out.println("THIS TEST IS GOING TO skipped : TEST WEB-3");
	  Assert.assertEquals(1,1);
  } 
}
