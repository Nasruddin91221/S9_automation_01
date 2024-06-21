package functional.truckcategory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.truck.pages.TruckPages;
import functional.truckcategory.pages.TruckCategoryPages;

public class truckCategory extends TruckCategoryPages{
	
	truckCategory truckcategory = null; 



	public truckCategory(){
		truckcategory = new truckCategory();


	}

	
	
	
	public boolean addTruckCategory() throws InterruptedException, IOException   {
   	 com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckCategoryName");
        boolean verification =truckcategory.addCategory();
//        		db.selectTruck();
	
	if(verification){
	     test.log(LogStatus.PASS, "navigated to TruckCategoryName Field");
	     Reporter.log("navigated to truck page");
       }
	else{
	     test.log(LogStatus.FAIL, "not navigated to TruckCategoryName Field");

		}
	return verification;
	}
	
	
	
	

}
