package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageClasses.SanaHomePage;
import pageClasses.SanaLoginPage;
import pageClasses.SanaPasswordPage;
import utilities.BrowserUtils;

public class Sana extends TestBase{

	@Test
	public void positiveLogin() {
	
		SanaHomePage hp = new SanaHomePage ();
		SanaLoginPage lp = new SanaLoginPage();
		
		
		hp.homePage.click();
		
		lp.usernameField.sendKeys("tester007" + Keys.TAB); 
		lp.lastNameField.sendKeys("Tester" + Keys.TAB);
		
		lp.passwordField.sendKeys("Test007!007" + Keys.TAB);

		lp.loginButton.click();

		BrowserUtils.waitFor(10);
		
		jsExecutor.executeScript("arguments[0].click();", lp.accountSummary);
		
		//lp.accountSummary.click();

		String str = lp.accountNumber.getText();

		assertTrue(str.contains("#9342126274"), "Login Not Successful");
	}
	
	
	
	
	@Test (dataProvider = "negLN")
	public void negativeLoginLN(String user, String lastName) {
		
		SanaHomePage hp = new SanaHomePage ();
		SanaLoginPage lp = new SanaLoginPage();
		
		hp.homePage.click();
		
		lp.usernameField.sendKeys(user + Keys.TAB); 
		lp.lastNameField.sendKeys(lastName + Keys.TAB);


		String str = lp.errorMessage.getText();
		
		assertTrue(str.contains("Please enter a valid last name"), "LastName Not Verified");

	}
	
	@DataProvider (name = "negLN")
	public Object [][] getLN(){
		
		return new Object[][] {
			{"Tester007", "test cihazı"},
			{"Tester007", "tester007"},
			{"Tester007", "测试人员"},
			{"Tester007", "اختبار"},
			{"Tester007", "000000"},
			
		};
	}
	


	
	
	@Test
	public void negativeLoginWP() {

		SanaHomePage hp = new SanaHomePage ();
		SanaLoginPage lp = new SanaLoginPage();
		
		
		hp.homePage.click();
		
		lp.usernameField.sendKeys("tester007"); 
		lp.lastNameField.sendKeys("Tester" + Keys.TAB);
		
		//BrowserUtils.waitFor(10);
		
		lp.passwordField.sendKeys("Wr0ng!Pass");

		lp.loginButton.click();

		BrowserUtils.waitForVisibility(lp.overlayMessage, 10);
		
		String str = lp.overlayMessage.getText();
	
		assertTrue(str.contains("Oops! We're sorry, the information you've entered is not valid"), "Password Not Verified");

	}
	
	
	
	
	@Test (priority = -1, dataProvider = "negPass")
	public void negativeLoginNonEng(String pass) {

		SanaHomePage hp = new SanaHomePage ();
		SanaLoginPage lp = new SanaLoginPage();
		
		hp.homePage.click();
		
		lp.usernameField.sendKeys("Tester007" + Keys.TAB); 
		lp.lastNameField.sendKeys("Tester" + Keys.TAB); 
		
		BrowserUtils.waitForVisibility(lp.passwordField, 10);
		
		lp.passwordField.sendKeys(pass + Keys.TAB);
			
		String str = driver.findElement(By.xpath("//span[@class='errorMessageText ng-star-inserted']")).getText();
			
		assertTrue(str.contains("Looks like these login credentials aren't working"), "Password Not Verified");
			
		}
	

	@DataProvider (name = "negPass")
	public Object [][] getPass(){
		
		return new Object[][] {
			{"test cihazı"}, 
			{"测试人员"},
			{"اختبار"},	
		};
	}
	
	
	


	@Test
	public void negativeLoginDigits() {

		SanaHomePage hp = new SanaHomePage ();
		SanaLoginPage lp = new SanaLoginPage();
		
		
		hp.homePage.click();
		
		lp.usernameField.sendKeys("tester007"); 
		lp.lastNameField.sendKeys("Tester" + Keys.TAB);
		
		//BrowserUtils.waitFor(10);
		
		lp.passwordField.sendKeys("00000000");

		lp.loginButton.click();

		BrowserUtils.waitForVisibility(lp.overlayMessage, 10);
		
		String str = lp.overlayMessage.getText();
		
		assertTrue(str.contains("Whoops! Please enter valid login credentials"), "Password Not Verified");

	}
	
	
	
	
	@Test
	public void joinSkyMiles() {

		SanaHomePage hp = new SanaHomePage();
		SanaLoginPage lp = new SanaLoginPage();
		
		hp.homePage.click();
		
		lp.signUp.click();
		
		String actualURL = driver.getCurrentUrl();
		
		String expectedURL = "https://www.delta.com/profile/enrolllanding.action";
		

		assertTrue(actualURL.equals(expectedURL), "URL not verified");
			
		}
	
	
	
	
	@Test
	public void passwordResetLinks() {

		SanaHomePage hp = new SanaHomePage();
		SanaPasswordPage p = new SanaPasswordPage();
		
		
		hp.homePage.click();
		
		p.forgotPass.click();
		
		String str = driver.getTitle();

		Assert.assertTrue(str.contains("Forgot Login"), "Forgot Password Link Not Verified");
		
		driver.navigate().back();
		
		p.resetPass.click();
		
		String str2 = driver.getTitle();
			
		assertTrue(str2.contains("Reset Password"), "Reset Password Link Not Verified");
			
		}

	
	
	@Test
	public void verifyCheckbox() {
		
		SanaHomePage hp = new SanaHomePage();
		SanaLoginPage lp = new SanaLoginPage();
		
		hp.homePage.click();
		
		BrowserUtils.waitForPageToLoad(5);
		
		jsExecutor.executeScript("arguments[0].click();", lp.checkBox);
		
		assertTrue(lp.checkBox.isSelected());
		
		BrowserUtils.waitFor(5);
		
		jsExecutor.executeScript("arguments[0].click();", lp.checkBox);
		
		assertFalse(lp.checkBox.isSelected());
	}

	
	
}
