package com.Test_Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinBaseClass.Base_class;
import com.Adactin_Pom.Page_Object_Manager;

public class Adactin_TestRunner extends Base_class {
	public static	WebDriver driver =get_Driver("chrome");
	public static Page_Object_Manager pom = new  Page_Object_Manager(driver);
public static void main(String[] args) {
	getUrl("https://adactinhotelapp.com/");
	implicitWait();
	inputValueElement(pom.getInstanceLP().getUsername(), "Hemanthkumar");
	inputValueElement(pom.getInstanceLP().getPassword(),  "hemanthkumar1324");
	clickOnElement(pom.getInstanceLP().getLoginBtn());
	dropDown_single(pom.getInstanceSearch().getLoaction(), "visible", "Sydney");
	dropDown_single(pom.getInstanceSearch().getHotel(), "visible","Hotel Creek");
	dropDown_single(pom.getInstanceSearch().getRoom_Type(), "visible", "Standard");
	dropDown_single(pom.getInstanceSearch().getNum_Rooms(), "value","1");
	inputValueElement(pom.getInstanceSearch().getChechIn(), "26/10/2021");
	inputValueElement(pom.getInstanceSearch().getCheckOut(),"27/10/2021");
	dropDown_single(pom.getInstanceSearch().getAdult_Room(),"value","1");
	dropDown_single(pom.getInstanceSearch().getChild_Room(),"value", "1");
	clickOnElement(pom.getInstanceSearch().getSubmit());
	clickOnElement(pom.getInstanceselect().getRadioBtn());
	clickOnElement(pom.getInstanceselect().getContinuebtn());
	inputValueElement(pom.getInstancebook().getFirstName(), "Hemanth");
	inputValueElement(pom.getInstancebook().getLastName(),"Kumar");
	inputValueElement(pom.getInstancebook().getAddress(),"Siva Sakthi Nagar");
	inputValueElement(pom.getInstancebook().getCardNum(), "7894563217894561");
	dropDown_single(pom.getInstancebook().getCardType(),  "visible", "American Express");
	dropDown_single(pom.getInstancebook().getExpMonth(), "visible", "January");
	dropDown_single(pom.getInstancebook().getExpYear(), "visible", "2013");
	inputValueElement(pom.getInstancebook().getCcvNum(), "321");
	clickOnElement(pom.getInstancebook().getBook());
	implicitWait();
	clickOnElement(pom.getInstanceCnfrm().getSearchhotel());
	clickOnElement(pom.getInstanceItin().getBookeditinerary());
	 
	 
}	 

}
