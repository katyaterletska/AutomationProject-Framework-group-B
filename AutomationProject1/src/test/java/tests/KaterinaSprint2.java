package tests;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageClasses.KaterinaBookingPage;
import pageClasses.KaterinaResultPage;
import utilities.BrowserUtils;

public class KaterinaSprint2 extends TestBase{

	 //Sprint 2 TC-01
	
		@Test  
		public void priceSliderResultsPage() {
			
			KaterinaBookingPage bp = new KaterinaBookingPage();
					
			bp.fromAirport.sendKeys("ATL");
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
			bp.toAirport.sendKeys("IAD");
			bp.searchWindow.click();
			BrowserUtils.waitFor(3);
			bp.searchWindow.sendKeys(Keys.ENTER);		
			bp.calendarWindow.click();
			bp.pickMonth("February");
			String departureDate = "1 ";
			String departureMonth = "February";
			driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + departureDate + departureMonth + "')]")).click();
		
			bp.pickMonth("April");
			String arrivalDate = "1 ";
			String arrivalMonth = "April";
			driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + arrivalDate + arrivalMonth + "')]")).click();
			bp.doneButton.click();
			bp.submitButton.submit();
			BrowserUtils.waitForPageToLoad(15);

			KaterinaResultPage rp = new KaterinaResultPage();
			
				rp.sortFilter.click();
				if((rp.stop1).isSelected()) {
				jsExecutor.executeScript("arguments[0].click();", rp.stop1);					
				}		
			BrowserUtils.waitFor(5);	
			actions.moveToElement(rp.priceRangeSlider).clickAndHold().moveByOffset(-350,0).release().perform();

			String filtersChanged = rp.filterResult.getText();
					
			assertEquals(filtersChanged,"2");

				}
	
	//Sprint 2 TC-02
	
		@Test  (dataProvider = "getDates")
		public void datesBookingPage(String fromAirport, String toAirport, String pickFromMonth, String departureMonth,
												String departureDate, String pickToMonth, String arrivalMonth, String arrivalDate) {
			
			KaterinaBookingPage bp = new KaterinaBookingPage();
					
			bp.fromAirport.sendKeys(fromAirport);
			bp.searchWindow.click();
			bp.searchWindow.sendKeys(Keys.ENTER);
			bp.toAirport.sendKeys(toAirport);
			bp.searchWindow.click();
			BrowserUtils.waitFor(3);
			bp.searchWindow.sendKeys(Keys.ENTER);			
			bp.calendarWindow.click();
			
			bp.pickMonth(pickFromMonth);
			driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + departureDate + departureMonth + "')]")).click();
		
			bp.pickMonth(pickToMonth);
			driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + arrivalDate + arrivalMonth + "')]")).click();
			bp.doneButton.click();
			bp.submitButton.submit();

			BrowserUtils.waitForTitleContains("Flight Results : Find & Book Airline Tickets : Delta Air Lines", 15);
			assertTrue(driver.getTitle().contentEquals("Flight Results : Find & Book Airline Tickets : Delta Air Lines"));
		}
		
		@DataProvider
		public Object [][] getDates(){
			
			return new Object[][] {
				{"ATL", "IAD", "February", "February", "1 ", "March", "March", "1 "},
				
			};
		}
		
		//Sprint 2 TC-03
		
			@Test  (dataProvider = "getCity")
			public void cityFullNameBookingPage(String fromCity, String fromSelectCity, String toCity,
								String toSelectCity, String testedFromCity, String testedToCity) {
				
				KaterinaBookingPage bp = new KaterinaBookingPage();
										
				bp.fromAirport.sendKeys(fromCity);
				bp.searchWindow.click();
				
				for (WebElement elementFrom: bp.cityFullNameOptions) {
					if(elementFrom.getText().contains(fromSelectCity)) {
					elementFrom.click();
					break;
					}
				}
				
				bp.toAirport.sendKeys(toCity);
				bp.searchWindow.click();
				
					for (WebElement elementTo: bp.cityFullNameOptions) {
					if(elementTo.getText().contains(toSelectCity)) {
					elementTo.click();
					break;
					}
				}
						
				String actualFromCity = driver.findElement(By.xpath("//a[@id='fromAirportName']/span[@class='airport-desc']")).getText();
							
				String actualToCity = driver.findElement(By.xpath("//a[@id='toAirportName']/span[@class='airport-desc']")).getText();
				
				assertTrue(actualFromCity.contains(testedFromCity));
				assertTrue(actualToCity.contains(testedToCity));
				
			}		
			
			@DataProvider
			public Object [][] getCity(){
				
				return new Object[][] {
					{"Atlanta", "Atlanta", "Washington", "Washington", "Atlanta", "Washington"},
					
				};
			}
			
			//Sprint 2 TC-04
			
			@Test  
			public void productExpResultsPage() {
				
				KaterinaBookingPage bp = new KaterinaBookingPage();
						
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				BrowserUtils.waitFor(3);
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("IAD");
				bp.searchWindow.click();
				BrowserUtils.waitFor(3);
				bp.searchWindow.sendKeys(Keys.ENTER);		
				bp.calendarWindow.click();
				bp.pickMonth("February");
				String departureDate = "1 ";
				String departureMonth = "February";
				driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + departureDate + departureMonth + "')]")).click();
			
				bp.pickMonth("April");
				String arrivalDate = "1 ";
				String arrivalMonth = "April";
				driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + arrivalDate + arrivalMonth + "')]")).click();
				bp.doneButton.click();
				bp.submitButton.submit();
				BrowserUtils.waitForPageToLoad(15);

				KaterinaResultPage rp = new KaterinaResultPage();
				
				for (WebElement elementFrom: rp.fare) {
					if(elementFrom.getText().contains("First")) {
					elementFrom.click();
					}
				}
				
				rp.basicClassButton.click();
				assertTrue(rp.basicClassImage.isDisplayed());
				
				rp.mainClassButton.click();
				assertTrue(rp.mainClassImage.isDisplayed());
				
				rp.comfortClassButton.click();
				assertTrue(rp.comfortClassImage.isDisplayed());
				
				rp.firstClassButton.click();
				assertTrue(rp.firstClassButton.isDisplayed());
				
				rp.closeProductsButton.click();
				
	
		}
			
			//Sprint 2 TC-05
			
		@Test  
		public void modifyResultPage() {
				
				KaterinaBookingPage bp = new KaterinaBookingPage();
						
				bp.fromAirport.sendKeys("ATL");
				bp.searchWindow.click();
				BrowserUtils.waitFor(3);
				bp.searchWindow.sendKeys(Keys.ENTER);
				bp.toAirport.sendKeys("IAD");
				bp.searchWindow.click();
				BrowserUtils.waitFor(3);
				bp.searchWindow.sendKeys(Keys.ENTER);		
				bp.calendarWindow.click();
				bp.pickMonth("February");
				String departureDate = "1 ";
				String departureMonth = "February";
				driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + departureDate + departureMonth + "')]")).click();
			
				bp.pickMonth("April");
				String arrivalDate = "1 ";
				String arrivalMonth = "April";
				driver.findElement(By.xpath ("//a[starts-with(@aria-label,'" + arrivalDate + arrivalMonth + "')]")).click();
				bp.doneButton.click();
				bp.submitButton.submit();
				BrowserUtils.waitForPageToLoad(10);
				
				KaterinaResultPage rp = new KaterinaResultPage();
				
				rp.modifyButton.click();
				BrowserUtils.hover(rp.passengers);
				BrowserUtils.waitFor(5);
				actions.click().build().perform();
				rp.sixPassengers.click();
				
				String actualPass = rp.actualPass.getText();
				String testedPass = "6 Passengers";
				
				assertTrue(actualPass.equals(testedPass));
				BrowserUtils.waitFor(5);
				rp.modifySubmitButton.submit();
				
				
			}
		
		//Sprint 2 TC-06
		
	@Test  
	public void feedbackBookingPage() {
						
		KaterinaBookingPage bp = new KaterinaBookingPage();
				
				bp.cookieClose.click();
				bp.feedbackButton.click();
				bp.fiveStarRaiting.click();
				bp.bookTripFeedback.click();
				bp.comments.sendKeys("Awesome!");
				bp.submitFeedbackButton.click();
				String feedback = driver.findElement(By.id("acsFeedbackDialogTitle")).getText();
				assertTrue(driver.getPageSource().contains(feedback));
				bp.okButton.click();
				
	}
	
}
