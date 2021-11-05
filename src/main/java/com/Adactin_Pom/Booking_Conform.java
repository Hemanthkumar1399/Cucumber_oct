package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conform {
	
	public WebDriver driver ;
	
	@FindBy(id = "search_hotel")
	private WebElement searchhotel;
	
	public Booking_Conform(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchhotel() {
		return searchhotel;
	}
	}


