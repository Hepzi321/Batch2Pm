package batch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class FbLogin extends BaseClassTest{   
	
	
	@Test(dataProviderClass= DemoExcelReader.class , dataProvider="getData")
	
	public void do_fbLogin(String uname, String pwd)
	
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);	
		
	    driver.findElement(By.name("login")).click();
	
	
	}
	
	
	

}
