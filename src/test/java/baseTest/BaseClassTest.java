package baseTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.PageLayer.LoginPageLayer;
import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	
	
	public static WebDriver driver;
	
	Properties prop;
	
	public static LoginPageLayer fblog = new LoginPageLayer();
	
	@BeforeTest
	public void setup() throws IOException
	
	{
	
	if(driver==null)
	{
	
File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
	
	FileReader fr = new FileReader(f);
	
	prop = new Properties();
	
	prop.load(fr);
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("testUrl"));
	}
	
	else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get(prop.getProperty("testUrl"));
	}
	
	else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new EdgeDriver();
				driver.get(prop.getProperty("testUrl"));
			}
		
	else
	{
		System.out.println("pass the valid browser...");
	}

}
	
	@AfterTest

public void tearDown()

{
	driver.quit();
}

}