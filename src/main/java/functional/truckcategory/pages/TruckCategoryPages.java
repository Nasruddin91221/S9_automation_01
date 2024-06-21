package functional.truckcategory.pages;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import functional.login.pages.LoginPages;
import functional.truckcategory.pageobjects.TruckCategoryPageObjects;

public class TruckCategoryPages extends TruckCategoryPageObjects  {

	public TruckCategoryPages() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	static Logger log = Logger.getLogger(LoginPages.class.getName());
	
	 
	public boolean addCategory() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TruckCategory Page ");
        Thread.sleep(5000);
       
	    Add.click();
//	    password.sendKeys(password());
//	    login.click();
//	    Thread.sleep(10000);
//		String url=driver.getCurrentUrl() ;
//       
//       
//   if(url.contains("dashboard")){
//		   Thread.sleep(3000);
//		   log.info("navigated to dashboard " +url);
//			test.log(LogStatus.INFO, "navigated to dashboard"+url);
//			Reporter.log("navigated to dashboard" +url);
//		       }
   return true;


	
	}


}
