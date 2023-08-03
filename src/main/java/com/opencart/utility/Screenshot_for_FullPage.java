package com.opencart.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_for_FullPage {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart");
		driver.manage().window().maximize();
		
		String path=".\\ScreenShot\\";
		//Take Screen shot for full web page
		TakesScreenshot ts=((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dec=new File(path+"fullpage"+".png");
		try {
			FileHandler.copy(src, dec);
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("screen shot not taken");
		}
		
		driver.quit();
		

	}

}
