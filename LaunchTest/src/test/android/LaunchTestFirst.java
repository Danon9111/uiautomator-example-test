package test.android;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
//import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import test.android.StartsMethods;

public class LaunchTestFirst extends UiAutomatorTestCase {   

	public void testDemo() throws UiObjectNotFoundException {   
      
		StartsMethods start = new StartsMethods();
		//start.simulateHomeButton();
		start.openAllAppsScreen();
		start.openAppsTab();
		start.swiping();
        UiObject addContactButton = new UiObject(
			   new UiSelector().resourceId("com.example.android.contactmanager:id/addContactButton")
		);
        addContactButton.clickAndWaitForNewWindow();
	   
        UiObject contactNameInput = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactNameEditText"
					   )
		);
        contactNameInput.setText("testujemy");
	   
        UiObject contactPhoneInput = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactPhoneEditText"
					   )
		);
        contactPhoneInput.setText("666777888");
        UiObject contactPhoneCategorySpinner = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactPhoneTypeSpinner"
					   )
		);
        contactPhoneCategorySpinner.click();
        UiObject selectPhoneLabelPanel = new UiObject(
			   new UiSelector().text("Mobile")
		);
        selectPhoneLabelPanel.click();
	   
        UiObject contactMailInput = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactEmailEditText"
					   )
		);
        contactMailInput.setText("test@wikia-inc.com");
        UiObject contactMailCategorySpinner = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactEmailTypeSpinner"
					   )
		);
        contactMailCategorySpinner.click();
        UiObject selectMailLabelPanel = new UiObject(
			   new UiSelector().text("Work")
		);
        selectMailLabelPanel.click();
	   
        UiObject saveButton = new UiObject(
			   new UiSelector().resourceId(
					   "com.example.android.contactmanager:id/contactSaveButton"
					   )
		);
        saveButton.clickAndWaitForNewWindow();
	         
        // Validate that the package name is the expected one
        UiObject settingsValidation = new UiObject(new UiSelector()
         	.packageName("android"));
        assertTrue("Unable", 
        	settingsValidation.exists());   
  }
}