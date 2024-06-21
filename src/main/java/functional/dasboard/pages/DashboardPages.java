package functional.dasboard.pages;


import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import functional.dashboard.pageobjects.DashboardPageObjects;
import functional.login.pageobjects.LoginPageObjects;
import functional.login.pages.LoginPages;

public class DashboardPages extends DashboardPageObjects {
	static com.aventstack.extentreports.ExtentReports report;
	static ExtentTest test;


	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */

	static Logger log = Logger.getLogger(DashboardPages.class.getName());
 	public DashboardPages() {

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

	public boolean selectTruck() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
      
	    Trucks.click();
	    chooseTruck.click();	   
	    Thread.sleep(10000);
		String url=driver.getCurrentUrl() ;
       
       
   if(url.contains("trucks")){
		   Thread.sleep(3000);
		   log.info("navigated to trucks page " +url);
			test.log(LogStatus.INFO, "navigated to trucks page"+url);
			Reporter.log("navigated to trucks page" +url);
		       }
   return true;


	
	}
	public boolean selectDrivers() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
        Thread.sleep(5000);
      
        drivers.click();	   
	    Thread.sleep(10000);
		String url=driver.getCurrentUrl() ;
       
       
   if(url.contains("drivers")){
		   Thread.sleep(3000);
		   log.info("navigated to trucks page " +url);
			test.log(LogStatus.INFO, "navigated to trucks page"+url);
			Reporter.log("navigated to trucks page" +url);
		       }
   return true;


	
	}
	
	
	public boolean selectTruckCategory() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
      
	    Trucks.click();
	    TrucksCategory.click();	   
	    Thread.sleep(10000);
		String url=driver.getCurrentUrl() ;
       
       
   if(url.contains("trucks")){
		   Thread.sleep(3000);
		   log.info("navigated to trucks page " +url);
			test.log(LogStatus.INFO, "navigated to trucks page"+url);
			Reporter.log("navigated to trucks page" +url);
		       }
   return true;


	
	}


					     }
					  
                     
				    

