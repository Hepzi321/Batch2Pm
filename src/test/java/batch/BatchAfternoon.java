package batch;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BatchAfternoon {
	
	@Test(priority=-2, description="test case for login functionality")
	
	public void login()
	
	{
		
	
		System.out.println("Login functionality check");
		
		Assert.assertTrue(true);//hard assert
	
}
	@Test(priority=-1, description="test case for home page", invocationCount = 10, invocationTimeOut=2000)
	public void homePage() throws InterruptedException
	
	{
		Thread.sleep(2100);
		System.out.println("Home Page check");
	}
	
	
	
	@Test(priority=1, description="test case for addtocart")
	public void addToCart()
	
	{
		System.out.println("Add to cart check");
	}
	
	@Test(priority = 2, expectedExceptions=Exception.class)
	
	public void test()
	
	{
	int x=100;
		
	System.out.println(x/0);
	
	}

}