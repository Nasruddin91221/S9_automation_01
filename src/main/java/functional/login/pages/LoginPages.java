package functional.login.pages;


import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import functional.login.pageobjects.LoginPageObjects;

public class LoginPages extends LoginPageObjects {
	static com.aventstack.extentreports.ExtentReports report;
	static ExtentTest test;


	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */

	static Logger log = Logger.getLogger(LoginPages.class.getName());

	public LoginPages() {

		super(driver);
	}

	/**
	 * Selects the 'MY ACCOUNT' option from the header navigation ribbon.<br>
	 * <br>
	 * This is expected to display the list of options directly below (no page
	 * navigation).
	 * @throws IOException
	 */

	
	

	private void reportVP(String string, String pass, String string2) {
		// TODO Auto-generated method stub

	}

	public boolean adminLogin() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("loginpage");
        Thread.sleep(5000);
       
	    username.sendKeys(username());
	    password.sendKeys(password());
	    login.click();
	    Thread.sleep(10000);
		String url=driver.getCurrentUrl() ;
       
       
   if(url.contains("dashboard")){
		   Thread.sleep(3000);
		   log.info("navigated to dashboard " +url);
			test.log(LogStatus.INFO, "navigated to dashboard"+url);
			Reporter.log("navigated to dashboard" +url);
		       }
   return true;


	
	}


					     }
					  
                     
				    

