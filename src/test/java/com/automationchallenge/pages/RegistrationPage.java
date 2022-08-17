package com.automationchallenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationchallenge.pages.test.PageObjects;

public class RegistrationPage extends PageObjects {
	
	@FindBy(name="name")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastName;
	
	@FindBy(name="m_status")
	private WebElement maritalStatus;
	
	@FindBy(name="hobby")
	private WebElement hobby;
	
	@FindBy(xpath="(//select[@name=''])[1]")
	private WebElement country;
	
	@FindBy(xpath="(//select[@name=''])[2]")
	private WebElement dobMonth;
	
	@FindBy(xpath="(//select[@name=''])[3]")
	private WebElement dobDay;
	
	@FindBy(xpath="(//select[@name=''])[4]")
	private WebElement dobYear;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@Type='file']")
	private WebElement profilePicture;
	
	@FindBy(xpath="//textarea[@name='']")
	private WebElement aboutYourself;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="c_password")
	private WebElement confirmPassword;
	
	@FindBy(xpath="(//INPUT[@type='submit'])[1]")
	private WebElement btnSubmit;
	
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isInitialized() {
		return firstName.isDisplayed();
	}
	
	public void enterNamePassword(String firstName, String lastName, String password, String confirmPassword) { 
		
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.lastName.sendKeys(password);
		this.lastName.sendKeys(confirmPassword);
		
	}
	
	public void enterHobbyMaritalStatus() {
		this.hobby.click();
		this.maritalStatus.click();
	}
	
	public void selectCounty(String country) {
		this.country.click();
		this.country.sendKeys(country);
	}
	
	public void enterDOB(String month, String day, String year) {
		this.dobMonth.sendKeys(month);
		this.dobDay.sendKeys(day);
		this.dobYear.sendKeys(year);
				
	}
	
	public void setCredentials(String userName, String email) {
		this.userName.sendKeys(userName);
		this.userName.sendKeys(email);
		
	}
	
	public void uploadPic() {
		String path = System.getProperty("user.dir") + "/src/test/java/resources/profile_pic.png";
		this.profilePicture.sendKeys(path);
	}
	
	public void inputAboutInfo(String aboutYourself) {
		this.aboutYourself.sendKeys(aboutYourself);
	}
	
	public void submitForm() {
		this.btnSubmit.click();
	}
}
