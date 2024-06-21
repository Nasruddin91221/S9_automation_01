package functional.truck;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.login.pages.LoginPages;
import functional.truck.pages.TruckPages;


public class Truck extends TruckPages{
	//com.relevantcodes.extentreports.ExtentTest Test = extent.startTest("getemai)");
	static Logger log = Logger.getLogger(TruckPages.class.getName());

	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */
	TruckPages truckpage = null; 



	public Truck(WebDriver driver){
		truckpage = new TruckPages();


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
	

	public void createTruck() throws InterruptedException, IOException   {
    	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("truck");
         boolean adminverification =truckpage.addTrucks();

	
	if(adminverification){
	     test.log(LogStatus.PASS, "Truck created sucessfully");
	     Reporter.log("Truck created sucessfully");
        }
	else{
	     test.log(LogStatus.FAIL, "Truck not created ");

		}
	}
	public void selectTruckCategory() throws InterruptedException, IOException   {
   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckCategory");
        boolean adminverification =truckpage.addTrucksCategory();

	
	if(adminverification){
	     test.log(LogStatus.PASS, "Truck category selected ");
	     Reporter.log("Truck category selected");
       }
	else{
	     test.log(LogStatus.FAIL, "Truck category not selected ");

		}
	}
	public void selectTruckType() throws InterruptedException, IOException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckType");
	        boolean adminverification =truckpage.addTrucksType();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck type selected ");
		     Reporter.log("Truck type selected");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck type not selected ");

			}
		}
	public void selectTruckOwner() throws InterruptedException, IOException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckOwner");
	        boolean adminverification =truckpage.addTrucksOwner();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck owner selected ");
		     Reporter.log("Truck owner selected");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck owner not selected ");

			}
		}
	public void selectTruckImage() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckOwner");
	        boolean adminverification =truckpage.addTruckImage();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck image uploaded ");
		     Reporter.log("Truck image uploaded");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck image not uploaded ");

			}
		}
	public void saveAddedTruck() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckOwner");
	        boolean adminverification =truckpage.saveTruck();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck saved sucessfully ");
		     Reporter.log("Truck saved sucessfully");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck not saved sucessfully ");

			}
		}
	
	public void basicTruckDetails() throws InterruptedException, IOException, AWTException   {
	   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckDetails");
	        boolean adminverification =truckpage.addTrucksDetails();

		
		if(adminverification){
		     test.log(LogStatus.PASS, "Truck details  added ");
		     Reporter.log("Truck details  added");
	       }
		else{
		     test.log(LogStatus.FAIL, "Truck details not  added ");

			}
		}
}
