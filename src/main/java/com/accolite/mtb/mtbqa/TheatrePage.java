package com.accolite.mtb.mtbqa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheatrePage extends PageObject {

	@FindBy(className="btn-sm")
	List<WebElement> showTimings;
	
	
	public TheatrePage(WebDriver driver) {
		super(driver);
	}

}
