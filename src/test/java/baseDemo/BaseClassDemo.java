package baseDemo;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassDemo {
	
	WebDriver driver;
	Properties prop;
	
	public void setUp()
	
	{
	
	File f = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\ConfigFiles\\config.properties");
	
	FileReader fr = new FileReader(f);
	
	Properties prop = new Properties();
	
	prop.load(fr);
	
	{
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		
		WebDriverManager.ChromeDriver().set();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("testurl"));
	}
	

}
	
	}
