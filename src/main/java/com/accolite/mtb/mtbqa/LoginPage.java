package com.accolite.mtb.mtbqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
	
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	@FindBy(className="btn-success")
	WebElement registerButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterEmailId(String emailId) {
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public LoginLandingPage clickLogin() {
		loginButton.click();
		return new LoginLandingPage(driver);
	}

}
