package functional.login;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.login.pages.LoginPages;


public class Login extends LoginPages{
	//com.relevantcodes.extentreports.ExtentTest Test = extent.startTest("getemai)");
	static Logger log = Logger.getLogger(LoginPages.class.getName());

	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */
	LoginPages loginpage = null; 



	public Login(WebDriver driver){
		loginpage = new LoginPages();


	}
	
	/**
	 * Selects the 'MY ACCOUNT' option from the header navigation ribbon.<br>
	 * <br>
	 * This is expected to display the list of options directly below (no page
	 * navigation).
	 * @throws InterruptedException 
	 * 
	 * @throws IOException
	 */
	

	public void loginVerification() throws InterruptedException, IOException   {
    	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("loginVerification");
         boolean adminverification =loginpage.adminLogin();

	
	if(adminverification){
	     test.log(LogStatus.PASS, "navigated to dashboard");
	     Reporter.log("navigated to dashboard");
        }
	else{
	     test.log(LogStatus.FAIL, "not navigated to dashboard");

		}
	}
}
