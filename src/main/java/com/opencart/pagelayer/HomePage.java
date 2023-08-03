package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//---------------Obj repo--------------------
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	
	//-------------Action Method -----------------
	public void clickonMyAccount_Link() {
		myaccount_link.click();
	}
	
	public void clickOnLogin_Link() {
		login_link.click();
	}
	
	public void clickOnRegister_Link() {
		register_link.click();
	}

}
