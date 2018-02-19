package com.accolite.mtb.mtbqa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLandingPage extends PageObject {

	@FindBy(className="list-group-item")
	List<WebElement> theatres;
	
	@FindBy(partialLinkText="Logout")
	WebElement logoutButton;
	
	@FindBy(partialLinkText="Hello")
	WebElement profile;
	
	public LoginLandingPage(WebDriver driver) {
		super(driver);
		
	}
	
	public ProfilePage clickProfile() {
		profile.click();
		return new ProfilePage(driver);
	}
	
	
	public LoginPage clickLogoutButton() {
		logoutButton.click();
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
