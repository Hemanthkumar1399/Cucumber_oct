package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinBaseClass.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\adatin.feature",

		glue = "com.Step_Definition",
		
		monochrome = true ,
		
		plugin = {"html:Report/HtmlReport",
				"pretty",
				"json:JsonReport/Report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:ReportNew/File.html"}
		
		)
public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
driver = Base_class.get_Driver("chrome");
		
		
		
		
		
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();

		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
