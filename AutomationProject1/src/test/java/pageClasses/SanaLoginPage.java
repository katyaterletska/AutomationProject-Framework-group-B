package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SanaLoginPage {
	
	public SanaLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	@FindBy(xpath="//input[@id='userId']")
	public WebElement usernameField;
	
	@FindBy(xpath="//input[@aria-describedby='lastName-error']")
	public WebElement lastNameField;
	
	@FindBy(xpath="//input[@aria-describedby='password-error']")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@class='btn btn-danger loginButton']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//html/body/app-root/app-home/ngc-global-nav/header/div/nav/div/div[2]/ngc-login/div/div")
	public WebElement accountSummary;
	
	@FindBy(className = "miles-no")
	public WebElement accountNumber;
	
	@FindBy(xpath = "//div[@class='d-flex flex-row errorMessageDiv ng-star-inserted']")
	public WebElement errorMessage;

	@FindBy(xpath = "//div[@class='overlayText ng-star-inserted']")
	public WebElement overlayMessage;

	@FindBy(linkText = "Join SkyMiles")
	public WebElement signUp;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkBox;

}
