package functional.drivers.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import functional.dasboard.Dashboards;
import functional.drivers.Drivers;
import functional.login.Login;
import functional.login.pages.LoginPages;
import functional.truck.Truck;

@Test
public class Driver001_Create_Driver extends BaseTest{


	@Test

	public  void truckCreate() throws IOException, InterruptedException, AWTException 
    {
	
		// WebDriver driver=capabilities();
		Login login = PageFactory.initElements(driver, Login.class);
		Dashboards dash = PageFactory.initElements(driver, Dashboards.class);
		Truck truck = PageFactory.initElements(driver, Truck.class);
		Drivers dr = PageFactory.initElements(driver, Drivers.class);



		
		login.loginVerification();
		dash.driverVerification();
		dr.createDriver();
		dr.mobilenumbers();
		dr.basicDriverDetails();
		dr.selectTruckType();
		dr.selectDriverImage();
		dr.saveAddedDriver();
		
		
		 		
    }
	
	

}

