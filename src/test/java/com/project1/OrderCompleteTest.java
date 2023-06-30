package com.project1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.HomePage;
import pageObjects.ShopHomePage;

public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
	}

	@BeforeTest
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
	public void endToEndTest() {
		HomePage home = new HomePage(driver);
		home.getTestStoreLink().click();
		
		ShopHomePage shopHome = new ShopHomePage(driver);
		
		

	}

}
