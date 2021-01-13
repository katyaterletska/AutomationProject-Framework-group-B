package tests;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.Class_Expl;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;


public class Test_Expl extends TestBase {
	
	//*** Class where goes your code (Example!)
	//****use class with your name on it to create Tests there
	
	@Test
	
	public void test1UsingPOM() {

		//Class_Expl expl = new Class_Expl();
		//expl.usernameField.sendKeys("ExempleKeys");
		//BrowserUtils.waitFor(5);
		//BrowserUtils.takeScreenshot("Partial");
	    //BrowserUtils.takeFullScreenshot("Full");
		
  //************ + rest of your code
		
	}
	
@Test
	
	public void test2UsingPOM() {
	
  //************ + rest of your code
	
	}

@Test

public void test3UsingPOM() {

  //************ + rest of your code

}

@Test

public void test4UsingPOM() {
	
  //************ + rest of your code

}

@Test

public void test5UsingPOM() {

  //************ + rest of your code

}


}