package functional.login.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import functional.login.Login;
import functional.login.pages.LoginPages;

@Test
public class Login001_Validate_Admin_Login extends BaseTest{


	@Test

	public  void adminLogin() throws IOException, InterruptedException, AWTException 
    {
	
		// WebDriver driver=capabilities();
		Login login = PageFactory.initElements(driver, Login.class);

		
		login.loginVerification();
		
		 		
    }
	
	

}

