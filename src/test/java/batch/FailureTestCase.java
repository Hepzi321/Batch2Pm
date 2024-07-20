package batch;

import org.testng.Assert;
import org.testng.annotations.Test;

import ListernerDemo.MyRetryAnalyser;

public class FailureTestCase {
	
	@Test
	
	public void t1()
	{
		Assert.assertTrue(false);
	}
	@Test
	
	public void t2()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void t3()
	{
		Assert.assertTrue(false);
	}

}
