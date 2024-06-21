package functional.dashboard.pageobjects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;


	public abstract class DashboardPageObjects extends BaseTest {
		
		
		
		public DashboardPageObjects(WebDriver driver){
			BaseTest.driver=driver;
			
			PageFactory.initElements(driver,this); 
			
		}

		
		
		
		@FindBy(how=How.XPATH,using="//div[.='Trucks']") 
		protected
		WebElement Trucks;
		
		@FindBy(how=How.XPATH,using="(//span[.='Trucks'])[2]") 
		protected
		WebElement chooseTruck;
		
		@FindBy(how=How.XPATH,using="//div[.='Drivers']") 
		protected
		WebElement drivers;
		
		@FindBy(how=How.XPATH,using="//span[normalize-space()='Trucks Category']") 
		protected
		WebElement TrucksCategory;
		
		@FindBy(how=How.XPATH,using="//span[.='Trucks'])[3]") 
		protected
		WebElement TrucksType;
		
		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
		protected
		WebElement  Loads ;
		
		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Drivers']") 
		protected
		WebElement  Drivers ;
		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
//		
//		@FindBy(how=How.XPATH,using="//h2[normalize-space()='Loads']") 
//		protected
//		WebElement  Loads ;
		
		
		
		
		

			}
	

