package tests;

import static org.testng.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageClasses.SanaGiftCardPage;
import pageClasses.SanaHomePage;
import utilities.BrowserUtils;

public class SanaSprint2 extends TestBase {
	
	
	
	@Test (groups = {"smoke"})
	public void verifyGiftCardLink() {
		
		SanaHomePage hp = new SanaHomePage();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		hp.giftCardsLink.click();
		
		String expectedLink = "https://www.delta.com/us/en/gift-cards/overview";
		String actualLink = driver.getCurrentUrl();
		
		assertTrue(actualLink.contains(expectedLink), "URL Not Verified");
	}
	
	
	
	@Test
	public void negativeCreditCard() {
	

		SanaHomePage hp = new SanaHomePage ();
		SanaGiftCardPage gp = new SanaGiftCardPage();
			
		BrowserUtils.scroll(0, 500);

		hp.giftCardsLink.click();
		
		BrowserUtils.scroll(0, 500);
		gp.buyGCRed.click();
		
		try {
			Alert alert2 = driver.switchTo().alert();
			alert2.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("No Feedback Alert was displayed");
		}
		
		BrowserUtils.waitForPageToLoad(10);
		
		gp.cookiesTab.click();
		
		BrowserUtils.scroll(0, 500);
		
		gp.$75Card.click();
		gp.recipientName.click();
		
		Actions a = new Actions(driver);
		a.sendKeys("Testee" + Keys.TAB).sendKeys("Tester" + Keys.TAB).sendKeys("testermail@gmail.com" + Keys.TAB)
		.sendKeys("testermail@gmail.com" + Keys.TAB).sendKeys("Enjoy your Vacation").build().perform();
		
		gp.forOthersButton.click();
		gp.continueButton.click();
		gp.creditCardNo.click();
		
		a.sendKeys("4440251478911590" + Keys.TAB).sendKeys("Test" + Keys.TAB).sendKeys("Tester" + Keys.TAB)
		.sendKeys("F" + Keys.TAB).sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN,Keys.DOWN, Keys.TAB)).sendKeys(Keys.TAB)
		.sendKeys("004" + Keys.TAB).sendKeys("123 Main St" + Keys.TAB).sendKeys(Keys.TAB).sendKeys("Vienna" + Keys.TAB)
		.sendKeys("V" + Keys.TAB).sendKeys("22182" + Keys.TAB).sendKeys("testmail@gmail.com" + Keys.TAB)
		.sendKeys("testmail@gmail.com" + Keys.TAB).sendKeys(Keys.TAB).sendKeys("703" + Keys.TAB)
		.sendKeys("5842017").build().perform();

		
		if(!gp.acceptConditions.isSelected()) {
			gp.acceptConditions.click();
				}
		
		gp.purchaseButton.click();
		
		BrowserUtils.waitForVisibility(gp.overlay, 5);
		
		String str = gp.overlayMessage.getText();
		
		assertTrue(str.contains("please enter a valid card number."), "CreditCard Not Verified");
	}
	
	
	
	@Test (dataProvider = "negSN")
	public void nonEngSenderName(String recipient, String sender) {
	

		SanaHomePage hp = new SanaHomePage ();
		SanaGiftCardPage gp = new SanaGiftCardPage();
			
		BrowserUtils.scroll(0, 500);

		hp.giftCardsLink.click();
		
		BrowserUtils.scroll(0, 500);
		gp.buyGCRed.click();
		
		
		BrowserUtils.waitForPageToLoad(10);
		
		gp.cookiesTab.click();
		
		BrowserUtils.scroll(0, 500);
		
		gp.$75Card.click();
		gp.recipientName.click();
		
		Actions a = new Actions(driver);
		a.sendKeys(recipient + Keys.TAB).sendKeys(sender + Keys.TAB).sendKeys("testermail@gmail.com" + Keys.TAB)
		.sendKeys("testermail@gmail.com" + Keys.TAB).sendKeys("Enjoy your Vacation").build().perform();
		
		gp.senderName.click();
		
		String str = gp.errorMessage.getText();
		
		assertTrue(str.contains("please enter a valid name to continue"), "Sender's Name Not Verified");
		
	}
	
	@DataProvider (name = "negSN")
	public Object [][] getSN(){
		
		return new Object[][] {
			{"Testee", "test cihazı"},
			{"Testee", "tester007"},
			{"Testee", "测试人员"},
			{"Testee", "اختبار"},
			{"Testee", "000000"},
			
		};
	}
	
	
	
	
	@Test ()
	public void mismatchEmails() {
	

		SanaHomePage hp = new SanaHomePage ();
		SanaGiftCardPage gp = new SanaGiftCardPage();
			
		BrowserUtils.scroll(0, 500);

		hp.giftCardsLink.click();
		
		BrowserUtils.scroll(0, 500);
		gp.buyGCRed.click();
		
		
		BrowserUtils.waitForPageToLoad(10);
		
		gp.cookiesTab.click();
		
		BrowserUtils.scroll(0, 500);
		
		gp.$75Card.click();
		gp.recipientName.click();
		
		Actions a = new Actions(driver);
		a.sendKeys("Testee" + Keys.TAB).sendKeys("Tester" + Keys.TAB).sendKeys("testermail@gmail.com" + Keys.TAB)
		.sendKeys("tester@gmail.com" + Keys.TAB).sendKeys("Enjoy your Vacation").build().perform();
		
		gp.emailField.click();
		
		String str = gp.emailError.getText();
		
		assertTrue(str.contains("the email addresses entered do not match"), "Email Not Verified");
		
	}
	

	@Test ()
	public void minGiftCardAmount() {
	

		SanaHomePage hp = new SanaHomePage ();
		SanaGiftCardPage gp = new SanaGiftCardPage();
			
		BrowserUtils.scroll(0, 500);

		hp.giftCardsLink.click();
		
		BrowserUtils.scroll(0, 500);
		gp.buyGCRed.click();
		
		BrowserUtils.waitForPageToLoad(10);
		
		gp.cookiesTab.click();
		
		BrowserUtils.scroll(0, 500);
		
		Actions a = new Actions(driver);
		gp.giftCardValue.click();
		
		a.sendKeys("10").sendKeys(Keys.TAB).build().perform();
		
		gp.giftCardValue.click();

		String str = gp.AmountError.getText();
		
		assertTrue(str.contains("please enter a minimum value of $50.00"), "Minimum Value Not Verified");
		
	}

	
	@Test ()
	public void maxGiftCardAmount() {
	

		SanaHomePage hp = new SanaHomePage ();
		SanaGiftCardPage gp = new SanaGiftCardPage();
			
		BrowserUtils.scroll(0, 500);

		hp.giftCardsLink.click();
		
		BrowserUtils.scroll(0, 500);
		gp.buyGCRed.click();
		
		BrowserUtils.waitForPageToLoad(10);
		
		gp.cookiesTab.click();
		
		BrowserUtils.scroll(0, 500);
		
		Actions a = new Actions(driver);
		gp.giftCardValue.click();
		
		a.sendKeys("1999").sendKeys(Keys.TAB).build().perform();
		
		gp.giftCardValue.click();

		String str = gp.AmountError.getText();
		
		assertTrue(str.contains("please enter a maximum value of $1000.00"), "Maximum Value Not Verified");
		
	}
	
	
	
	 
}
 