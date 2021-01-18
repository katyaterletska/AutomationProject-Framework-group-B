package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Katya_POM2 {
	
	public Katya_POM2() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "basicInfoFirstName")
	public WebElement firstNameField;
	
	@FindBy(name = "customerDo.name.lastName")
	public WebElement lastNameField;
	
	@FindBy(id = "basicInfoGender-button")
	public WebElement genderPOM; 
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'Male')]")
	public WebElement a1;
	
	@FindBy(id = "basicInfoMob-button")
	public WebElement m1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'January')]")
	public WebElement m2;

	@FindBy(id = "basicInfoDob-button")
	public WebElement d1;
	
	@FindBy(xpath = "//li[@class='ui-menu-item'][contains(text(),'2')]")
	public WebElement d2;
	
	@FindBy(id = "basicInfoYob-button")
	public WebElement y1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'2000')]")
	public WebElement y2;
	
	@FindBy (xpath = "//input[@class ='traveler input_2 travellerTextBox OneLinkNoTx']")
	public WebElement travelN;
	
	@FindBy(id = "countryCode-1-button")
	public WebElement c1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'United States')]")
	public WebElement c2;
	
	@FindBy(id = "aType-1-button")
	public WebElement t1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'Home')]")
	public WebElement t2;
	
	@FindBy(xpath = "//input[@class ='validAddressLine1 input_2 accountStreetAddress dispBlock']")
	public WebElement w1;
	
	@FindBy(xpath = "//input[@class ='city input_2 proCity dispBlock']")
	public WebElement w2;
	
	@FindBy(id = "stateProv-1-button")
	public WebElement state1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'Virginia')]")
	public WebElement state2;
	
	@FindBy(xpath = "//input[@class ='accountPosCode input_2 dispBlock']")
	public WebElement r1;
	
	@FindBy(id = "phoneCountryCode-button")
	public WebElement r2;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'United States 1')]")
	public WebElement r3;
	
	@FindBy(xpath = "//input[@class ='areaCodeFix input_2 proPhoneNo marTop2 areacdRequired areaCd validAreaCode']")
	public WebElement n1;
	
	@FindBy(xpath = "//input[@class ='phoneNumber input_2 proPhoneNo marTop2']")
	public WebElement n2;
	
	@FindBy(xpath = "//input[@class ='emailId emailReqd input_2 OneLinkNoTx']")
	public WebElement n3;
	
	@FindBy(xpath = "//input[@class ='emailId emailReqd equalTo input_2 OneLinkNoTx']")
	public WebElement f1;
	
	@FindBy(xpath = "//input[@class ='userName input_2 floLeft OneLinkNoTx']")
	public WebElement f2;
	
	@FindBy(xpath = "//input[@class ='passWord pwdReqd max input_2']")
	public WebElement f3;
	
	@FindBy(xpath = "//input[@class ='passWord equalTo pwdReqd input_2']")
	public WebElement f4;
	
	@FindBy(id = "basicInfoQuestionId1-button")
	public WebElement q1;
	
	@FindBy(xpath = "//li[@role='option'][contains(text(),'What is the name of the first school you attended?')]")
	public WebElement q2;
	
	@FindBy(xpath = "//input[@class ='sqAnswr1 input_4 wid250']")
	public WebElement q3;
	
	@FindBy(id = "basicInfoQuestionId2-button")
	public WebElement g1;
	
	@FindBy(xpath = "//ul[@id ='basicInfoQuestionId2-menu']/li[2]")
	public WebElement g2;
	
	@FindBy(xpath = "//input[@class ='sqAnswr2 input_4 wid250']")
	public WebElement g3;
	
	@FindBy(xpath = "//input[@class='profileInfoInline floRight primary']")
	public WebElement complete1;



	
	
	
	
	
	
}