package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	WebDriver driver;
//
//	@DataProvider
//	public Object[][] datas1() {
//
//		Object[][] arr = { { "dinesh", "pwd1" }, { "kumar", "pwd2" } };
//		return arr;
//
//	}
//
//	@Test(dataProvider = "datas1")
//	public void tc1(String username, String password) {
//
//		System.out.println(username + " " + password);
//
//	}

	@Test(priority = 0, dataProvider = "data")
public void fnUrl(String url)

{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
}

@Test(priority=1, dataProvider = "datas")

	public void fbLogin(String uname, String password)
	{
		
		driver.findElement(By.id("email")).sendKeys("uname");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	}

	@DataProvider

	public Object data()

	{
		Object[] arr = { "https://www.facebook.com" };
		return arr;

	}

	@DataProvider

	public Object[][] datas()

	{

		Object[][] tarr = { { "Oranium@gmail.com", "789456" }, { "tech123", "483458" }, { "chrompet", "147821" } };

		return tarr;
	}

}
