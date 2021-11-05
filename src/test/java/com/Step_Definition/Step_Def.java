package com.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.AdactinBaseClass.Base_class;
import com.Adactin_Pom.Page_Object_Manager;
import com.Test_Runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_class {

public static WebDriver driver = Test_Runner.driver;
public static Page_Object_Manager pom = new Page_Object_Manager(driver);

@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
getUrl("https://adactinhotelapp.com/");
	
}

@When("^user Enter The Username In Username Filed$")
public void user_Enter_The_Username_In_Username_Filed() throws Throwable {
inputValueElement(pom.getInstanceLP().getUsername(), "Hemanthkumar");
}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {

	inputValueElement(pom.getInstanceLP().getPassword(),  "hemanthkumar1324");
}

@Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {

	clickOnElement(pom.getInstanceLP().getLoginBtn());
}

@When("^user Select Loaction$")
public void user_Select_Loaction() throws Throwable {

	dropDown_single(pom.getInstanceSearch().getLoaction(), "visible", "Sydney");
}

@When("^user Select Hotels In Hotels Field$")
public void user_Select_Hotels_In_Hotels_Field() throws Throwable {
	dropDown_single(pom.getInstanceSearch().getHotel(), "visible","Hotel Creek");

}

@When("^user Select The Room Type In Room Type Field$")
public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {

	dropDown_single(pom.getInstanceSearch().getRoom_Type(), "visible", "Standard");
}

@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {

	dropDown_single(pom.getInstanceSearch().getNum_Rooms(), "value","1");
}

@When("^user Select The Checkin Data In Checkin Date Field$")
public void user_Select_The_Checkin_Data_In_Checkin_Date_Field() throws Throwable {
	inputValueElement(pom.getInstanceSearch().getChechIn(), "26/10/2021");
}

@When("^user Select The Check out Data In Check Out Field$")
public void user_Select_The_Check_out_Data_In_Check_Out_Field() throws Throwable {
	inputValueElement(pom.getInstanceSearch().getCheckOut(),"27/10/2021");
}

@When("^user Select The Adults Per Room In Adults Per Room Field$")
public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
	dropDown_single(pom.getInstanceSearch().getAdult_Room(),"value","1");
}

@When("^user Select The Child Per Room In Child Per Room Field$")
public void user_Select_The_Child_Per_Room_In_Child_Per_Room_Field() throws Throwable {
	dropDown_single(pom.getInstanceSearch().getChild_Room(),"value", "1");
}

@Then("^user Click The Search Button And It Navigate To Select Hotel$")
public void user_Click_The_Search_Button_And_It_Navigate_To_Select_Hotel() throws Throwable {
	clickOnElement(pom.getInstanceSearch().getSubmit());
}

@When("^user Click The Select Hotel In Select Hotel Field$")
public void user_Click_The_Select_Hotel_In_Select_Hotel_Field() throws Throwable {
	clickOnElement(pom.getInstanceselect().getRadioBtn());
}

@Then("^user Click The Continue Button And It Navigate To Book A Page$")
public void user_Click_The_Continue_Button_And_It_Navigate_To_Book_A_Page() throws Throwable {
	clickOnElement(pom.getInstanceselect().getContinuebtn());
}

@When("^user Enter The First Name In First Name Field$")
public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	inputValueElement(pom.getInstancebook().getFirstName(), "Hemanth");
}

@When("^user Enter The Last name In Last Name Field$")
public void user_Enter_The_Last_name_In_Last_Name_Field() throws Throwable {
	inputValueElement(pom.getInstancebook().getLastName(),"Kumar");
}

@When("^user Enter The Address In Address Field$")
public void user_Enter_The_Address_In_Address_Field() throws Throwable {
	inputValueElement(pom.getInstancebook().getAddress(),"Siva Sakthi Nagar");
}

@When("^user Enter The Credit Card No In Credit Card No Field$")
public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	inputValueElement(pom.getInstancebook().getCardNum(), "7894563217894561");
}

@When("^user Select The Credit Card Type In Credit Card Type Field$")
public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	dropDown_single(pom.getInstancebook().getCardType(),  "visible", "American Express");
}

@When("^user Select The Expiry Month In Expiry Month Field$")
public void user_Select_The_Expiry_Month_In_Expiry_Month_Field() throws Throwable {
	dropDown_single(pom.getInstancebook().getExpMonth(), "visible", "January");
}

@When("^user Select The Expiry Year In Expiry Year Field$")
public void user_Select_The_Expiry_Year_In_Expiry_Year_Field() throws Throwable {
	dropDown_single(pom.getInstancebook().getExpYear(), "visible", "2013");
}

@When("^user Select The CVV No In CVV Field$")
public void user_Select_The_CVV_No_In_CVV_Field() throws Throwable {
	inputValueElement(pom.getInstancebook().getCcvNum(), "321");
}

@Then("^user Click The Book Now Button And Navigate To Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_And_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	clickOnElement(pom.getInstancebook().getBook());
	implicitWait();
}

@Then("^User Click The My Itinerary Button And Navigate To My Itinerary Page$")
public void user_Click_The_My_Itinerary_Button_And_Navigate_To_My_Itinerary_Page() throws Throwable {
	clickOnElement(pom.getInstanceCnfrm().getSearchhotel());
}

@Then("^user Click The Logout Button And It Navigate To Home Page$")
public void user_Click_The_Logout_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	clickOnElement(pom.getInstanceItin().getBookeditinerary());
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
