package com.accolite.mtb.mtbqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends PageObject {

	@FindBy(className="list-group-item")
	List<WebElement> theatres;
	
	@FindBy(partialLinkText="Login")
	WebElement loginButton;
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage clickLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("growl-item")));
		loginButton.click();
		return new LoginPage(driver);
	}
	
	public TheatrePage clickTheatre(String theatreName) {
		for(WebElement e:theatres) {
			if(e.getText().contains(theatreName)) {
				e.click();
				break;
			}
		}
		return new TheatrePage(driver);
	}
		
}
