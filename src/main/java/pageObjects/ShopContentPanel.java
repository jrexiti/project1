package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {

	WebDriver driver;

	ShopContentPanel(WebDriver driver) {
		this.driver = driver;
	}

	By continueShoppingBtn = By.xpath("//buton[contains(),'Continue']");

	public WebElement getContinueShoppingBtn() {
		return driver.findElement(continueShoppingBtn);
	}
}
