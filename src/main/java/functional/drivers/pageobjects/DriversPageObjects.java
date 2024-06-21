package functional.drivers.pageobjects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;


	public abstract class DriversPageObjects extends BaseTest {
		
		
		
		public DriversPageObjects(WebDriver driver){
			BaseTest.driver=driver;
			
			PageFactory.initElements(driver,this); 
			
		}

		
		
		
		@FindBy(how=How.XPATH,using="//button[.=' Add ']") 
		protected
		WebElement AddDriverButton;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='username']") 
		protected
		WebElement drivername;
		

		@FindBy(how=How.XPATH,using="//input[@formcontrolname='mobile']") 
		protected
		WebElement mobileno;
		
		@FindBy(how=How.XPATH,using="//a[normalize-space()='Send OTP']") 
		protected
		WebElement sendOTP;
		
		@FindBy(how=How.XPATH,using="//p[@class='ng-star-inserted']") 
		protected
		WebElement codenumber;
		
		@FindBy(how=How.XPATH,using="//input[@autocomplete='one-time-code']") 
		protected
		WebElement otp1;
		
		@FindBy(how=How.XPATH,using="(//input[@autocomplete='one-time-code'])[2]") 
	    protected 
	    List<WebElement> otp2;
		
		@FindBy(how=How.XPATH,using="(//input[@autocomplete='one-time-code'])[3]") 
		protected
		WebElement otp3;
		
		@FindBy(how=How.XPATH,using="(//input[@autocomplete='one-time-code'])[4]") 
	    protected 
	    List<WebElement> otp4;
		
		@FindBy(how=How.XPATH,using="(//input[@autocomplete='one-time-code'])[5]") 
		protected
		WebElement otp5;
		
		@FindBy(how=How.XPATH,using="(//input[@autocomplete='one-time-code'])[6]") 
	    protected 
	    List<WebElement> otp6;
		
		@FindBy(how=How.XPATH,using="//ng-otp-input[position()=1]") 
	    protected 
	    WebElement otp;
		
		@FindBy(how=How.XPATH,using="//h3[.='Driver Profile']") 
	    protected 
	    WebElement pagetitle;

		@FindBy(how=How.XPATH,using="//input[@formcontrolname='home_location']") 
		protected
		WebElement homelocation;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='make_name']") 
		protected
		WebElement makername;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='truck_model']") 
		protected
		WebElement model;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='manufacture_year']") 
		protected
		WebElement manfactureryear;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='email']") 
		protected
		WebElement email;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='name']") 
		protected
		WebElement contactname;
		
		@FindBy(how=How.XPATH,using="(//input[@formcontrolname='email'])[2]") 
		protected
		WebElement contactemail;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='address_line']") 
		protected
		WebElement addressline;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='area']") 
		protected
		WebElement area;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='city']") 
		protected
		WebElement city;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='state']") 
		protected
		WebElement state;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='pincode']") 
		protected
		WebElement pincode;
		
		@FindBy(how=How.XPATH,using="//button[normalize-space()='save']") 
		protected
		WebElement savedriver;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='driving_license_number']") 
		protected
		WebElement driverlicence;
		
		@FindBy(how=How.XPATH,using="//img[@src='../../../assets/img/plus.svg']") 
		protected
		WebElement driverimage;
		
		@FindBy(how=How.XPATH,using="//mat-select[.='Select truck']") 
		protected
		WebElement selecttruck;
		
		@FindBy(how=How.XPATH,using="//div[@aria-multiselectable='false']") 
		protected
		List<WebElement> choosettruck;
		
		
		public Properties getpropertyObject() throws IOException
		{
	        
		   FileReader reader=new FileReader(System.getProperty("user.dir")+ File.separator + "src/main/java/functional/truck/data" + File.separator +"truck.properties"); 

		   //FileReader reader=new FileReader("D:\\ecilipsestaples\\Ecilipse\\ui-test-robustautomation\\src\\main\\java\\functional\\customer\\data\\customer.properties");  
		      
		    Properties p=new Properties();  
		    p.load(reader);  
		    
		    return p;
		    
		   }




		public  String username() throws IOException
		{
			return getpropertyObject().getProperty("username");
		}

		public  String password() throws IOException
		{
			return getpropertyObject().getProperty("password");
		}	

			}
	

