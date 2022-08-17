package com.automationchallenge.pages.test;

import org.junit.Test;

import com.automationchallenge.pages.FormControlPage;

public class FormControlPageTest extends FunctionalTests {

	@Test
	public void FormControls() {
		driver.get("https://dineshvelhal.github.io/testautomation-playground/forms.html?");
		
		FormControlPage formControlPage = new FormControlPage(driver);
		
		formControlPage.yearsOfExperience("10");
		
		formControlPage.chooseLanguage();
		
		formControlPage.selectFrameWork();
		
		formControlPage.selectPrimarySkill("Selenium");
		
		formControlPage.chooseLanguage();
		
		formControlPage.enterNotes("Testing please ignore");
		
		formControlPage.selectGerman();
		
		formControlPage.germanFluence();
		
		formControlPage.uploadCV();
		
		formControlPage.uploadFile();
		
		formControlPage.enterCityStateZip("Millersville", "MD", "21108");
		
		formControlPage.agreeTerms();
		
		formControlPage.submitForm();
	}
}
