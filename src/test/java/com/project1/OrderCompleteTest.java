package com.project1;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@Test
	// creating objects of pages to interact with the locator, again the driver
	// passed in the constructors is coming from the base page
	public void endToEndTest() {
		HomePage home = new HomePage(driver);
		home.getTestStoreLink().click();

		ShopHomePage shopHome = new ShopHomePage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(shopHome.getProductEight()));
		
	

		/// you get the idea.......

	}

}
