package finalexam;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.Button;
import auto.framework.web.CheckBox;
import auto.framework.web.Link;
import auto.framework.web.ListBox;
import auto.framework.web.RadioButton;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler2;
import common.WebDriverHandler;

public class VIA_AutomobileValidInput extends TestBase {

	
	private Link _linkAutomobile = new Link("Automobile Tab", By.xpath("(//a[@id=\"nav_automobile\"])[1]"));
	private TextBox _textboxDateManu = new TextBox("Date of Manufacture", By.xpath("//input[@id=\"dateofmanufacture\"]"));
	private ListBox _listboxNumSeats= new ListBox("Date of Manufacture", By.xpath("//select[@id=\"numberofseats\"]"));
	private Button _buttonNext = new Button("Next Button", By.xpath("//button[@id=\"nextenterinsurantdata\"]"));
	
	private RadioButton _radiobuttonMale = new RadioButton("Male Radio Button", By.xpath("//input[@id=\"gendermale\"]/.."));
	private CheckBox _checkboxSpeeding = new CheckBox("Speeding", By.xpath("//input[@id=\"speeding\"]/.."));
	
	private TestDataHandler2 testData;
	
	@Override
	@BeforeTest
	public void startTest(ITestContext context) throws IOException {
		WebDriverHandler.startTestMethod(context);
	}

	// @BeforeTest
	// public void beforeTest() throws Exception {
	// 	testData = TestDataHandler2.loadTestData("Sheet1", "Row='VIA_AutomobileValidInput'");
	// 	WebControl.open(testData.URL);
	// }
	
	@Test
	public void validateInputInSpecialFields() throws Exception {
		testData = TestDataHandler2.loadTestData("Sheet1", "Row='VIA_AutomobileValidInput'");
		WebControl.open(testData.URL);
		ReportLog.setTestName("Vehicle Insurance Application");
		ReportLog.setTestCase("Automobile Insurance Quotation");
		
		ReportLog.setTestStep("Click Automobile tab and wait page to load.");
		WebControl.waitForPageToLoad(60);
		_linkAutomobile.waitForExist(true, 60);
		_linkAutomobile.click();
		WebControl.waitForPageToLoad(60);

		ReportLog.setTestStep("Type Date of Manufacture.");
		_textboxDateManu.waitForExist(true, 10);
		_textboxDateManu.type(testData.DateOfManufacture);
		
		ReportLog.setTestStep("Select Number of Seats.");
		_listboxNumSeats.selectByIndex(3);
		Thread.sleep(3000);
		
		ReportLog.setTestStep("Click Next button.");
		_buttonNext.click();

		ReportLog.setTestStep("Select Male as Gender.");
		_radiobuttonMale.waitForExist(true, 10);
		_radiobuttonMale.click();

		ReportLog.setTestStep("Check Speeding as Hobbies.");
		_checkboxSpeeding.waitForExist(true, 10);
		_checkboxSpeeding.check();
		Thread.sleep(3000);
	}
}
