package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	 private WebElement radioBtn;
	 @FindBy(id="continue")
	 private WebElement continuebtn;
	 
	 public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public Select_Hotel(WebDriver driver2) {
this.driver = driver2;
	 PageFactory.initElements(driver, this);
	 
	 }

}
