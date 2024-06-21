package functional.truckcategory.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import functional.dasboard.Dashboards;
import functional.login.Login;
import functional.truck.Truck;
import functional.truckcategory.truckCategory;

public class TruckCategory001_AddTruckCategory extends BaseTest{
	
	
	@Test

	public  void addTruckCategory() throws IOException, InterruptedException, AWTException 
    {
	
//		 WebDriver driver=capabilities();
		Login login = PageFactory.initElements(driver, Login.class);
		Dashboards dash = PageFactory.initElements(driver, Dashboards.class);
		truckCategory truckcategory = PageFactory.initElements(driver, truckCategory.class);

		
		login.loginVerification();
		dash.truckVerification();

//		dash.truckCategoryVerification();
//		truckcategory.addTruckCategory();
		
		 		
    }


}
