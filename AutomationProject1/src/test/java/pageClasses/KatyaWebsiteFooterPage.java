package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KatyaWebsiteFooterPage {
	
	public KatyaWebsiteFooterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
      @FindBy(xpath = "//a[@class ='search-text'][contains(text(),'Search for a topic...')]")
	  public WebElement searchForATopic;
      
      @FindBy(xpath = "//a[@href ='/us/en/coronavirus-update-center/overview'][contains(text(),'Coronavirus')]")
	  public WebElement coronavirus;
      
      
      @FindBy(xpath = "//input[@class='form-control mb-2 mb-sm-0 custom-search-color']")
	  public WebElement searchWindow;
      
      @FindBy(xpath = "//a[@class='popular-list-1']")
	  public WebElement help;
      
      @FindBy(xpath = "//ul[@class='d-none d-md-block']/li[1]/a")
	  public WebElement aboutUs;
      
      @FindBy(xpath = "//ul[@class='d-none d-md-block']/li[2]/a")
	  public WebElement career;
      
      @FindBy(xpath = "//a[@class='btn btn-danger btn-primary-cta btn-block btn-default']")
	  public WebElement searchCareer;
      
      @FindBy(xpath = "//div[@class='row ng-star-inserted']//div[2]/ul[2]/li[2]/a")
	  public WebElement tweetUs;
      
      @FindBy(xpath = "//div[@class='row ng-star-inserted']//div[4]/ul[2]/li[1]/a")
	  public WebElement customerCommitment;
      
      @FindBy(xpath = "//a[@class='nav-item first-item']")
	  public WebElement termsOfUse;
      
      @FindBy(xpath = "//a[@class='facebook circle-outline picturefill-background ng-star-inserted']")
	  public WebElement facebook;
      
      @FindBy(xpath = "//a[@class='btn-extsite btn btn-danger rounded-0']")
	  public WebElement yesContinueToSite;
      
    
      
    
      
      
    
      
      
      
      
    

    
	
	
	
	
	
	
	
	
	
	

}
