package com.opencart.testLayer;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.testBase.TestBase;
import com.opencart.utility.UtilClass;

public class LoginPageTest extends TestBase {
	
	@Test
	public void validateUserLoginWithValidCradential() {
		
		HomePage home_obj=new HomePage(driver);
		LoginPage login_obj=new LoginPage(driver);
		UtilClass util_obj=new UtilClass();
		logger.info("Object creation homepage, login page, util class");
		String Expected_result="Account Login";
	//-----------------------------------------------------
		home_obj.clickonMyAccount_Link();
		home_obj.clickOnLogin_Link();
		logger.info("login page open");
	//------------------------------------------------------
		login_obj.enterEmail_Adress("dm123@gmail.com");
		login_obj.enterPassword("Test");
		login_obj.clickOnLoginButton();
		logger.info("login details enter and click on login button.");
	//------------------------------------------------------
		String Actual_result=util_obj.currentPageTitle();
		Assert.assertEquals(Actual_result,Expected_result);
		logger.info("Actual and Ecpected result match");
		
		
		
		
		}
	
	

}
