package com.applause.auto.pageframework.pages;

import io.appium.java_client.AppiumDriver;

import com.applause.auto.framework.pageframework.devicecontrols.Button;
import com.applause.auto.framework.pageframework.devicecontrols.TextBox;
import com.applause.auto.pageframework.locators.Locators;

public class Home {

	AppiumDriver _driver;

	public Home(AppiumDriver driver) {
		this._driver = driver;
	}

	/**
	 * @author Nicolas Mori
	 * @param String
	 *            for send data to the App.
	 * @return null
	 * @Description This method is used for send data to a field into the home
	 *              page.
	 * @Location Home.
	 * @App com.wholefoods.wholefoodsmarket.apk
	 */
	public void writeIntoSearchField(String textToSearch) {
		TextBox searchField = new TextBox(Locators.Home.FIELD_TEXT);
		searchField.enterText(textToSearch);
	}

	/**
	 * @author Nicolas Mori
	 * @param null
	 * @return null
	 * @Description This method press click into the button search of the
	 *              homepage.
	 * @Location Home.
	 * @App com.wholefoods.wholefoodsmarket.apk
	 */
	public void clickInToButtonSearch() {
		Button buttonSearch = new Button(Locators.Home.BUTTON_SEARCH);
		buttonSearch.tap();
	}
}