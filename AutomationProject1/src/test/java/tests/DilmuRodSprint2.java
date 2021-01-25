package tests;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.xalan.templates.ElemText;
import org.eclipse.jetty.util.MathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import net.bytebuddy.utility.RandomString;

import pageClasses.KaterinaBookingPage;
import pageClasses.KaterinaResultPage;
import utilities.BrowserUtils;

public class DilmuRodSprint2 extends TestBase {

	// SPRINT2-TC-01 TO VERIFY MULTI-CITY OPTION AND CONFIRM IT IS LOADING NEW PAGE OPTIONS

	@Test (groups = {"smoke"})

	public void multipleCity() {

		KaterinaBookingPage bp = new KaterinaBookingPage();

		bp.fromAirport.sendKeys("ATL");
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.toAirport.sendKeys("MSY");
		bp.searchWindow.click();
//		BrowserUtils.waitFor(5);
		bp.searchWindow.sendKeys(Keys.ENTER);

		bp.tripType.click();
		BrowserUtils.hover(bp.tripType);
		// BrowserUtils.waitFor(5);
		bp.multiCity.click();
		actions.click().build().perform();

		String result = driver.findElement(By.id("selectTripType-val")).getText();

		assertEquals(result, "Multi-City");

	}

	// SPRINT2-TC-02 TO VERIFY BOOKING RESULTS FOR RANDOM NUMBER OF PASSENGERS

	@Test

	public void randomNumberOfPassengers() {

		KaterinaBookingPage bp = new KaterinaBookingPage();

		bp.fromAirport.sendKeys("NYC");
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.toAirport.sendKeys("LAX");
		bp.searchWindow.click();
		BrowserUtils.waitFor(3);
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.calendarWindow.click();
		bp.pickMonth("April");
		String departureDate = "1 ";
		String departureMonth = "April";
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + departureDate + departureMonth + "')]")).click();

		bp.pickMonth("May");
		String arrivalDate = "1 ";
		String arrivalMonth = "May";
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + arrivalDate + arrivalMonth + "')]")).click();
		bp.doneButton.click();
		bp.submitButton.submit();
		BrowserUtils.waitForPageToLoad(5);

		int randomPassNum = (int) (Math.random() * 10);

		bp.passengers.sendKeys("" + randomPassNum);

		BrowserUtils.waitForPageToLoad(5);

		String expected = "" + randomPassNum;

		assertTrue(driver.getPageSource().contains(expected));
	}

	// SPRINT2-TC-03 TO VERIFY 3 DIFFERENT SEARCH RESULTS USING DATAPROVIDER

	@Test(dataProvider = "getMultipleData")
	public void verifyThreeDifferentSearchResults(String fromCity, String toCity, String fromMonth, String departureDay,
			String departureMonth, String toMonth, String arrivalDay, String arrivalMonth) {
		KaterinaBookingPage bp = new KaterinaBookingPage();

		bp.fromAirport.sendKeys(fromCity);
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.toAirport.sendKeys(toCity);
		bp.searchWindow.click();
		BrowserUtils.waitFor(3);
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.calendarWindow.click();
		bp.pickMonth(fromMonth);

		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + departureDay + departureMonth + "')]")).click();

		bp.pickMonth(toMonth);

		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + arrivalDay + arrivalMonth + "')]")).click();
		bp.doneButton.click();
		bp.submitButton.submit();

		BrowserUtils.waitForTitleContains("Flight Results : Find & Book Airline Tickets : Delta Air Lines", 15);
//		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contentEquals("Flight Results : Find & Book Airline Tickets : Delta Air Lines"));

	}

	@DataProvider
	public Object[][] getMultipleData() {

		return new Object[][] { { "ATL", "NYC", "March", "1 ", "March", "May", "15 ", "May" }
//				,{ "NYC", "LAX", "May", "18 ", "May", "August", "17 ", "August" }
//				,{ "LAX", "ATL", "August", "25 ", "August", "September", "6 ", "September" } 
		};

	}

	// SPRINT2-TC-04 TO PULL ALL THE LINKS ON MAIN PAGE AND VERIFY THAT IT CONTAINS
	// "NEED HELP?"

	@Test
	public void verifyAllLinksOnBookingPage() {

		BrowserUtils.getElementsText(By.tagName("a"));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		List<String> elemTexts = new ArrayList<>();
		for (WebElement link : links) {
			if (link.isDisplayed()) {
				elemTexts.add(link.getText());
				System.out.println(elemTexts);

			}
		}
		BrowserUtils.waitForPageToLoad(10);
		// String expectedLink = "Need Help?";
		assertTrue(elemTexts.contains("Need Help?"));

	}

	// SPRINT2-TC-05 TO VERIFY INFO AFTER SEARCHING THE FLIGHT, IN THE RESULT PAGE, AMENITIES/FLIGHT DETAILS 
	// NEW POP-UP WINDOW 
	

	@Test(dataProvider = "getMultipleData_1")
	public void verifyThreeDifferentSearchResul(String fromCity, String toCity, String fromMonth, String departureDay,
			String departureMonth, String toMonth, String arrivalDay, String arrivalMonth) {

		KaterinaBookingPage bp = new KaterinaBookingPage(); 

		bp.fromAirport.sendKeys(fromCity);
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.toAirport.sendKeys(toCity);
		bp.searchWindow.click();
		BrowserUtils.waitFor(3);
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.calendarWindow.click();
		bp.pickMonth(fromMonth);

		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + departureDay + departureMonth + "')]")).click();

		bp.pickMonth(toMonth);

		driver.findElement(By.xpath("//a[starts-with(@aria-label,'" + arrivalDay + arrivalMonth + "')]")).click();
		bp.doneButton.click();
		bp.submitButton.submit();

		BrowserUtils.waitForPageToLoad(5);
			
		KaterinaResultPage rp = new KaterinaResultPage();
		
		
		for (WebElement elementFrom: rp.fare) {
			if(elementFrom.getText().contains("Comfort")) {
			elementFrom.click();
			}
		}
		assertTrue(driver.getPageSource().contains("Airport Experience"));
		
	}

	@DataProvider
	public Object[][] getMultipleData_1() {

		return new Object[][] { { "ATL", "MIA", "March", "1 ", "March", "May", "15 ", "May" }

		};
	}
}
