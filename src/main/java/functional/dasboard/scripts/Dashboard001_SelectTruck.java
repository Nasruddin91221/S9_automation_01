package functional.dasboard.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import functional.dasboard.Dashboards;
import functional.login.Login;
import functional.login.pages.LoginPages;

@Test
public class Dashboard001_SelectTruck extends BaseTest{


	@Test

	public  void truckSelection() throws IOException, InterruptedException, AWTException 
    {
	
		// WebDriver driver=capabilities();
		Login login = PageFactory.initElements(driver, Login.class);
		Dashboards dash = PageFactory.initElements(driver, Dashboards.class);

		
		login.loginVerification();
		dash.truckVerification();
		
		
    }
	
	

}

