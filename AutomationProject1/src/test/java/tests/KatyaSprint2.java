package tests;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageClasses.KatyaWebsiteFooterPage;
import utilities.BrowserUtils;

public class KatyaSprint2 extends TestBase {

	@Test
	public void test1WebsiteFooter() {

//		Faker faker = new Faker();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		// page.searchForATopic.click();
		page.coronavirus.click();

		assertEquals(driver.getCurrentUrl(), "https://www.delta.com/us/en/travel-update-center/overview");

//		if (driver.getCurrentUrl().equals("https://www.delta.com/us/en/travel-update-center/overview")) {
//			System.out.println("Test1: PASS");
//		} else {
//			System.out.println("Test1: FAIL");
//		}
	}

	@Test
	public void test2WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.help.click();

		String actualText = driver.findElement(By.xpath("//span[@class='h1']")).getText();
		// System.out.println(actualErr);
		String expectedText = "Need Help?";

		assertEquals(expectedText, actualText);

	}

	@Test
	public void test3WebsiteFooter() {
		Faker faker = new Faker();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.searchForATopic.click();
		page.searchWindow.sendKeys("" + faker.random());

		String actualErr = driver
				.findElement(By.xpath("//div[@class='seatch-results-empty text-center ng-star-inserted']/span"))
				.getText();
		// System.out.println(actualErr);
		String expectedErr = "There are no matches for your search";

		assertEquals(expectedErr, actualErr);

//		if (actualErr.contains(expectedErr)) {
//			System.out.println("Test3: PASS");
//		} else {
//			System.out.println("Test3: FAIL");
//		}

	}

	@Test
	public void test4WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.aboutUs.click();

		assertEquals(driver.getCurrentUrl(), "https://www.delta.com/us/en/about-delta/overview");

//		if (driver.getCurrentUrl().equals("https://www.delta.com/us/en/about-delta/overview")) {
//			System.out.println("Test4: PASS");
//		} else {
//			System.out.println("Test4: FAIL");
//		}

	}

	@Test
	public void test5WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		String parentHandle = driver.getWindowHandle();
		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.career.click();
		page.searchCareer.click();
		BrowserUtils.waitFor(5);

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's
													// newly opened window)
		}

		assertEquals(driver.getCurrentUrl(), "https://delta.avature.net/careers");

//		if (driver.getCurrentUrl().equals("https://delta.avature.net/careers")) {
//			System.out.println("Test5: PASS");
//		} else {
//			System.out.println("Test5: FAIL");
//		}
	}

	@Test
	public void test6WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3100)");
		BrowserUtils.waitFor(2);
		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.tweetUs.click();
		BrowserUtils.waitFor(5);

		assertEquals(driver.getCurrentUrl(), "https://twitter.com/Delta");

//		if (driver.getCurrentUrl().equals("https://twitter.com/Delta")) {
//			System.out.println("Test6: PASS");
//		} else {
//			System.out.println("Test6: FAIL");
//		}
	}

	@Test
	public void test7WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3100)");
		BrowserUtils.waitFor(2);
		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.customerCommitment.click();
		BrowserUtils.waitFor(2);
		page.termsOfUse.click();
		BrowserUtils.waitFor(2);

		String actualTitle = driver.getTitle();
//		String expectedTitle = "Terms of Use";

		assertEquals(actualTitle.contains("Terms of Use"), true);

//		if (actualTitle.contains(expectedTitle)) {
//			System.out.println("Task7: PASS");
//		} else {
//			System.out.println("Task7: FAIL");
//		}

	}

	@Test
	public void test8WebsiteFooter() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3200)");
		BrowserUtils.waitFor(2);
		String parentHandle = driver.getWindowHandle();
		KatyaWebsiteFooterPage page = new KatyaWebsiteFooterPage();
		page.facebook.click();
		page.yesContinueToSite.click();
		BrowserUtils.waitFor(5);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's
													// newly opened window)
		}

		assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/delta");

//		if (driver.getCurrentUrl().equals("https://www.facebook.com/delta")) {
//			System.out.println("Test8: PASS");
//		} else {
//			System.out.println("Test8: FAIL");
//		}

	}
}