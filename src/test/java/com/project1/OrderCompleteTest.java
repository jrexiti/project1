package com.project1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.HomePage;
import pageObjects.ShopHomePage;

public class OrderCompleteTest extends BasePage {

	// calls the BasePage Constructor
	public OrderCompleteTest() throws IOException {
		super();
	}

	@BeforeTest

	// this driver is the driver coming from base page
	public void setup() throws InterruptedException, IOException {
		driver = getDriver();
		driver.get(getUrl());

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

	// creating objects of pages to interact with the locator, again the driver
	// passed in the constructor is coming from the base page
	@Test
	public void endToEndTest() {
		HomePage home = new HomePage(driver);
		home.getTestStoreLink().click();

		ShopHomePage shopHome = new ShopHomePage(driver);
		shopHome.getProductEight().click();

		/// you get the idea.......

	}

}
