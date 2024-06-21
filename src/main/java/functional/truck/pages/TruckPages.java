package functional.truck.pages;


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
import functional.login.pageobjects.LoginPageObjects;
import functional.truck.pageobjects.TruckPageObjects;
import com.github.javafaker.Faker;

public class TruckPages extends TruckPageObjects {
	static com.aventstack.extentreports.ExtentReports report;
	static ExtentTest test;


	/**
	 * Create new LandingPage object with the given driver.<br>
	 * <br>
	 * Driver is passed through to the backing object class.
	 * 
	 * @param driver active driver to use for this page
	 */

	static Logger log = Logger.getLogger(TruckPages.class.getName());

	public TruckPages() {

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

	public boolean addTrucks() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
        Faker faker = new Faker();
        AddTruckButton.click();
	    Thread.sleep(10000);
		String pt=pagetitle.getText();
       
       
   if(pt.contains("Trucks Add")){
		   Thread.sleep(3000);
		   log.info("navigated to add truck page " +pt);
			test.log(LogStatus.INFO, "navigated to add truck page"+pt);
			Reporter.log("navigated to add truck page" +pt);
		       }
        String truckno = faker.numerify("ABC##EFG");

         trucknumber.sendKeys(truckno);
        

         Thread.sleep(5000);
       return true;
	
	}

	public boolean addTrucksCategory() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
       truckcategory.click();
       List<WebElement> tc = selecttruckcategory;
		int count = tc.size();

		
		for (int j = 0; j < count; j++) {
			String texts = selecttruckcategory.get(j).getText();
    		log.info("truck categry opens"+texts);
    		if (texts.contains("FullTruck")) {
				
				Thread.sleep(5000);
				selecttruckcategory.get(j).click();
				Thread.sleep(5000);
				break;

			}
			
		}

		return true;
	}
	public boolean addTrucksType() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(5000);
        trucktype.click();
       List<WebElement> tc = selecttrucktype;
		int count = tc.size();

		
		for (int j = 0; j < count; j++) {
			String texts = selecttrucktype.get(j).getText();
    		log.info("truck type opens"+texts);
    		if (texts.contains("38 Tons")) {
				
				Thread.sleep(5000);
				selecttrucktype.get(j).click();
				Thread.sleep(5000);
				break;

			}
			
		}

		return true;
	}
	public boolean addTrucksOwner() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TrucksOwner");
        Thread.sleep(5000);
        truckowner.click();
       List<WebElement> tc = selecttruckowner;
		int count = tc.size();

		
		for (int j = 0; j < count; j++) {
			String texts = selecttruckowner.get(j).getText();
    		log.info("truck owner opens"+texts);
    		if (texts.contains("Nasruddin")) {
				
				Thread.sleep(5000);
				selecttruckowner.get(j).click();
				Thread.sleep(5000);
				break;

			}
			
		}

		return true;
	}
	public boolean addTruckImage() throws  InterruptedException, IOException, AWTException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("TrucksImage");
        Thread.sleep(5000);
        truckimage.click();
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
	public boolean saveTruck() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Thread.sleep(25000);
       
        saveTruck.click();
	    Thread.sleep(10000);
		String pt=driver.getCurrentUrl();
       
       
   if(pt.contains("trucks")){
		   Thread.sleep(3000);
		   log.info("navigated to add truck page " +pt);
			test.log(LogStatus.INFO, "navigated to add truck page"+pt);
			Reporter.log("navigated to add truck page" +pt);
		       }

       return true;
	
	}
	
	public boolean addTrucksDetails() throws  InterruptedException, IOException  {
     	com.relevantcodes.extentreports.ExtentTest test = extent.startTest("Trucks");
        Faker faker = new Faker();
       
        String truckno = faker.numerify("ABC##EFG");
        String hl = faker.address().city();
        String mn = faker.company().name();
        String my = faker.number().digits(4);
       // String mo = faker.company().logo();


        homelocation.sendKeys(hl);
        makername.sendKeys(mn);
        model.sendKeys(mn);
        manfactureryear.sendKeys(my);

        
       return true;
	
	}
	

	}


					   
					  
                     
				    

