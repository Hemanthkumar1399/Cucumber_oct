package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver ;
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	
	@FindBy(id = "login")
	private WebElement loginBtn;


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public Login_page(WebDriver ab) {
		this.driver = ab;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

}
