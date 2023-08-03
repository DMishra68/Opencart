package com.opencart.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import com.opencart.utility.ExcelTestData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	public ExcelTestData excel_data;
	@BeforeTest
	public void start()
	{
    logger=Logger.getLogger("OpenCart automation ");	
	PropertyConfigurator.configure("Log4jfile.properties");
	logger.info("Execution Started");
	
	excel_data=new ExcelTestData();   	//excel handle object created its avalibale in utility package
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Execution completed");
	}
	
	
	
	
	
	
	
	@BeforeMethod
	public void setup() {
		String br="Chrome";
		if(br.equalsIgnoreCase("Chrome") ) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(br.equalsIgnoreCase("Firfox")) {
			WebDriverManager.firefoxdriver().setup();;
			driver = new FirefoxDriver();
		}else if (br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();;
			driver = new EdgeDriver();
		}else if(br.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();;
			driver = new SafariDriver();
		}else {
			System.out.println(" Please give correcet driver ");
		}
		logger.info("Browser launch");
		driver.get("https://naveenautomationlabs.com/opencart");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Url hit, cookies delete, window maximize, implicit wait provided.");
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("Browser Close");
	}
	
}
