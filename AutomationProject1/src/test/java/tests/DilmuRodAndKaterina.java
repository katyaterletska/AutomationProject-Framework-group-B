package tests;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageClasses.KaterinaBookingPage;
import pageClasses.KaterinaResultPage;
import utilities.BrowserUtils;

public class DilmuRodAndKaterina extends TestBase{

	    //DELTA-003-TC-01
	
	@Test  
	public void calendarBookingPage() {
		
		KaterinaBookingPage bp = new KaterinaBookingPage();
				
		bp.fromAirport.sendKeys("ATL");
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.toAirport.sendKeys("IAD");
		bp.searchWindow.click();
		bp.searchWindow.sendKeys(Keys.ENTER);
		bp.calendarWindow.click();
		bp.departureDate.click();
		bp.returnDate.click();
		bp.doneButton.click();

		String actualDeparture = driver.findElement(By.xpath("//*[@id=\"calDepartLabelCont\"]/input")).getAttribute("value");
		String actualReturn = driver.findElement(By.xpath("//*[@id=\"calReturnLabelCont\"]/input")).getAttribute("value");
	
		String testedDeparture = "02/01/2021";
		String testedReturn = "02/15/2021";

		assertEquals(actualDeparture, testedDeparture, "Departure date matched");
		assertEquals(actualReturn, testedReturn, "Return date matched");
		
		BrowserUtils.takeScreenshot("Calendar");

	}
	
		//DELTA-003-TC-02
	
	@Test  
	public void advancedSearchOption() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		
			bp.fromAirport.sendKeys("ATL");
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
			bp.toAirport.sendKeys("IAD");
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			bp.calendarWindow.click();
			bp.departureDate.click();
			bp.returnDate.click();
			bp.doneButton.click();
			bp.advanceSearch.click();
			String actualText1 = driver.findElement(By.id("faresFor-label")).getText();
			String testedText1 = "Best Fares For";
//			driver.getPageSource().contains("best fares for");
			assertEquals(actualText1, testedText1);		
			
			BrowserUtils.takeScreenshot("AdvancedSearch");
	}
		//DELTA-003-TC-03
	
	@Test
	public void faresOption() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		
			bp.fromAirport.sendKeys("ATL");
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
			bp.toAirport.sendKeys("IAD");
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
			bp.calendarWindow.click();
			bp.departureDate.click();
			bp.returnDate.click();
			bp.doneButton.click();
			bp.advanceSearch.click();
			BrowserUtils.hover(bp.fares);
			actions.click().build().perform();
			bp.firstClass.click();
			
//			List<WebElement> options = driver.findElements(By.id("faresFor-desc"));
//			ArrayList<String> currentOptions = new ArrayList<>();
//			for (WebElement element: options) {
//				currentOptions.add(element.getText());
//				System.out.println(currentOptions);
//			}
			
			String actualFare = driver.findElement(By.xpath("//*[@id=\"ui-list-faresFor3\"]")).getText();		
			String testedFare = "First Class";
			
			assertEquals(actualFare, testedFare);
			
			BrowserUtils.takeScreenshot("Fares");
			
	}
		
		//DELTA-003-TC-04
	
	@Test
	public void nonStopOption() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
			
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("IAD");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.calendarWindow.click();
				bp.departureDate.click();
				bp.returnDate.click();
				bp.doneButton.click();
				bp.advanceSearch.click();
				BrowserUtils.hover(bp.fares);
				actions.click().build().perform();
				bp.firstClass.click();
				bp.submitButton.submit();
			
			KaterinaResultPage rp = new KaterinaResultPage();
			
				rp.sortFilter.click();
				if((rp.stop1).isSelected()) {
				jsExecutor.executeScript("arguments[0].click();", rp.stop1);					
				}			

				assertTrue(!(rp.stop1).isSelected());
				
				BrowserUtils.takeScreenshot("NonStop");
		}
		
		//DELTA-003-TC-05
	
	@Test  
	public void extraInfoOption() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
			
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("IAD");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.calendarWindow.click();
				bp.departureDate.click();
				bp.returnDate.click();
				bp.doneButton.click();			
				bp.advanceSearch.click();
				bp.certificates.click();
				
				String actualTitle = driver.getTitle();
				String testedTitle = "View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air Lines";
				
				assertEquals(actualTitle,testedTitle);
				
				BrowserUtils.takeScreenshot("ExtraInfo");
		}	
	
		// DELTA-003-TC-06 - Rod's
	
	@Test
	public void errorMsgBookingPage() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
			
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("MSY");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.submitButton.submit();
			
				assertTrue(bp.departureError.isDisplayed());
			
				BrowserUtils.takeScreenshot("ErrorDepart");
		}
		
		// DELTA-003-TC-07 - Rod's
	
	@Test 
	public void searchResultsBookingPage() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
			
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("MSY");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.calendarWindow.click();
				bp.departureDate.click();
				bp.returnDate.click();
				bp.doneButton.click();
				bp.submitButton.submit();
				
				BrowserUtils.waitForTitleContains("Flight Results : Find & Book Airline Tickets : Delta Air Lines", 15);
//				System.out.println(driver.getTitle());
				assertTrue(driver.getTitle().contentEquals("Flight Results : Find & Book Airline Tickets : Delta Air Lines"));
				
				BrowserUtils.takeScreenshot("SearchResults");
		}
		
		
		//DELTA-003-TC-08 - Rod's
		
	@Test
	public void checkFunctions() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
				
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("MSY");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.calendarWindow.click();
				bp.departureDate.click();
				bp.returnDate.click();
				bp.doneButton.click();
					
				if(!(bp.miles).isSelected()) {
					jsExecutor.executeScript("arguments[0].click();", bp.miles);					
					}	
					
				bp.advanceSearch.click();
					
				if(!(bp.nearbyAirports).isSelected()) {
					jsExecutor.executeScript("arguments[0].click();", bp.nearbyAirports);					
					}	
					
				bp.submitButton.submit();
					
				BrowserUtils.waitForTitleContains("Flexible Airport Flight Result : Find & Book Airline Tickets : Delta Air Lines", 15);
					
				assertTrue(driver.getTitle().contentEquals("Flexible Airport Flight Result : Find & Book Airline Tickets : Delta Air Lines"));
				
				BrowserUtils.takeScreenshot("CheckFunctions");
			}
	
		//DELTA-003-TC-09 - Rod's
	
	@Test
	public void sameCityOption() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
					
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("ATL");
				bp.searchWindow.click();
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.calendarWindow.click();
				bp.departureDate.click();
				bp.returnDate.click();
				bp.doneButton.click();						
				bp.submitButton.submit();

				assertTrue((bp.airportError).isDisplayed());
				
				BrowserUtils.takeScreenshot("ErrorAirport");
												
		}
	
		// DELTA-003-TC-10 - Rod's
	
	@Test 
	public void VacationLink() {
			KaterinaBookingPage bp = new KaterinaBookingPage();
	
//			System.out.println(BrowserUtils.getElementsText(By.xpath("//a[@href='https://www.delta.com/us/en/delta-vacations']")));
		
			BrowserUtils.scroll(0, 500);
		
			bp.vacationOption.click();
		
//			System.out.println(driver.getTitle());
		
			assertTrue(driver.getTitle().contentEquals("Delta Vacations"));
			
			BrowserUtils.takeScreenshot("VacationLink");
	}
	
	
}
