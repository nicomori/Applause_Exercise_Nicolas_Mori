package com.applause.auto.pageframework.pages;

import io.appium.java_client.AppiumDriver;

public class InitPages {
	/**
	 * @author Nicolas Mori
	 * @param AppiumDriver
	 * @return Home
	 * @Description This method is used for , this is necesary for send this
	 *              driver to the page Home, and execute all the methods.
	 * @Location InitPages
	 * @App com.wholefoods.wholefoodsmarket.apk
	 */
	public static Home initialHomePage(AppiumDriver driver) {
		Home newPage = new Home(driver);
		return newPage;
	}

	/**
	 * @author Nicolas Mori
	 * @param AppiumDriver
	 * @return Results
	 * @Description This method is used for , this is necesary for send this
	 *              driver to the page Results, and execute all the methods.
	 * @Location InitPages
	 * @App com.wholefoods.wholefoodsmarket.apk
	 */
	public static Results initialResultPage(AppiumDriver driver) {
		Results newPage = new Results(driver);
		return newPage;
	}
}