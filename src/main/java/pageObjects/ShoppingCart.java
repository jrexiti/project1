package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	WebDriver driver;

	ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}

	By havePromo = By.cssSelector(".promo-code-button .collapse-button");

	public WebElement getHavePromo() {

		return driver.findElement(havePromo);
	}
}
