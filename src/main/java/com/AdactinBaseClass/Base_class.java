package com.AdactinBaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver ;//----> null
	 public static WebDriver get_Driver(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver2//chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//driver2//firefoxdriver.exe");
			driver = new  FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;

	}
		public static  void getUrl(String url) {
			driver.get(url);
			

		}
		public static void clickOnElement(WebElement element) {
			element.click();

		}
	public static void inputValueElement(WebElement element,String value) {
	element.sendKeys(value);

	}
//	public static void screenShot() throws Throwable {
//		TakesScreenshot tg = (TakesScreenshot) driver;
//		File s1 = tg.getScreenshotAs(OutputType.FILE);
//		File s2= new File("C:\\Users\\Hemanth\\eclipse-workspace\\Selenium_sept_concepts\\screenshot\\f4.png");
//		FileUtils.copyFile(s1, s2);

//	}

	public static void  implicitWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	public static void MouseMethode(WebElement element) {
		Actions aa = new Actions(driver);
		aa.moveToElement(element).build().perform();
	}
	
	public static void frames(WebElement element, String input, String type) {
		if (type.equalsIgnoreCase("next frame")) {
			driver.switchTo().frame(element);
		} else if (type.equalsIgnoreCase("Default")) {
			driver.switchTo().defaultContent();
		} else if (type.equalsIgnoreCase("size")) {
			int size = Integer.parseInt(input);
			System.out.println(size);
		} else {
			System.out.println("Invalid Type");
		}
	}

	public static void dropDown_single(WebElement element, String type, String values) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(values);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(values);
		} else {
			System.out.println("invalid type");
		}
	}

	public static void dropDown_multiple(WebElement element, String type) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("Get option")) {
		} else if (type.equalsIgnoreCase("get first Select option")) {
			WebElement First = s.getFirstSelectedOption();

			System.out.println(First);
		} else if (type.equalsIgnoreCase("get all selected option")) {
			java.util.List<WebElement> all = s.getAllSelectedOptions();
			System.out.println(all);
		} else if (type.equalsIgnoreCase("multiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} else {
			System.out.println("invalid type");
		}
	}

	
	
	
	

}
