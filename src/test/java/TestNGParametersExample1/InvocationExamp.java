package TestNGParametersExample1;

//INVOCATION Count--makes test executed number of times equal to count.

import org.testng.annotations.*;

public class InvocationExamp {
	
  @Test(invocationCount=10)
  public void myMessage() {
	  
	  System.out.println("I am visiting London...");
  }
  
}
