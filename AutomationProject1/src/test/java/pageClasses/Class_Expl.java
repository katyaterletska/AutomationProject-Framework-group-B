package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Class_Expl {
	
	public Class_Expl() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "exemple exemple exemple")
	public WebElement usernameField;
	
	@FindBy(id = "exemple exemple exemple")
	public WebElement passwordField;
	
	@FindBy(id = "exemple exemple exemple")
	public WebElement loginButton;
}
