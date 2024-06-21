package functional.drivers;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.drivers.pages.DriversPages;
import functional.login.pages.LoginPages;
import functional.truck.pages.TruckPages;


public class Drivers extends DriversPages{
	//com.relevantcodes.extentreports.ExtentTest Test = extent.startTest("getemai)");
	static Logger log = Logger.getLogger(TruckPages.class.getName());

	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */
	DriversPages driverpage = null; 



	public Drivers(WebDriver driver){
		driverpage = new DriversPages();


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
	

	public void createDriver() throws InterruptedException, IOException   {
    	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("driver");
         boolean adminverification =driverpage.addDrivers();

	
	if(adminverification){
	     test.log(LogStatus.PASS, "driver created sucessfully");
	     Reporter.log("driver created sucessfully");
        }
	else{
	     test.log(LogStatus.FAIL, "driver not created ");

		}
	}
	
	public void basicDriverDetails() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("DriverDetails");
	        boolean adminverification =driverpage.addDriverDetails();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Driver details  added ");
		     Reporter.log("Driver details  added");
	       }
		else{
		     test.log(LogStatus.FAIL, "Driver details not  added ");

			}
		}
	
	public void selectDriverImage() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
	        boolean adminverification =driverpage.addDriverImage();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Driver image uploaded ");
		     Reporter.log("Driver image uploaded");
	       }
		else{
		     test.log(LogStatus.FAIL, "Driver image not uploaded ");

			}
		}
	
	public void saveAddedDriver() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
	        boolean adminverification =driverpage.saveDriver();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "driver saved sucessfully ");
		     Reporter.log("Driver saved sucessfully");
	       }
		else{
		     test.log(LogStatus.FAIL, "Driver not saved sucessfully ");
		     Reporter.log("Driver not saved sucessfully");

			}
		}
	
	public void selectTruckType() throws InterruptedException, IOException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckType");
	        boolean adminverification =driverpage.addTrucksType();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck type selected ");
		     Reporter.log("Truck type selected");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck type not selected ");

			}
		}
	
	
	public void mobilenumbers() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("DriverDetails");
	        boolean adminverification =driverpage.addMobileNo();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Driver mobile  added ");
		     Reporter.log("Driver mobile  added");
	       }
		else{
		     test.log(LogStatus.FAIL, "Driver mobile not  added ");

			}
		}
	
	
}
