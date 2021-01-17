package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Katya_POM {
	
	public Katya_POM() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	@FindBy(xpath = "//a[.='Sign Up']")
	public WebElement signUpButton;
}
    