package com.automationchallenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationchallenge.pages.test.PageObjects;

public class AlertPage extends PageObjects {
	
	@FindBy(className="demo-frame")
	private WebElement iFrame;
	
	@FindBy(xpath="//button[contains(text(), 'Click the button to display an alert box:' )]")
	private WebElement buttonForAlert;
	

	public AlertPage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean isInitialized() {
		return iFrame.isDisplayed();
	}
	
	public void clickButton() {
		driver.switchTo().frame(iFrame);
		this.buttonForAlert.click();
		driver.switchTo().alert().accept();
		
	}
	
}
