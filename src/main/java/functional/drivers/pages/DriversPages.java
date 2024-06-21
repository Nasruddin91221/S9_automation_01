package functional.drivers.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import functional.drivers.pageobjects.DriversPageObjects;
import functional.login.pageobjects.LoginPageObjects;
import functional.truck.pageobjects.TruckPageObjects;
import com.github.javafaker.Faker;

public class DriversPages extends DriversPageObjects {
	static com.aventstack.extentreports.ExtentReports report;
	static ExtentTest test;


	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */

	static Logger log = Logger.getLogger(DriversPages.class.getName());

	public DriversPages() {

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

	public boolean addDrivers() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
        AddDriverButton.click();
	    Thread.sleep(5000);
		String pt=pagetitle.getText();
       
       
   if(pt.contains("Driver Profile")){
		   Thread.sleep(3000);
		   log.info("navigated to add driver page " +pt);
			test.log(LogStatus.INFO, "navigated to add driver page"+pt);
			Reporter.log("navigated to add driver page" +pt);
		       }

       
       return true;
	
	}

	
	public boolean addTrucksType() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
        selecttruck.click();
       List<WebElement> tc = choosettruck;
		int count = tc.size();

		
		for (int j = 0; j < count; j++) {
			String texts = choosettruck.get(j).getText();
    		log.info("truck type opens"+texts);
    		if (texts.contains("ABC45EFG")) {
				
				Thread.sleep(5000);
				choosettruck.get(j).click();
				Thread.sleep(5000);
				break;

			}
			
		}

		return true;
	}
	
	public boolean addDriverImage() throws  InterruptedException, IOException, AWTException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("DriverImage");
        Thread.sleep(5000);
        driverimage.click();
        //truckimage.sendKeys("\"D:\\redminote10Tjan24\\DCIM\\Camera\\IMG_20231103_051837.jpg");
    
       // WebDriverWait wait = new WebDriverWait(driver, 10);
       // WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(truckimage));

        // Provide the path of the image file to be uploaded
       // String imagePath = "D:\\redminote10Tjan24\\DCIM\\Camera\\IMG_20231103_051837.jpg";
       // fileInput.sendKeys(imagePath);
        Robot rb = new Robot();
     	rb.setAutoDelay(2000);
     	StringSelection str = new StringSelection("D:\\redminote10Tjan24\\DCIM\\Camera\\IMG_20231103_051837.jpg");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     	rb.setAutoDelay(2000);

          // press Contol+V for pasting
         rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
         rb.keyPress(java.awt.event.KeyEvent.VK_V);

     	rb.setAutoDelay(2000);

      
         // release Contol+V for pasting
       
         rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
         rb.keyRelease(java.awt.event.KeyEvent.VK_V);
     	rb.setAutoDelay(2000);

         // for pressing and releasing Enter
         rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
         rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        return true;
      
	
	}
	public boolean saveDriver() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
        Thread.sleep(25000);
       
        savedriver.click();
	    Thread.sleep(10000);
		String pt=driver.getCurrentUrl();
       
       
   if(pt.contains("drivers")){
		   Thread.sleep(3000);
		   log.info("navigated to add driver page " +pt);
			test.log(LogStatus.INFO, "navigated to add driver page"+pt);
			Reporter.log("navigated to add driver page" +pt);
		       }

       return true;
	
	}
	
	public boolean addDriverDetails() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
        Faker faker = new Faker();
       
        String dn = faker.name().fullName();
        String em = faker.internet().emailAddress();
        String ad = faker.address().fullAddress();
        String cy = faker.address().city();
        String pc = faker.address().zipCode();
        String dl = faker.numerify("ABC##EFG");

        
        drivername.sendKeys(dn);
        email.sendKeys(em);
        driverlicence.sendKeys(dl);
        contactname.sendKeys(dn);
        contactemail.sendKeys(em);
        addressline.sendKeys(ad);
        area.sendKeys(ad);
        city.sendKeys(cy);
        state.sendKeys(cy);
        pincode.sendKeys(pc);


        
       return true;
	
	}
	
	public boolean addMobileNo() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Driver");
        Faker faker = new Faker();
       
        String dn = faker.number().digits(10);
        
        mobileno.sendKeys(dn);
        sendOTP.click();
	    Thread.sleep(10000);
	    String cn=codenumber.getText();
	    log.info("code number generated " +cn);
		test.log(LogStatus.INFO, "code number generated"+cn);
        String value = cn;
        String trimmedValue = value.substring("Code: ".length());
        log.info("code number generated after trim" +trimmedValue);
		test.log(LogStatus.INFO, "code number generated after trim"+trimmedValue);
		otp1.sendKeys(trimmedValue);



        
       return true;
	
	}
	

	}


					   
					  
                     
				    

