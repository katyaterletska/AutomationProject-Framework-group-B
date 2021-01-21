package pageClasses;

import java.util.List;

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
	
	@FindBy (xpath="//app-slider-component[@name='priceRange']/div/div[2]/div[3]/div")
	public WebElement priceRangeSlider;
	
	@FindBy (xpath = "//span[@class='badge badge-pill badge-primary float-left']")
	public WebElement filterResult;
	
	@FindBy(xpath = "//div[@class='cabininfolink col-12']/a[@class='upsellpopupanchor ng-star-inserted']")
	public List<WebElement> fare;
	
	@FindBy(id="button0")
	public WebElement basicClassButton;
	
	@FindBy(id="button1")
	public WebElement mainClassButton;
	
	@FindBy(id="button2")
	public WebElement comfortClassButton;
	
	@FindBy(id="button3")
	public WebElement firstClassButton;
	
	@FindBy(xpath="//button[@class='exit-button hide-for-mobile']")
	public WebElement closeProductsButton;
	
	@FindBy(xpath="//img[contains(@src, 'be-woman-scarf-992.jpg')]")
	public WebElement basicClassImage;
	
	@FindBy(xpath="//img[contains(@src, 'mc-woman-updated-earbuds-992x335.jpg')]")
	public WebElement mainClassImage;
	
	@FindBy(xpath="//img[contains(@src, 'dc+-couple-drink-992.jpg')]")
	public WebElement comfortClassImage;
	
	@FindBy(xpath="//img[contains(@src, 'FirstClassHero_992x335.jpg')]")
	public WebElement firstClassImage;
	
	@FindBy(xpath="//a[@class='modify-link modify-btn-border']")
	public WebElement modifyButton;
	
	@FindBy(xpath = "//span[@aria-describedby='passengers-val']")
	public WebElement passengers;
	
	@FindBy(id = "ui-list-passengers5")
	public WebElement sixPassengers;
	
	@FindBy(xpath = "//span[@class='select-ui-text' and @id='passengers-val']")
	public WebElement actualPass;
	
	@FindBy(id = "btnSubmit")
	public WebElement modifySubmitButton;
	

}
