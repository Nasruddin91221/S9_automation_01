package functional.dasboard;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.dasboard.pages.DashboardPages;
import functional.login.pages.LoginPages;


public class Dashboards extends DashboardPages{
	//com.relevantcodes.extentreports.ExtentTest Test = extent.startTest("getemai)");
	static Logger log = Logger.getLogger(Dashboards.class.getName());

	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */
	DashboardPages db = null; 



	public Dashboards(WebDriver driver){
		db = new DashboardPages();


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
	

	public void truckVerification() throws InterruptedException, IOException   {
    	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("truck");
         boolean verification =db.selectTruck();

	
	if(verification){
	     test.log(LogStatus.PASS, "navigated to truck page");
	     Reporter.log("navigated to truck page");
        }
	else{
	     test.log(LogStatus.FAIL, "not navigated to truck page");

		}
	}
	
	public void driverVerification() throws InterruptedException, IOException   {
   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("driver");
        boolean verification =db.selectDrivers();

	
	if(verification){
	     test.log(LogStatus.PASS, "navigated to truck page");
	     Reporter.log("navigated to truck page");
       }
	else{
	     test.log(LogStatus.FAIL, "not navigated to truck page");

		}
	}
	public void truckCategoryVerification() throws InterruptedException, IOException   {
   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("truck");
        boolean verification =db.selectTruckCategory();

	
	if(verification){
	     test.log(LogStatus.PASS, "navigated to truckCategory page");
	     Reporter.log("navigated to truck page");
       }
	else{
	     test.log(LogStatus.FAIL, "not navigated to truckCategory page");

		}
	}
}
