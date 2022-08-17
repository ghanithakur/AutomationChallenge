package com.automationchallenge.pages.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.automationchallenge.pages.AlertPage;

public class AlertPageTest extends FunctionalTests {
	
	@Test
	public void alertPage() throws InterruptedException {
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		
		AlertPage alertPage = new AlertPage(driver);
		
		alertPage.clickButton();
						
				
		
	}

}
