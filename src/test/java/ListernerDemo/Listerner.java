package ListernerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import batch.TestCase;

public class Listerner extends TestCase implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("on test started");
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The test you have given is passed");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");
		captureScreenshot();
	}

	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test Skipped");
	 }
	 
	 public void onStart(ITestContext context) {
		 
		 System.out.println("Test on start");
	 }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("on Test finish");
	 }
	 
}
