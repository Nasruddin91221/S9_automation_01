package functional.truck.pageobjects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public abstract class TruckPageObjects extends BaseTest {

	public TruckPageObjects(WebDriver driver) {
		BaseTest.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//button[.=' Add ']")
	protected WebElement AddTruckButton;

	@FindBy(how = How.XPATH, using = "//h3[.='Trucks Add']")
	protected WebElement pagetitle;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='truck_number']")
	protected WebElement trucknumber;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='truck_category']")
	protected WebElement truckcategory;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-0-panel']")
	protected List<WebElement> selecttruckcategory;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='truck_type']")
	protected WebElement trucktype;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-2-panel']")
	protected List<WebElement> selecttrucktype;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='truckowner_id']")
	protected WebElement truckowner;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-4-panel']")
	protected List<WebElement> selecttruckowner;

	@FindBy(how = How.XPATH, using = "//img[@src='../../../assets/img/profile-upload.svg']")
	protected WebElement truckimage;

	@FindBy(how = How.XPATH, using = "//button[.=' save ']")
	protected WebElement saveTruck;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='home_location']")
	protected WebElement homelocation;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='make_name']")
	protected WebElement makername;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='truck_model']")
	protected WebElement model;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='manufacture_year']")
	protected WebElement manfactureryear;

	public Properties getpropertyObject() throws IOException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + File.separator
				+ "src/main/java/functional/truck/data" + File.separator + "truck.properties");

		// FileReader reader=new
		// FileReader("D:\\ecilipsestaples\\Ecilipse\\ui-test-robustautomation\\src\\main\\java\\functional\\customer\\data\\customer.properties");

		Properties p = new Properties();
		p.load(reader);

		return p;

	}

	public String username() throws IOException {
		return getpropertyObject().getProperty("username");
	}

	public String password() throws IOException {
		return getpropertyObject().getProperty("password");
	}

}
