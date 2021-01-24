package pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KaterinaBookingPage {
	
	public KaterinaBookingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "fromAirportName")
	public WebElement fromAirport;
	
	@FindBy (id = "search_input")
	public WebElement searchWindow;
	
	@FindBy(id = "toAirportName")
	public WebElement toAirport;
	
	@FindBy(xpath = "//div[@class='search-results d-none pl-1 d-block']/ul/li")
	public List<WebElement> cityFullNameOptions;
	
	@FindBy(className = "travelDateSelectionView")
	public WebElement calendarWindow;
	
	@FindBy(xpath = "//a[starts-with(@aria-label,'1 February')]")
	public WebElement departureDate;
	
	@FindBy(xpath = "//a[@aria-label = '15 February 2021, Monday']")
	public WebElement returnDate;
	
	@FindBy(className = "donebutton")
	public WebElement doneButton;
	
	@FindBy(id = "adv-search")
	public WebElement advanceSearch;
	
	@FindBy (id = "faresFor-desc")
	public WebElement fares;
	
	@FindBy(id = "ui-list-faresFor3")
	public WebElement firstClass;
	
	@FindBy(id = "btn-book-submit")
	public WebElement submitButton;
	
	@FindBy(id = "ecredits")
	public WebElement certificates;
	
	@FindBy(xpath = "//input[@id ='shopWithMiles']")
	public WebElement miles;
	
	@FindBy(id = "nearbyAirports")
	public WebElement nearbyAirports;
	
	@FindBy(id = "airports-error")
	public WebElement airportError;
	
	@FindBy (id = "departureDate-error1")
	public WebElement departureError;
	
	@FindBy (xpath = "//a[@href='https://www.delta.com/us/en/delta-vacations']")
	public WebElement vacationOption;
	
	@FindBy (xpath = "//div[@class = 'col-lg-12 left-band']/ul/li/a")
	public List<WebElement> shoppingLinks;
	
	@FindBy (xpath = "//a[@href='/en_US/traveling-with-us/baggage/before-your-trip/checked']")
	public WebElement baggageOption;
	
	@FindBy (xpath = "//a[@class='dl-datepicker-1']")
	public WebElement nextMonthButton;
	
	@FindBy (xpath = "//span[@class='dl-datepicker-month-0']")
	public WebElement firstMonthOption;
	
	@FindBy (xpath = "//span[@class='dl-datepicker-month-1']")
	public WebElement secondMonthOption;
	
	public void pickMonth(String month) {
		while(!firstMonthOption.getText().equals(month) && !secondMonthOption.getText().equals(month)) {
			nextMonthButton.click();
		}
	}
	
	public WebElement getDateMonth(String date, String month) {
		String xpath = "//a[starts-with(@aria-label,'" + date + month + "')]";
		return Driver.getDriver().findElement(By.xpath(xpath));		
	}
	
	@FindBy(xpath="//span[@class='feedbackLink mx-auto']/a")
	public WebElement feedbackButton;
	
	@FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")
	public WebElement cookieClose;
	
	@FindBy(xpath = "//label[@alt='5 stars']")
	public WebElement fiveStarRaiting;
	
	@FindBy(xpath = "//label[@for='_POP0248607A002']")
	public WebElement bookTripFeedback;
	
	@FindBy(id="acs_objPOP0248627")
	public WebElement comments;
	
	@FindBy(xpath = "//button[@class='acs-feedback__button acs-feedback__button--expand acs-submit-feedback__button']")
	public WebElement submitFeedbackButton;
	
	@FindBy(xpath = "//*[@id=\"acsModalContent\"]/div[2]/div/button")
	public WebElement okButton;
		
}
