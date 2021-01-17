package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KaterinaResultPage {
	public KaterinaResultPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[3]/button")
	public WebElement sortFilter;
	
	@FindBy(xpath = "//input[@id='stopType_1']")
	public WebElement stop1;

}
