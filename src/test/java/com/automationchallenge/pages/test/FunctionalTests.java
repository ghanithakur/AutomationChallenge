package com.automationchallenge.pages.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class FunctionalTests {
	
protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		String currentPath = "/src/test/java/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + currentPath);
		driver = new ChromeDriver();
		
	}
	
	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}	
}

