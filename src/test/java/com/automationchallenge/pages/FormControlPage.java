package com.automationchallenge.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationchallenge.pages.test.PageObjects;

public class FormControlPage extends PageObjects {
	
	@FindBy(id="exp")
	private WebElement experience;
	
	@FindBy(id="check_java")
	private WebElement javaChkBox;
	
	@FindBy(id="check_python")
	private WebElement pyChkBox;
	
	@FindBy(id="check_javascript")
	private WebElement jsChkBox;
	
	@FindBy(id="rad_selenium")
	private WebElement selRadio;
	
	@FindBy(id="rad_protractor")
	private WebElement proRadio;
	
	@FindBy(id="select_tool")
	private WebElement skillSelenium;
	
	@FindBy(xpath="//option[@value='java'][text()='Java']")
	private WebElement language;
	
	@FindBy(id="notes")
	private WebElement notes;
	
	@FindBy(xpath="//LABEL[@class='custom-control-label'][text()='Speaks German?']")
	private WebElement speakGerman;
	
	@FindBy(id="fluency")
	private WebElement gerFluency;
	
	@FindBy(id="upload_cv")
	private WebElement uploadCV;
	
	@FindBy(id="upload_files")
	private WebElement uploadFile;
	
	@FindBy(id="validationCustom03")
	private WebElement city;
	
	@FindBy(id="validationCustom04")
	private WebElement state;
	
	@FindBy(id="validationCustom05")
	private WebElement zip;
	
	@FindBy(id="invalidCheck")
	private WebElement agreeTerms;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement btnSubmit;
	
	

	public FormControlPage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean isInitialized() {
		return experience.isDisplayed();
	}
	
	public void yearsOfExperience(String experience) {
		this.experience.sendKeys(experience);
		
	}
	
	
	public void selectProgLanguages() {
		this.javaChkBox.click();
		this.jsChkBox.click();
		this.pyChkBox.click();
	}
	
	public void selectFrameWork() {
		this.proRadio.click();
		this.selRadio.click();
	}
	
	public void selectPrimarySkill(String skill) {
		this.skillSelenium.sendKeys(skill);
	}
	
	public void chooseLanguage() {
		this.language.click();
	}
	
	public void enterNotes(String notes) {
		this.notes.sendKeys(notes);
	}
	
	public void selectGerman() {
		this.speakGerman.click();
	}
	
	public void germanFluence() {
		this.gerFluency.sendKeys(Keys.RIGHT);
	}

	
	public void uploadCV() {
		String path = System.getProperty("user.dir") + "/src/test/java/resources/blank.pdf";
		this.uploadCV.sendKeys(path);
	}
	
	public void uploadFile() {
		String path = System.getProperty("user.dir") + "/src/test/java/resources/profile_pic.png";
		this.uploadFile.sendKeys(path);
	}
	
	public void enterCityStateZip(String City, String State, String Zip) {
		this.city.sendKeys(City);
		this.state.sendKeys(State);
		this.zip.sendKeys(Zip);
	}
	
	public void agreeTerms() {
		this.agreeTerms.click();
	}
	
	public void submitForm() {
		this.btnSubmit.click();
	}

}
