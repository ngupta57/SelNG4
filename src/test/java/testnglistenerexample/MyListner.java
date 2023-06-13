package testnglistenerexample;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{
 
	public void onTestStart(ITestResult result) {
	    System.out.println("ON TEST START ......");
	  }

public  void onTestSuccess(ITestResult result) {
	 System.out.println("ON TEST pass ......");
	  }

public  void onTestFailure(ITestResult result) {
	 System.out.println("ON TEST fail ......");
	  }
public  void onTestSkipped(ITestResult result) {
	 System.out.println("when  TEST is skipped......");
	  }
public  void onFinish(ITestContext context) {
	 System.out.println("ON finish ......");
  }

}
