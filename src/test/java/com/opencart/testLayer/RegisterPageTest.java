//package com.opencart.testLayer;
//
//import org.junit.Assert;
//import org.testng.annotations.Test;
//
//import com.opencart.pagelayer.HomePage;
//import com.opencart.pagelayer.RegisterPage;
//import com.opencart.testBase.TestBase;
//import com.opencart.utility.ExcelTestData;
//import com.opencart.utility.UtilClass;
//
//public class RegisterPageTest extends TestBase {
//	
//	@Test
//	public void validateRegisterPager() throws Exception {
//		HomePage home_obj=new HomePage(driver);
//		RegisterPage register_obj=new RegisterPage(driver);
//		UtilClass util_obj=new UtilClass();
//		logger.info("Object created for homepage, Registerpage, util page.");
//		String expected_result="Your Account Has Been Created!";
//	//---------------Action on home  page-----------------------------------------	
//		home_obj.clickonMyAccount_Link();
//		home_obj.clickOnRegister_Link();
//		logger.info("Register page open");
//	//------------Action on register page-----------------------------------------
//		
//		register_obj.enterFirstname(excel_data.readData("RegisterTestData",1,1));
//		register_obj.enterLastname(excel_data.readData("RegisterTestData",1,2));
//		register_obj.enterEmail(excel_data.readData("RegisterTestData",1,3));
//		register_obj.enterTelephone(excel_data.readData("RegisterTestData",1,4));
//		register_obj.enterPassword(excel_data.readData("RegisterTestData",1,5));
//		register_obj.enterConfirmPassowrd(excel_data.readData("RegisterTestData",1,6));
//		register_obj.clickOnPrivacyPolicyCheckBox();
//		register_obj.clickOnContuneBotton();
//		logger.info("all user information provided on registor page.");
//	//----------------asserstion--------------------------------------------------
//		String actual_result=util_obj.currentPageTitle();
//		Assert.assertEquals(actual_result,expected_result);	
//		logger.info("actual and expected result match.");
//	}
//
//}
