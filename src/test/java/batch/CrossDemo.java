package batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossDemo {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browsername"})
	

	
	public void setUp(String browsername)
	
	
	{
		switch(browsername)
		
		{
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
			break;
			
		
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		case"firefox":
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		
		default:
			System.out.println("Provide a valid browser name"+browsername);
		
		}
		
		driver.get("https://www.Google.com");
	}
	@Test
	
	public void googleTitle()
	{
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "Google");
	}
		
	
	@AfterTest
		
		public void quit()
		
		{
			driver.quit();
		}
	
	}
	

