package com.applause.auto.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applause.auto.framework.test.BaseAppiumTest;
import com.applause.auto.pageframework.pages.InitPages;
import com.applause.auto.pageframework.testdata.TestConstants;

public class TestSample extends BaseAppiumTest {

	@BeforeMethod(alwaysRun = true)
	public static void testSetup() {
	}

	@Test(groups = { TestConstants.TestNGGroups.REG }, description = "basic test of the app com.wholefoods.wholefoodsmarket")
	public void exercise() {
		InitPages.initialHomePage(driver).writeIntoSearchField(
				TestConstants.TestData.DATA);
		InitPages.initialHomePage(driver).clickInToButtonSearch();

		Assert.assertTrue(
				InitPages.initialResultPage(driver)
						.checkIfMultipleResultsAreDisplayed(),
				"The expected result is not completed, the automation detect give a quantity minor of 2 units.");
	}
}