   package extentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void start()
	{
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\extentreport.html");
		ExtentReports extent = new ExtentReports();
		 extent.attachReporter(spark);

	}
	
	@Test
	public void signIn()
	{
		test = extent.createTest("user is signing on first page");
		test.log(Status. PASS, "sign in page got pass");
		
	}
	@Test
	public void homepage()
	
	{
		test.getExtent().createTest("Homepage Test").assignAuthor("Oranium").assignCategory("smoke").assignDevice("chome");
		test.pass("User is om home page successfully");
		
	}
	
	@Test
	public void productpage()
	{
		test=extent.createTest("Product page test").assignAuthor("Trainer").assignCategory("Regression").assignDevice("edge");
		test.fail("product page test case got failed");
	}
	
	@AfterTest
	public void quit()
	{
	extent.flush();
}

}
