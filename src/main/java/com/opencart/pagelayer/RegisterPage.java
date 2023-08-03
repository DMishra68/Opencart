package com.opencart.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage  {
	public static WebDriver driver;
	public RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	//----------------------Obj repo----------------
	private By firstname_textbox=By.xpath("//input[@id='input-firstname']");
	private By lastname_textbox=By.xpath("//input[@id='input-lastname']");
	private By email_textbox=By.xpath("//input[@id='input-email']");
	private By telephone_textbox=By.xpath("//input[@id='input-telephone']");
	private By password_textbox=By.xpath("//input[@id='input-password']");
	private By confirmpassword_textbox=By.xpath("//input[@id='input-confirm']");
	private By privacypolicy_checkbox=By.xpath("//input[@name='agree']");
	private By contune_button=By.xpath("//input[@value='Continue']");
	
	//--------------------Action Method------------------
	public void enterFirstname(String firstname) {
		driver.findElement(firstname_textbox).sendKeys(firstname);
	}
	public void enterLastname(String lastname) {
		driver.findElement(lastname_textbox).sendKeys(lastname);
	}
	public void enterEmail(String email) {
		driver.findElement(email_textbox).sendKeys(email);
	}
	public void enterTelephone(String tele) {
		driver.findElement(telephone_textbox).sendKeys(tele);
	}
	public void enterPassword(String password) {
		driver.findElement(password_textbox).sendKeys(password);
	}
	public void enterConfirmPassowrd(String con_password) {
		driver.findElement(confirmpassword_textbox).sendKeys(con_password);
	}
	public void clickOnPrivacyPolicyCheckBox() {
		driver.findElement(privacypolicy_checkbox).click();
	}
	public void clickOnContuneBotton() {
		driver.findElement(contune_button).click();
	}
	
	
	
	
}
