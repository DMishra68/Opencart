package com.opencart.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.opencart.testBase.TestBase;

public class UtilClass extends TestBase {

	public String currentPageTitle() {
		String Title=driver.getTitle();
		return Title;
	}
	
	public static void takeSS(String filename) {
		try {
			String path=".\\ScreenShot\\";
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);               
			File dec=new File(path+filename+".png");
			FileHandler.copy(src, dec);
		} 
		catch (IOException e) 
		{
			System.out.println("File path is not correct.");
			e.printStackTrace();
		}
	}
	

	
	
	
	
}
