package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//---------------Obj repo--------------------
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement email_address_txtbox;
		
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement password_txtbox;
		
		@FindBy(xpath="//input[@value='Login']")
		private WebElement login_button;
		@FindBy(xpath="//img[@class='img-responsive']")
		private WebElement logo;
		
	//-------------Action Method -----------------
		public void enterEmail_Adress( String email) {
			email_address_txtbox.sendKeys(email);
		}
		
		public void enterPassword(String password) {
			password_txtbox.sendKeys(password);
		}
		
		public void clickOnLoginButton() {
			login_button.click();;
		}
		public void takeScreenshot() {
			
		}
		
}
