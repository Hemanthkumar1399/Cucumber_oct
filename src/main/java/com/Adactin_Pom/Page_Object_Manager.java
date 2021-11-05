package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	public WebDriver driver;
	private Login_page lp;
	private Search_Hotel search ;
	private Select_Hotel selecthotel ;
	private Book_Hotel  bookHotel;
	private Booking_Conform bookingcnfrm;
	private Booked_itinerary logout;
	public Page_Object_Manager(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		
		return driver;
	}
	
	public Login_page getInstanceLP() {
		
		lp = new Login_page(driver);
		return lp;
		
		
		
	}
	public  Search_Hotel getInstanceSearch() {
		search = new Search_Hotel(driver);
		return search;

	}

	public Select_Hotel getInstanceselect() {
		selecthotel = new Select_Hotel(driver);
		return selecthotel;
	}
	public Book_Hotel getInstancebook() {
		bookHotel = new Book_Hotel(driver);
		return bookHotel;
	}
	public Booking_Conform getInstanceCnfrm() {
		
		bookingcnfrm = new Booking_Conform(driver);
		
		return bookingcnfrm;

	}
	public Booked_itinerary getInstanceItin() {
		
		logout = new Booked_itinerary(driver);
		
		return logout;
	}


	
	}


