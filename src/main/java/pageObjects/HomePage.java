package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By toggle = By.xpath("//a[@class='toggle']");
	By homePageLink = By.linkText("HOMEPAGE");
	By accordionPageLink = By.linkText("ACCORDION");
	By actionsPageLink = By.linkText("ACTIONS");
	By browserTabsLink = By.linkText("BROWSER TABS");
	By buttonsPageLink = By.linkText("BUTTONS");
	By calculatorPageLink = By.linkText("CALCULATOR (JS)");
	By contactUsPageLink = By.linkText("CONTACT US");
	By dataPickerPageLink = By.linkText("DATE PICKER");
	By dropDownPageLink = By.linkText("DROPDOWN CHECKBOX RADIO");
	By fileUploadPageLink = By.linkText("FILE UPLOAD");
	By hiddenElementPageLink = By.linkText("HIDDEN ELEMENT");
	By iFramesPageLink = By.linkText("IFRAMES");
	By loaderPageLink = By.linkText("LOADER");
	By loaderTwoPageLink = By.linkText("LOADER TWO");
	By loginPortalPageLink = By.linkText("LOGIN PORTAL TEST");
	By mouseMovementPageLink = By.linkText("MOUSE MOVEMENT");
	By popupsPageLink = By.linkText("POP UPS & ALERTS");
	By predictiveSearchPageLink = By.linkText("PREDICTIVE SEARCH");
	By tablesPageLink = By.linkText("TABLES");
	By testStorePageLink = By.linkText("TEST STORE");
	By aboutMePageLink = By.linkText("ABOUT ME");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getToggle() {
		return driver.findElement(toggle);
		
	}

}
