package scenarios;

import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.WebControl;
import common.TestDataHandler;
import common.TestDataHandler2;
import common.WebDriverHandler;
import pageobjects.Guru99HomeTabPage;
import pageobjects.Guru99LoginPage;
import pageobjects.Guru99RequestQuotationPage;
import pageobjects.MercuryToursHomePage;

import org.testng.annotations.BeforeTest;
import org.testng.ITestContext;
import java.io.IOException;


public class Guru99_ValidLogin extends TestBase {
	@Override
	@BeforeTest
	public void startTest(ITestContext context) throws IOException {
		WebDriverHandler.startTestMethod(context);
	}

	@Test
	public void verifyRegistrationScenario() throws Exception {
		ReportLog.setTestName("Mercury Tours: Register and Sign In");		// Scenario Name
		ReportLog.setTestCase("Verify fill-up registration form");			// Test Case Nam
		ReportLog.setTestStep("Verify fill-up registration form");			// Test Case Nam
		
		//open browser
		WebControl.open("https://googlechromelabs.github.io/chrome-for-testing/");
		WebControl.waitForPageToLoad(60);
		
	}
}