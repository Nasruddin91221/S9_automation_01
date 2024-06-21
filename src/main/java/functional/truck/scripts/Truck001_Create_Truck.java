package functional.truck.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import functional.dasboard.Dashboards;
import functional.login.Login;
import functional.login.pages.LoginPages;
import functional.truck.Truck;

@Test
public class Truck001_Create_Truck extends BaseTest{


	@Test

	public  void truckCreate() throws IOException, InterruptedException, AWTException 
    {
	
		// WebDriver driver=capabilities();
		Login login = PageFactory.initElements(driver, Login.class);
		Dashboards dash = PageFactory.initElements(driver, Dashboards.class);
		Truck truck = PageFactory.initElements(driver, Truck.class);


		
		login.loginVerification();
		dash.truckVerification();
		truck.createTruck();
		truck.basicTruckDetails();
		truck.selectTruckCategory();
		truck.selectTruckType();
		truck.selectTruckOwner();
		truck.selectTruckImage();
		truck.saveAddedTruck();
		
		
		 		
    }
	
	

}

