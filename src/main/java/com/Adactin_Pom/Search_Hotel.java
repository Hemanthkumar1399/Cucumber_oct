package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(id="location")
	 private WebElement loaction;
	 @FindBy(id="hotels")
	 private WebElement hotel;
	 @FindBy(id="room_type")
	 private WebElement room_Type;
	 @FindBy(id="room_nos")
	 private WebElement num_Rooms;
	 @FindBy(id="datepick_in")
	 private WebElement chechIn;
	 @FindBy(id="datepick_out")
	 private WebElement checkOut;
	 @FindBy(id="adult_room")
	 private WebElement adult_Room;
	 @FindBy(id="child_room")
	 private WebElement child_Room;
	 @FindBy(id="Submit")
	 private WebElement submit;
	public WebElement getLoaction() {
		return loaction;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom_Type() {
		return room_Type;
	}
	public WebElement getNum_Rooms() {
		return num_Rooms;
	}
	public WebElement getChechIn() {
		return chechIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdult_Room() {
		return adult_Room;
	}
	public WebElement getChild_Room() {
		return child_Room;
	}
	public WebElement getSubmit() {
		return submit;
	}

public Search_Hotel(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

}
