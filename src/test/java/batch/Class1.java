package batch;

import org.testng.annotations.Test;

public class Class1 {
	@Test(groups = "Regression")
	
	public void m1()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 1");
	}
	@Test (groups = {"smoke", "sanity"})
	
	public void m5()
	{
		System.out.println("method 6");
	}

}
