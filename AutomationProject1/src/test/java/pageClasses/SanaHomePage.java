package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SanaHomePage {
	
	public SanaHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	@FindBy(xpath="//div[@class='login-form-container ng-star-inserted']")
	public WebElement homePage;

	
	@FindBy(xpath="//a[@href='https://www.delta.com/us/en/gift-cards/overview']")
	public WebElement giftCardsLink;
	
}
