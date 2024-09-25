package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.TextBox;
import common.TestDataHandler2;

public class MercuryToursHomePage extends PageBase {
	
	private static TextBox _textboxFirstName = new TextBox("First Name", By.id("q"));
	
	public static void typeFirstName(TestDataHandler2 testData) {
		ReportLog.setTestStep("Input value in First name field");			// Test Step Name
//		_textboxFirstName.type(testData.FirstName);
	}

}
