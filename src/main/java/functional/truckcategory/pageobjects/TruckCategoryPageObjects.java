package functional.truckcategory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class TruckCategoryPageObjects extends BaseTest {

	public TruckCategoryPageObjects(WebDriver driver) {
		BaseTest.driver = driver;
//		
//		String tr = this + "><><><> this is this" ;
//		String tr1 = driver + "><><><> this is driver" ;
//		System.out.println(tr);
//		System.out.println(tr1);
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	protected WebElement Add;

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-2']")
	protected WebElement truckcategoryname;

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-3']")
	protected WebElement category_description;

	@FindBy(how = How.XPATH, using = "//img[@src='../../../assets/img/upload.svg']")
	protected WebElement UploadTruckImage;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add Truck Category']")
	protected WebElement AddTruckCategory;

}
