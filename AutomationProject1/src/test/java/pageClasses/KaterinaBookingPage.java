package pageClasses;

import java.util.List;

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
	
	@FindBy(className = "travelDateSelectionView")
	public WebElement calendarWindow;
	
	@FindBy(xpath = "//a[@aria-label = '1 February 2021, Monday']")
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
		
}
