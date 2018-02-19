package com.accolite.mtb.mtbqa;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestObject{
	WebDriver driver;
	
	@BeforeClass
	public void init() {
		driver = getDriver();
	}
	
	@Test
	public void testLoginPage() {
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("http://10.0.2.2");
		
		LandingPage landingpage = new LandingPage(driver);
		
		LoginPage loginpage= landingpage.clickLoginButton();
		loginpage.enterEmailId("sathya@mail.com");
		loginpage.enterPassword("sathya123");
		LoginLandingPage loginlandingpage = loginpage.clickLogin();
		assertTrue(loginlandingpage.profile.isDisplayed());	
	}
	
	
	
}
