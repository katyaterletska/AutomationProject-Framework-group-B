package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SanaGiftCardPage {
	
	public SanaGiftCardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="//div[@class='tout-btn-cta ml-auto mr-auto']//a[@href='/egift/eGiftPurchase.action?icid=PROD_eGift_Launch']")
	public WebElement buyGCRed;

	
	@FindBy(xpath="//button[@value='75']")
	public WebElement $75Card;
	
	
	@FindBy(xpath="//input[@class='recipientMailtxtbx']")
	public WebElement recipientName;

	
	@FindBy(xpath="//input[@id='sender_name_0']")
	public WebElement senderName;
	
	
	@FindBy(xpath="//input[@id='Confirm_email_0']")
	public WebElement emailField;
	
	
	@FindBy(xpath="//input[@id='other0']")
	public WebElement forOthersButton;
	
	
	@FindBy(xpath="//input[@id='egiftCreditCardNumber']")
	public WebElement creditCardNo;
	
	
	@FindBy(xpath="//input[@class='primary Continue']")
	public WebElement continueButton;
	
	
	@FindBy(xpath="//button[@class='ui-button ui-widget-content  banner-close-button ui-button-icon-only ']")
	public WebElement cookiesTab;

	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement acceptConditions;
	
	
	@FindBy(id="complete_purchase")
	public WebElement purchaseButton;
	
	
	@FindBy(xpath="//li[@id='divErrHolder4512']")
	public WebElement overlay;
	
	
	@FindBy(xpath="//p[@id='divErr4512']")
	public WebElement overlayMessage;
	
	
	@FindBy(xpath="//label[@id='sender_name_0-error'][@style='display: inline;']")
	public WebElement errorMessage;
	
	
	@FindBy(xpath="//label[@id='Confirm_email_0-error'][@style='display: inline;']")
	public WebElement emailError;
	
	@FindBy(xpath="//input[@name='amountPerCert_0']")
	public WebElement giftCardValue;
	
	@FindBy(xpath="//label[@id='value_text_0-error'][@style='display: inline;']")
	public WebElement AmountError;
	
	

	
}
