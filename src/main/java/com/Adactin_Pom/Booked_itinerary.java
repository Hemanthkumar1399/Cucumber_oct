package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itinerary {
	
public WebDriver driver ;
	
	@FindBy(xpath = "//a[.='Booked Itinerary']")
	private WebElement bookeditinerary;
	
	public Booked_itinerary(WebDriver driver2) {
		 this.driver = driver2;
		 PageFactory.initElements(driver, this);	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBookeditinerary() {
		return bookeditinerary;
	}

}
