package functional.login.pageobjects;

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


	public abstract class LoginPageObjects extends BaseTest {
		
		
		
		public LoginPageObjects(WebDriver driver){
			BaseTest.driver=driver;
			
			PageFactory.initElements(driver,this); 
			
		}

		
		
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='username']") 
		protected
		WebElement username;
		
		@FindBy(how=How.XPATH,using="//input[@formcontrolname='password']") 
		protected
		WebElement password;
		
		@FindBy(how=How.XPATH,using="//button[normalize-space()='Login']") 
		protected
		WebElement login;
		
		public Properties getpropertyObject() throws IOException
		{
	        
		   FileReader reader=new FileReader(System.getProperty("user.dir")+ File.separator + "src/main/java/functional/login/data" + File.separator +"login.properties"); 

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
	

