package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.web.ListBox;
import auto.framework.web.TextBox;
import common.TestDataHandler2;

public class MercuryToursRegistrationPage extends PageBase {


	private static TextBox _textboxFirstName = new TextBox("First Name", By.id("q"));

	private static ListBox _listboxSample = new ListBox("First Name", By.id("q"));
	
	public static void typeFirstName(TestDataHandler2 testData) {
//		_textboxFirstName.type(testData.FirstName);
	}

}
