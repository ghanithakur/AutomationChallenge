package com.automationchallenge.pages.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.automationchallenge.pages.FormControlPage;
import com.automationchallenge.pages.RegistrationPage;

public class RegistrationPageTest extends FunctionalTests {
	
	@Test
	public void Registration() {
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		
		RegistrationPage registrationPage = new RegistrationPage(driver);
		assertTrue(registrationPage.isInitialized());
		
		registrationPage.enterNamePassword("Usman", "Thakur", "password", "password");
		
		registrationPage.enterHobbyMaritalStatus();
		
		registrationPage.enterDOB("1", "1", "2014");
		
		registrationPage.selectCounty("India");
		
		registrationPage.setCredentials("thakurusman", "thakurusman@gmail.com");
		
		registrationPage.inputAboutInfo("testing please ignore");
		
		registrationPage.uploadPic();
		
		registrationPage.submitForm();
	}

	
}
