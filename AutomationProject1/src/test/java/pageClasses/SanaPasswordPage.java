package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SanaPasswordPage {
	
	public SanaPasswordPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='/user-login/forgotLogin']")
	public WebElement forgotPass;
	
	@FindBy(xpath = "//a[@href='/user-login/resetPassword']")
	public WebElement resetPass;
	
	
}
