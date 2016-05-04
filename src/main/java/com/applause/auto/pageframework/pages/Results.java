package com.applause.auto.pageframework.pages;

import io.appium.java_client.AppiumDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.applause.auto.pageframework.locators.Locators;

public class Results {
	AppiumDriver _driver;
	List<WebElement> _webElementList = new ArrayList<WebElement>();

	public Results(AppiumDriver driver) {
		this._driver = driver;
	}

	/**
	 * @author Nicolas Mori
	 * @param null
	 * @return true in case you receive more 1 item, or false in case you
	 *         receive a quantity minor of 1.
	 * @Description This method is used for check if in the result you receive
	 *              multiple results.
	 * @Location Result Page.
	 * @App com.wholefoods.wholefoodsmarket.apk
	 */
	public boolean checkIfMultipleResultsAreDisplayed() {
		_webElementList = _driver.findElements(By
				.id(Locators.Results.ITEM_NAME));

		if (_webElementList.size() > 1) {
			return true;
		} else {
			return false;
		}
	}
}